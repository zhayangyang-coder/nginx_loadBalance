package com.atguigu.nginx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Value("${server.port}")
    private int port;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "访问项目的服务器端口号port为" + port;
    }
}
