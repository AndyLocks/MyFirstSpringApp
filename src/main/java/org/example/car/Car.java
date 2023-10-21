package org.example.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
@Scope("singleton")
public class Car {

    private Engine engine;

    @Autowired
    public Car(@Qualifier("standardEngine") Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    @PostConstruct
    private void init() {
        System.out.println("Car init");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Car is destroyed");
    }
}
