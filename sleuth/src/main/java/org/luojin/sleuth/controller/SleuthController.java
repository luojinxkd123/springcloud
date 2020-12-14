package org.luojin.sleuth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-14 16:32
 */
@RestController
@RequestMapping("/sleuth")
public class SleuthController {
    @Autowired
    @GetMapping("/find")
    public String find() {

        return null;
    }
}
