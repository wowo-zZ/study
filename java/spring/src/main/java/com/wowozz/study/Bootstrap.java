package com.wowozz.study;

import com.wowozz.study.Config.AppConfig;
import com.wowozz.study.Config.ConcertConfig;
import com.wowozz.study.Components.Sword;
import com.wowozz.study.Components.Car;
import com.wowozz.study.Components.impl.Benz;
import com.wowozz.study.Concert.Performance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bootstrap
{
    public static void main(String... args) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
        // Performance performance = new Performance();
        Performance performance = (Performance) context.getBean("performance");
        performance.perform();
        ((ConfigurableApplicationContext)context).close();
    }

    public static void main1(String... args) 
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