package org.luojin.cache.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/15 21:33
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private Integer gender;
}
