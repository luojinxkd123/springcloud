package org.luojin.feign.feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-14 16:58
 */
@FeignClient(value = "apptest")
public interface TestAppFeign {
    @RequestMapping("feignUrl")
    public String feignUrl();
}

