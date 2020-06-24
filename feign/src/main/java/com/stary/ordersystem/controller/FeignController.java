package com.stary.ordersystem.controller;

import com.stary.ordersystem.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: jiakang stary1993@qq.com
 * @time: 2020/6/22 17:43
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
