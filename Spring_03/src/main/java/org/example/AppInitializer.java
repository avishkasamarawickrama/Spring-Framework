package org.example;

import org.example.Config.AppConfig;
import org.example.bean.Boy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        Boy boy =context.getBean(Boy.class);
//        System.out.println(boy);
//        boy.chatWithGirl();

//        test2 test2 = context.getBean(test2.class);
//        test2.display();
//        context.registerShutdownHook();

    }
}
