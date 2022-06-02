package com.feignclientexample.demoservice.controller;

import com.feignclientexample.demoservice.util.FeignServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private FeignServiceUtil feignServiceUtil;

    @GetMapping("/user-name")
    public String getUserName() {
        return feignServiceUtil.getName();
    }
}
