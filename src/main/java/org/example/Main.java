package org.example;

import org.example.car.MegaEngine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.example.car.Car;

public class Main {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)){
            Car car = context.getBean("car", Car.class);
            System.out.println(car.getEngine().getName());
            System.out.println(car.getEngine().getSpeed());
            System.out.println(car.getEngine().getId());
        }
    }
}
