package com.test.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerProvider2Application {
    public static void main(String[] args) {
        SpringApplication.run(ServerProvider2Application.class);
    }
}
