package com.test.provider2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @RequestMapping("/getData")
    public String getData(){
        return "提供了数据2222";
    }
}
