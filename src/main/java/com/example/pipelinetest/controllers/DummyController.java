package com.example.pipelinetest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
public class DummyController {
  @RequestMapping(value = "/foos", method = RequestMethod.GET)
  @ResponseBody
  public String getFoosBySimplePath() {
    return "Get some Foos";
  }
}
