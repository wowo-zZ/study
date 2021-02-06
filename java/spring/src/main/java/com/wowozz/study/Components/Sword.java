package com.wowozz.study.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dev.properties")
public class Sword {

    private String swordName;

    @Autowired
    Environment env;

    @Autowired()
    @Qualifier("benz")
    Car car;
    
    public void cut()
    {
        System.out.println("this is sword " + env.getProperty("sword.name"));
    }

    public void run()
    {
        car.run();
    }
}
