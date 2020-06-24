package com.stary.ordersystem.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: jiakang stary1993@qq.com
 * @time: 2020/6/24 16:06
 */

@RestController
@RequestMapping("/zipkin")
public class ZipkinClientController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return "端口号：" + this.port;
    }
}
