package org.example.di;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component
public class test1 implements DI{

    public void test1(){
        System.out.println("test 1 constructor");
    }
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
