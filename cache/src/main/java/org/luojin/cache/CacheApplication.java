package org.luojin.cache;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/15 20:23
 */
@SpringBootApplication
@MapperScan("org.luojin.cache.mapper")
public class CacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);
    }
}
