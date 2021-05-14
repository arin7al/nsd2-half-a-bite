package com.example.app.controller.dto;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
@JsonPOJOBuilder(withPrefix = "")
public class Response implements Serializable {

  @Builder
  @ToString
  public static class Error implements Serializable {

    private static final long serialVersionUID = 5528687365082502257L;

    @JsonProperty("code")
    private String code;

    @JsonProperty("status")
    private String status;

    @JsonProperty("msg")
    private String message;

    @JsonProperty("desc")
    private String description;
  }

  private static final long serialVersionUID = -7911604404427583463L;

  @JsonProperty("data")
  private Object data;

  @JsonProperty("errors")
  private List<Error> errors;

  @JsonProperty("status_code")
  private String statusCode;

  @JsonProperty("status_message")
  private String statusMessage;
}
