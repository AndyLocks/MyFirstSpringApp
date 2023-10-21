package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.example.car.Car;

public class Main {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
            Car car = context.getBean("carBean", Car.class);
            System.out.println(car.getEngine().getName());
            System.out.println(car.getEngine().getSpeed());
        }

    }
}
