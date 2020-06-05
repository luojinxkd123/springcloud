package org.luojin.apptest;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-06-05 10:24
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @GetMapping("/config/profile")
    public String hello() {
        return "调用成功";
    }
}
