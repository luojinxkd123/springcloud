package org.luojin.app_provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-23 10:23
 */
@RestController
public class ProviderController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("getPort/{id}")
    public String getPort(@PathVariable Integer id) throws Exception{
        //Thread.sleep(3000);
        if (id > 0) {
            throw new Exception("哈哈哈");
        }
        return serverPort;
    }
}
