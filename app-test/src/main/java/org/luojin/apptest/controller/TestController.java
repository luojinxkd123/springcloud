package org.luojin.apptest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-14 16:42
 */
@RestController
public class TestController {
    @GetMapping("feignUrl")
    public String feignUrl() {
        return "feign调用app-test成功";
    }
}
