package com.example.demo.config;

import com.example.demo.bean.HumBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HumConfiguration {

    @Bean
    public HumBean humBean() {
        return new HumBean();
    }
}
