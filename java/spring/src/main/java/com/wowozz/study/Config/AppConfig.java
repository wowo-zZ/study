package com.wowozz.study.Config;

import com.wowozz.study.Components.Car;
import com.wowozz.study.Components.impl.Benz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wowozz.study")
public class AppConfig {
    @Bean
    public Car GermanyCar() {
        return new Benz();
    }
}
