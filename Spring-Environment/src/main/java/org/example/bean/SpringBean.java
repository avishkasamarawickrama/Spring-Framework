package org.example.bean;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class SpringBean implements InitializingBean {

    @Value("${os.name}")
    private String osName;
    @Value("${USERDOMAIN}")
    private String logName;
    @Value("${database.user}")
    private String username;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(logName);
        System.out.println(username);
    }
}
