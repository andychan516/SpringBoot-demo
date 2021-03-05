package com.heima.controller;

import com.heima.pojo.User;
import com.heima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@Controller
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

  @GetMapping("/all")
  public String all(ModelMap model) {
    // 查询用户
    List<User> users = this.userService.queryAll();
    // 放入模型
    model.addAttribute("users", users);
    // 返回模板名称（就是classpath:/templates/目录下的html文件名）
    return "users";
  }
}
