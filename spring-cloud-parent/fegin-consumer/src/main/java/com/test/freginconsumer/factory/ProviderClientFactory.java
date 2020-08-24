package com.test.freginconsumer.factory;

import com.test.freginconsumer.service.ProviderClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ProviderClientFactory implements FallbackFactory<ProviderClient> {

    public ProviderClient create(Throwable cause) {
        return new ProviderClient() {
            public String get(String num) {
                return "Feign调用失败";
            }
        };
    }
}
