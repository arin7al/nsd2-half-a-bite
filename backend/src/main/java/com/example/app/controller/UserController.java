package com.example.app.controller;

import com.example.app.model.User;
import com.example.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
//  @Autowired
//  private SecurityService securityService; TODO: implement

  @Autowired
  private UserService userService;

//  @Autowired
//  private UserValidator userValidator;

  @PostMapping(value = "/registration", produces = MediaType.APPLICATION_JSON_VALUE)
  public @ResponseBody User create(@RequestBody User user) {
//    userValidator.validate(user);// TODO
    userService.create(user);
//    return new ResponseEntity(HttpStatus.ACCEPTED);
    return userService.getUser(user.getEmail());
  }
}
