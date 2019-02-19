package com.example.eurekaclient.demo.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhx
 * @date 2019/2/19
 */
@RestController
@RequestMapping(value = "zuulTest")
public class ZuulController {
    @GetMapping(value = "/zuulOpt")
    public String zuulOpt(){
        return "zuul路由转发[redis]";
    }
}
