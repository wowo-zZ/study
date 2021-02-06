package com.wowozz.study;

import com.wowozz.study.Config.AppConfig;
import com.wowozz.study.Components.Sword;
import com.wowozz.study.Components.Car;
import com.wowozz.study.Components.impl.Benz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bootstrap
{
    public static void main(String... args) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Sword sword = (Sword) context.getBean("sword");
        sword.cut();
        sword.run();
        Car car = (Benz) context.getBean("germanyCar");
        car.run();
        ((ConfigurableApplicationContext)context).close();
    }
}