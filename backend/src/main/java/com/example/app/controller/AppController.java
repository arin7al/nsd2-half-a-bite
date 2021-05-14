package com.example.app.controller;

import com.example.app.service.UserRolesInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.data.dto.Response;
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
  public Response registerAUser() {
    try {
      log.info("registering");

    } catch (Exception e) {

    }
    return Response.builder().statusCode("200").build();
  }

    @GetMapping("/get-user-info")
    public Response getUsers() {
        try {
            log.info("registering");

        } catch (Exception e) {

        }
        return Response.builder().statusCode("200").build();
    }
}
