package com.wowozz.study.Components.impl;

import com.wowozz.study.Components.Car;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
@Primary
public class Audi implements Car{
    
    public void run() {
        System.out.println("this is audi");
    }
}
