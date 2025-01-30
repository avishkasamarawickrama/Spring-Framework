package org.example.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Springbean1 implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("spring bean1 " +name );
    }

    @Bean
    public Springbean2 springbean2(){
        Springbean3 springbean31 =new Springbean3();
        Springbean3 springbean32 =new Springbean3();
        System.out.println(springbean31);
        System.out.println(springbean32);
        return new Springbean2();
    }
//    public Springbean1(){
//        System.out.println("spring bean 1 constructor.");
//    }
}
