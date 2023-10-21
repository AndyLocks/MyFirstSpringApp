package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
            TestBean testBean = context.getBean("testBean", TestBean.class);
            System.out.println(testBean.getName());
        }

    }
}
