package org.example.config;

import org.example.bean.Springbean1;
import org.example.bean.Springbean2;
import org.example.bean.Springbean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {

    @Bean
    public Springbean2 springbean2() {
        Springbean3 bean1 = springbean3();
        Springbean3 bean2 = springbean3();
        return new Springbean2();


    }
    @Bean
    public Springbean3 springbean3() {
        return new Springbean3();
    }
}



    //inter bean dependancy
//    @Bean
//    public Springbean1 getSpringbean1(){
//        Springbean2 springbeantwo = new Springbean2();
//        Springbean2 springbeanthree = new Springbean2();
//        return new Springbean1();
//    }
//    @Bean
//    public Springbean2 getSpringbean2(){
//        return new Springbean2();
//    }




