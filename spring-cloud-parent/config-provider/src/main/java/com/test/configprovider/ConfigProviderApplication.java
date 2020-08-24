package com.test.configprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigProviderApplication.class);
    }
}
