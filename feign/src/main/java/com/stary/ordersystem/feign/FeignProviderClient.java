package com.stary.ordersystem.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: jiakang stary1993@qq.com
 * @time: 2020/6/22 17:41
 */
@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/index")
    public String index();
}
