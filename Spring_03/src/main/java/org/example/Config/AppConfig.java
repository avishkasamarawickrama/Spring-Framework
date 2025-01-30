package org.example.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

}