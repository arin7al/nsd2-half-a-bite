package com.example.app.controller;

import com.example.app.data.dto.Response;
import com.example.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/emitor-personal-page")
@Slf4j
public class EmitorPersonalPageController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/emit-token", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response emitToken(@RequestParam(name = "token-name") String tokenName, @RequestParam(name = "token-quantity") String tokenQuantity) {
        //TODO: implement
        return Response.builder().statusCode("200").data(userService.getAllUsers()).build();
    }

    @GetMapping(value = "/retrieve-token", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response retrieveToken(@RequestParam(name = "token-name") String tokenName) {
        //TODO: implement
        return Response.builder().statusCode("200").data(userService.getAllUsers()).build();
    }
}
