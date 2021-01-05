package org.luojin.feign.feign_client.fallback;

import org.luojin.feign.feign_client.AppProviderFeign;
import org.springframework.stereotype.Component;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-12-31 10:12
 */
@Component
public class AppProviderFeignFallBack implements AppProviderFeign {
    @Override
    public String getPort(Integer id) {
        return "服务繁忙或异常，请稍后再试";
    }

}
