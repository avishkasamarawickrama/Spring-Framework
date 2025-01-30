package org.example.config;

import org.example.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
    @Bean
    public SpringBean springBean(){
        return new SpringBean();
    }
}
