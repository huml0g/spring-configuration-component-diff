package com.example.config;

import com.example.demo.bean.HumBean;
import com.example.demo.config.HumConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HumConfiguration.class)
class HumConfigurationTests {

    @Autowired
    HumConfiguration humConfiguration;

    @Test
    void humBean_생성_메소드_계속_호출해서_가져와도_계속_같은_객체_인지_테스트() {
        HumBean humBean1 = humConfiguration.humBean();
        HumBean humBean2 = humConfiguration.humBean();

        Assertions.assertSame(humBean1, humBean2);
    }
}
