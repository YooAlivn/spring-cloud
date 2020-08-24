package com.test.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.test.fegin.client")
public class FeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class);
    }
}
