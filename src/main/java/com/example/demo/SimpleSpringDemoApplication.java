package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringDemoApplication.class, args);

        Logger logger = LoggerFactory.getLogger(SimpleSpringDemoApplication.class);
        logger.info("Hello World !!!");
    }
}
