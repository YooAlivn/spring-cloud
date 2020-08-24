package com.test.freginconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.test.freginconsumer.service")
public class Application_Hystrix_Consumer {
    public static void main(String[] args) {
        SpringApplication.run(Application_Hystrix_Consumer.class);
    }
}
