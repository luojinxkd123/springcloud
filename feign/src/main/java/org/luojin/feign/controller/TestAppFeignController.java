package org.luojin.feign.controller;

import org.luojin.feign.feign_client.AppProviderFeign;
import org.luojin.feign.feign_client.TestAppFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-14 17:02
 */
@RestController
public class TestAppFeignController {
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private TestAppFeign testAppFeign;
    @Autowired
    private AppProviderFeign appProviderFeign;
    @GetMapping("getTestAppByFeign")
    public String getTestAppByFeign() {
        return testAppFeign.feignUrl();
    }
    @GetMapping("getappProviderFeign/{id}")
    public String getappProviderFeign(@PathVariable("id") Integer id){
        return "调用feign:"+serverPort+" --- provider:"+appProviderFeign.getPort(id);
    }
}
