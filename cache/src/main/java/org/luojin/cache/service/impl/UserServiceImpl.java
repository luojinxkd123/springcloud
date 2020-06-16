package org.luojin.cache.service.impl;

import org.luojin.cache.entity.User;
import org.luojin.cache.mapper.UserMapper;
import org.luojin.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/15 21:38
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Cacheable(cacheNames = "user",keyGenerator = "simpleKeyGenerator")
    public User getUser() {
        return userMapper.getUser();
    }
}
