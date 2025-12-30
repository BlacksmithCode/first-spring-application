package org.example.spring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    public Car() {
        System.out.println("Car is created");
    }

    @Override
    public void startEngine() {
        System.out.println("Car is started");
    }
}
