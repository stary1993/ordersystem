package com.stary.ordersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description:
 * @author: jiakang stary1993@qq.com
 * @time: 2020/6/24 9:03
 */
@SpringBootApplication
@EnableConfigServer
public class GitConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitConfigServerApplication.class , args);
    }
}
