package org.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Qualifier("girl1")
    @Autowired
    Agreement girl1;
    public Boy() {
        System.out.println("boy");
    }

    public void chatWithGirl(){

        girl1.chat();
    }
}
