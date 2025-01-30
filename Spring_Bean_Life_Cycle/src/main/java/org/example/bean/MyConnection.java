package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements BeanNameAware, BeanFactoryAware , ApplicationContextAware , InitializingBean ,DisposableBean {
    public MyConnection(){
        System.out.println("Myconnection object created.");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("my connection bean factory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Myconnection bean name set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("myconnection application context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing bean");
    }


    @Override
    public void destroy() throws Exception {
//implement by desposableBean
    }
}
