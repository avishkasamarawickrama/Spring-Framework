package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Springbean3 implements BeanNameAware, ApplicationContextAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("Spring bean3 " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
