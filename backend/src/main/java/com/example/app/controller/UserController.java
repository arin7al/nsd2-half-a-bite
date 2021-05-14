package com.example.app.controller;

import com.example.app.controller.dto.Response;
import com.example.app.data.dto.User;
import com.example.app.service.AppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

//  @Autowired private Repository repository;

  @PostMapping(value = "/registration")
  public ResponseEntity<?> create( @RequestBody User user) {
    //TODO: Check user login in db, if exists - 409
    //return new ResponseEntity<>(HttpStatus.CONFLICT);
    clientService.create(client);
    return new RequestRe(HttpStatus.CREATED);
  }

  @GetMapping("/status")
  public Response registerUserAccount(UserDto accountDto, HttpServletRequest request) {
    log.debug("Registering user account with information: {}", accountDto);
    User registered = createUserAccount(accountDto);
    if (registered == null) {
      throw new UserAlreadyExistException();
    }
    String appUrl = "http://" + request.getServerName() + ":" +
            request.getServerPort() + request.getContextPath();

    eventPublisher.publishEvent(
            new OnRegistrationCompleteEvent(registered, request.getLocale(), appUrl));

    return new Response("success");
  }
}
