package com.wowozz.study;

import java.util.Arrays;

import com.wowozz.study.Config.AppConfig;
import com.wowozz.study.Components.Sword;

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
        ((ConfigurableApplicationContext)context).close();
    }
}