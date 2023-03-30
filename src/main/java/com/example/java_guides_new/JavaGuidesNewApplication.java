package com.example.java_guides_new;

import com.example.java_guides_new.sub1.SpringComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavaGuidesNewApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext1 = SpringApplication.run(JavaGuidesNewApplication.class, args);
        SpringComponent springComponent = configurableApplicationContext1.getBean(SpringComponent.class);

        System.out.println(springComponent.getMessage());
        System.out.println("hi");

    }

}
