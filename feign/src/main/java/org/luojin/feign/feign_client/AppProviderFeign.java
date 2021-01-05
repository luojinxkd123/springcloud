package org.luojin.feign.feign_client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.luojin.feign.feign_client.fallback.AppProviderFeignFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-23 10:35
 */
@FeignClient(value = "APP-PROVIDER", fallback = AppProviderFeignFallBack.class)
public interface AppProviderFeign {
    @GetMapping("getPort/{id}")
    //@LoadBalanced
    String getPort(@PathVariable("id") Integer id);

}
