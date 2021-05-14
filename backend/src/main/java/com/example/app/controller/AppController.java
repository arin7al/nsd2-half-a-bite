package com.example.app.controller;

import java.util.Collections;

import com.example.app.service.UserRolesInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.controller.dto.Response;
import com.example.app.service.AppService;
import lombok.extern.slf4j.Slf4j;

/** @author https://github.com/bipinthite */
@RestController
@RequestMapping("/v1/registration")
@Slf4j
public class AppController {

  @Autowired private AppService appService;
  @Autowired private UserRolesInitializer rolesInitializer;

  @GetMapping("/init")
  public Response initializeRoles() {
      rolesInitializer.initializeRoles();
      log.info("Roles initialized!");
      return Response.builder().statusCode("200").build();
  }

  @GetMapping("/register")
  public Response sayHello() {
    try {
      log.info("registering");

    } catch (Exception e) {

    }
    return Response.builder().statusCode("200").build();
  }
}
