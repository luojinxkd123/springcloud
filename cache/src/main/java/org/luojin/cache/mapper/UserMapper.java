package org.luojin.cache.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.luojin.cache.entity.User;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/15 21:34
 */
@Mapper
public interface UserMapper {
    @Select("select * from t_user")
    User getUser();
}
