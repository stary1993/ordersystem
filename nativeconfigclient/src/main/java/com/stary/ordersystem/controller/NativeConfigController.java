package com.stary.ordersystem.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: jiakang stary1993@qq.com
 * @time: 2020/6/23 11:04
 */
@RestController
@RequestMapping("/native")
public class NativeConfigController {

    @Value("${server.port}")
    private String port;
    @Value("${version}")
    private String version;

    @GetMapping("/index")
    public String index() {
        return "port:" + this.port + " version:" +this.version;
    }
}
