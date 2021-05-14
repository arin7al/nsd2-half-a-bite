package com.example.app.controller;

import com.example.app.controller.dto.Response;
import com.example.app.data.dto.User;
import com.example.app.service.AppService;
import com.example.app.validator.UserValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
//  @Autowired
//  private SecurityService securityService; TODO: implement

//  @Autowired
//  private UsersService usersService; TODO: implement

  @Autowired
  private UserValidator userValidator;

  @PostMapping(value = "/registration", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity create(@RequestBody User user) {

//    userValidator.validate(user);// TODO

    clientService.create(user);
    return new ResponseEntity(HttpStatus.ACCEPTED);
  }
}
