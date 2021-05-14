package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/** @author https://github.com/bipinthite */
@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(basePackages="com.example.app")
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
