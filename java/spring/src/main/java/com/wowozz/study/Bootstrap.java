package com.wowozz.study;

import java.util.Arrays;

import com.wowozz.study.Config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bootstrap
{
    public static void main(String... args) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Application application = new Application();
        application.run();
        ((ConfigurableApplicationContext)context).close();
    }
}