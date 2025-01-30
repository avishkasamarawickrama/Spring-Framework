package org.example;

import org.example.bean.MyConnection;
import org.example.bean.SpringBean;
import org.example.bean.TestBean1;
import org.example.bean.TestBean2;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        TestBean1 ref1 = context.getBean("testBean1" ,TestBean1.class);
        TestBean1 ref2 = context.getBean("testBean1" ,TestBean1.class);
        System.out.println(ref1);
        System.out.println(ref2);

        TestBean2 ref4 = context.getBean("testBean2" ,TestBean2.class);
        TestBean2 ref3 = context.getBean("testBean2" ,TestBean2.class);
        System.out.println(ref3);
        System.out.println(ref4);

        MyConnection ref5 =context.getBean("connection",MyConnection.class);
        MyConnection ref6 =context.getBean("connection",MyConnection.class);
        System.out.println(ref5);
        System.out.println(ref6);


        context.registerShutdownHook();


//        Object bean = context.getBean("springBean");
//        System.out.println(bean);
//        SpringBean bean1 =(SpringBean) context.getBean("springBean");
//        System.out.println(bean1);
//        TestBean1 testBean1 =context.getBean(TestBean1.class);
//        System.out.println(testBean1);
//
//        TestBean1 testBean3 =context.getBean(TestBean1.class);
//        System.out.println(testBean3);
//
//        TestBean2 testBean2 =context.getBean( "bean2", TestBean2.class);
//        System.out.println(testBean2);
//
//        MyConnection myConnection= context.getBean(MyConnection.class);
//        System.out.println(myConnection);
//
//        MyConnection getMyConnection= context.getBean( "getMyConnection", MyConnection.class);
//        System.out.println(getMyConnection);







//        SpringBean bean = context.getBean(SpringBean.class);
//        System.out.println(bean);
//        bean.testBean();
//
//
//        Runtime.getRuntime().addShutdownHook(new Thread(){
//
//            @Override
//            public void run() {
//                System.out.println("shutting down");
//                context.close();
//            }
//        });
//        TestBean1 testBean1 =context.getBean(TestBean1.class);
//        System.out.println(testBean1);
//
    }
}
