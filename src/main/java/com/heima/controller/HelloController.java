package com.heima.controller;

import com.heima.pojo.User;
import com.heima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

  @Autowired
  private DataSource dataSource;

  @Autowired
  private UserService userService;


  @GetMapping("/hello")
  public User hello() {
    User user = this.userService.queryById(16L);
    return user;
  }
}
