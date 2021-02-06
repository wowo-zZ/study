package com.wowozz.study.Components.impl;

import com.wowozz.study.Components.Car;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("dev")
public class Toyoto implements Car
{
    public void run() {
        System.out.println("This is toyoto car!");
    }
}
