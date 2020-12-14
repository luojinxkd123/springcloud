package org.luojin.feign.controller;

import org.luojin.feign.feign_client.TestAppFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-14 17:02
 */
@RestController
public class TestAppFeignController {
    @Autowired
    private TestAppFeign testAppFeign;
    @GetMapping("getTestAppByFeign")
    public String getTestAppByFeign() {
        return testAppFeign.feignUrl();
    }

}
