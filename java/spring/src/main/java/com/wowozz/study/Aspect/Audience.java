package com.wowozz.study.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

    @Before("execution(** com.wowozz.study.Concert.Performance.perform(..))")
    public void silencePhones() {
        System.out.println("Sliencing the phones");
    }

    public void takeSeats() {
        System.out.println("Taking the seats");
    }


}
