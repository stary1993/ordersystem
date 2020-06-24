package com.stary.ordersystem.feign;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: jiakang stary1993@qq.com
 * @time: 2020/6/22 21:19
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String index() {
        return "系统出现故障，请稍后再试";
    }
}
