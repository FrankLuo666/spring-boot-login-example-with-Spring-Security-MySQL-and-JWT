package com.bezkoder.spring.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class LoginController {
  @GetMapping("/index")
  public String viewHomePage() {
    return "index";
  }

}
