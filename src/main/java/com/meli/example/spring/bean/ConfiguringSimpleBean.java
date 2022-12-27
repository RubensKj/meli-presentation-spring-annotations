package com.meli.example.spring.bean;

import com.meli.example.spring.bean.FakeBeanProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguringSimpleBean {

    @Bean
    public FakeBeanProperty setFakeBeanProperty() {
        return new FakeBeanProperty(
                "http://localhost:8080",
                "Bearer"
        );
    }
}
