package com.example.app.controller;

import com.example.app.data.dto.Response;
import com.example.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/admin-personal-page")
@Slf4j
public class AdminPersonalPageController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/investors", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response getInvestors() {
        //TODO: permission only operator
        //TODO: search by roles, not all users
        return Response.builder().statusCode("200").data(userService.getAllUsers()).build();
    }

    @GetMapping(value = "/user-info/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response getUserInfo() {
        //TODO: only operator
        //TODO find by id
        return Response.builder().statusCode("200").data(userService.getAllUsers()).build();
    }

    @PatchMapping(value = "/approve-emitter/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response approveEmitter(@RequestParam(name = "id") String id) {
        //TODO implement
        return Response.builder().statusCode("200").build();
    }
}
