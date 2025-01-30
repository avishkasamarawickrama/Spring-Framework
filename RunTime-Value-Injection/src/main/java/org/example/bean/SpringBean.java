package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }

    @Value("avi")
    private String name;

    public SpringBean(){
        System.out.println(name);
    }
//   // public SpringBean(){}
//   @Autowired(required = false)
//    public SpringBean(@Value("AVI") String name,@Value("1") int id) {
//        System.out.println(id);
//        System.out.println("spring bean   " +name);
//
//    }
//    @Autowired(required = false)
//    public SpringBean(@Value("AVI") String name,@Value("1") int id,@Value("true") boolean b) {
//        System.out.println(id);
//        System.out.println("spring bean   " +name);
//        System.out.println(b);
//    }
}
