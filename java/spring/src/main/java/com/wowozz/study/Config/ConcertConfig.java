package com.wowozz.study.Config;

import com.wowozz.study.Aspect.Audience;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.wowozz.study")
public class ConcertConfig {
    
    @Bean
    public Audience audience() {
        return new Audience();
    }
}
