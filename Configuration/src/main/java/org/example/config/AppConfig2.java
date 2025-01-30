package org.example.config;

import org.example.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig2 {
    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }
}
