package org.example.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl2 implements Agreement {
    public Girl2() {
        System.out.println("girl 2");
    }

    public void chat() {
        System.out.println("girl 2 chatting....");
    }
}
