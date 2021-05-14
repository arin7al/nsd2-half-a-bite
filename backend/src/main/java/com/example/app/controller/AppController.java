package com.example.app.controller;

import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.controller.dto.Response;
import com.example.app.service.AppService;
import lombok.extern.slf4j.Slf4j;

/** @author https://github.com/bipinthite */
@RestController
@RequestMapping("/v1/hello")
@Slf4j
public class AppController {

  @Autowired private AppService appService;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/say")
  public Response sayHello() {
    try {
      log.info("trying to say hi");
      String message = appService.sayHello();
      return Response.builder().data(message).build();
    } catch (Exception e) {
      log.error("Error occurred while calling sayHello()", e);
      Response.Error error = Response.Error.builder().message(e.getMessage()).build();
      return Response.builder().errors(Collections.singletonList(error)).build();
    }
  }
}
