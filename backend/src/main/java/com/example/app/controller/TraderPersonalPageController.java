package com.example.app.controller;

import com.example.app.data.dto.Response;
import com.example.app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/trader-personal-page")
@Slf4j
public class TraderPersonalPageController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user-balance", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getBalanceOfUser(@RequestParam(name = "id") String id) {
        //TODO implement
        return Response.builder().statusCode("200").build();
    }

    @GetMapping(value = "/user-trade-history", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getHistoryOfTrades(@RequestParam(name = "id") String id) {
        //TODO implement
        return Response.builder().statusCode("200").build();
    }

    @GetMapping(value = "/available-tokens", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response getTokens() {
        //TODO implement
        return Response.builder().statusCode("200").data(userService.getAllUsers()).build();
    }

    @GetMapping(value = "/buy-tokens", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response buyTokens(@RequestParam(name = "buyer-id") String buyerId,
                              @RequestParam(name = "seller-id") String sellerId,
                              @RequestParam(name = "quantity") String quantity) {
        //TODO implement
        return Response.builder().statusCode("200").data(userService.getAllUsers()).build();
    }

}
