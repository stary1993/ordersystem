package com.stary.ordersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: jiakang stary1993@qq.com
 * @time: 2020/6/22 17:15
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/index")
    public String index() {
        return restTemplate.getForObject("http://prodvider/index", String.class);
    }
}
