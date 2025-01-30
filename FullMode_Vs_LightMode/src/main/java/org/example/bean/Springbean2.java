package org.example.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;


public class Springbean2 implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("spring bean2" + name);
    }
    //    public Springbean2(){
//        System.out.println("spring bean 2 constructor");
//    }
}
