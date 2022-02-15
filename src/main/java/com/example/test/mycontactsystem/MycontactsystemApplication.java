package com.example.test.mycontactsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MycontactsystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(MycontactsystemApplication.class, args);
    }

}
