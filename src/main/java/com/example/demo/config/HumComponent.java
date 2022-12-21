package com.example.demo.config;

import com.example.demo.bean.HumBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HumComponent {

    @Bean
    public HumBean humBean() {
        return new HumBean();
    }
}
