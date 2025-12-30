package org.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.spring");
        Vehicle vehicle = context.getBean("car", Vehicle.class);
        vehicle.startEngine();
        context.close();
    }
}
