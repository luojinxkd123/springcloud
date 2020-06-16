package org.luojin.cache.controller;

import org.luojin.cache.entity.User;
import org.luojin.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020/6/15 21:31
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("getUser")
    public User getUser() {
        return userService.getUser();
    }
}
