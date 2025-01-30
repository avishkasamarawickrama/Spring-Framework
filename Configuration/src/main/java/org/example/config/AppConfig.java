package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
//root
@ImportResource("classpath:hibernate.xml")
//if not
//@ImportResource("file:absolute-path-of-hibernate.xml")
@Import(AppConfig1.class)
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {
}
