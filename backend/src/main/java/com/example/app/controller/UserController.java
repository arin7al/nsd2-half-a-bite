package com.example.app.controller;

import com.example.app.data.dto.Login;
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
    @ResponseBody
    public Response initializeRoles() {
      rolesInitializer.initializeRoles();
      log.info("Roles initialized!");
      return Response.builder().statusCode("200").build();
    }

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response create(@RequestBody UserDto user) {
    //    userValidator.validate(user);// TODO
        userService.create(user);
        return Response.builder().statusCode("200").data(userService.getUser(user.getEmail())).build();
    }

    @PostMapping(value = "/authenticate", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response authenticate(@RequestBody Login login) {
        boolean isCorrect = userService.findIfCorrect(login);
        return Response.builder().statusCode("200").data(isCorrect).build();
    }

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response getInvestors() {    //TODO: permission only operator
        return Response.builder().statusCode("200").data(userService.getAllUsers()).build();
    }

    @GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response getUser() {    //TODO: only operator
        return Response.builder().statusCode("200").data(userService.getAllUsers()).build();
    }

    @GetMapping(value = "/tokens", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response getTokens() {
        return Response.builder().statusCode("200").data(userService.getAllUsers()).build();
    }

    @PatchMapping(value = "/approve-emitter/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response approveEmitter(@RequestParam(name = "id") String id) {
        //TODO change pending emitters, only operator
        return Response.builder().statusCode("200").build();
    }
}
