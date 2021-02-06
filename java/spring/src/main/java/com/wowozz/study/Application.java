package com.wowozz.study;

import org.springframework.beans.factory.annotation.Autowired;

import com.wowozz.study.Components.Sword;

public class Application {

    @Autowired
    Sword sword;
    
    public void run() 
    {
        sword.cut();
    }
}
