package com.test.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    //资源路径
    private final String url = "http://127.0.0.1:8001/provider/getData";

    @RequestMapping("getData")
    public String getData(){
        RestTemplate template = new RestTemplate();
        String data = template.getForObject(url, String.class);
        return data;
    }
}
