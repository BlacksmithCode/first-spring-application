package org.example.spring;

import org.springframework.stereotype.Component;

@Component
public class Motorbike implements Vehicle {

    public Motorbike() {
        System.out.println("Motorbike is created");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorbike is started");
    }
}
