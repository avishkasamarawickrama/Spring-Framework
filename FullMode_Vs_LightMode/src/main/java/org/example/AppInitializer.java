package org.example;


import org.example.bean.Springbean1;
import org.example.bean.Springbean2;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();


        Springbean2 bean1 =context.getBean(Springbean2.class);
        Springbean2 bean2 =context.getBean(Springbean2.class);
        System.out.println(bean1);
        System.out.println(bean2);

//        Springbean1 bean =context.getBean(Springbean1.class);
//        System.out.println(bean);
//        Springbean1 bean2 =context.getBean(Springbean1.class);
//        System.out.println(bean2);
//
//        Springbean2 bean3 =context.getBean(Springbean2.class);
//        System.out.println(bean3);
//        Springbean2 bean4 =context.getBean(Springbean2.class);
//        System.out.println(bean4);

        context.registerShutdownHook();
    }
}