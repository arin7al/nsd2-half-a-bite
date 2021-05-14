package com.example.app.controller;

import com.example.app.data.dto.UserDto;
import com.example.app.service.UserRolesInitializer;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.example.app.data.dto.Response;
import com.example.app.service.AppService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@RestController
@RequestMapping("/v1/registration")
@Slf4j
public class UserController {

    @Autowired private AppService appService;
    @Autowired private UserRolesInitializer rolesInitializer;
    @Autowired
    private UserService userService;
    //  @Autowired
    //  private SecurityService securityService; TODO: implement
    //  @Autowired
    //  private UserValidator userValidator;

    @GetMapping("/init")
    public Response initializeRoles() {
      rolesInitializer.initializeRoles();
      log.info("Roles initialized!");
      return Response.builder().statusCode("200").build();
    }

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    UserDto create(@RequestBody UserDto user) {
    //    userValidator.validate(user);// TODO
        userService.create(user);
    //    return new ResponseEntity(HttpStatus.ACCEPTED);
        return userService.getUser(user.getEmail());
    }

    @GetMapping(value = "/get-user-info", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<com.example.app.data.dao.User> getUsers() {
        return userService.getAllUsers();
    }
}
