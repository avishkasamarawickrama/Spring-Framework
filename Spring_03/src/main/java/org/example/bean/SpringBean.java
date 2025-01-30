package org.example.bean;

import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean {

    public SpringBean(){
        System.out.println("Spring bean object created");
    }
}
