package com.example.app.service;

import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

/** @author https://github.com/bipinthite */
@Service
@Slf4j
public class AppService {

  public String sayHello() {
    log.trace("Enter: sayHello()");
    boolean dummyError = System.currentTimeMillis() % 2 == 0;
    if (dummyError) {
      throw new RuntimeException("Something went wrong!");
    }
    return "Hello World!";
  }
}
