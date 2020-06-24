package com.stary.ordersystem.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: jiakang stary1993@qq.com
 * @time: 2020/6/22 16:37
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return "当前端口：" + this.port;
    }
}
