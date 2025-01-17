package com.turkcell.spring.starter.controller;

import com.turkcell.spring.starter.entity.User;
import com.turkcell.spring.starter.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
  private final UserService userService;

  public UsersController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public void add(@RequestBody User user)
  {
    userService.add(user);
  }

  @PostMapping("login")
  public boolean login(@RequestBody User user)
  {
    return userService.login(user);
  }
}
