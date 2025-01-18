package com.turkcell.spring.starter.controller;

import com.turkcell.spring.starter.dto.user.LoginDto;
import com.turkcell.spring.starter.entity.User;
import com.turkcell.spring.starter.service.UserService;
import com.turkcell.spring.starter.util.jwt.JwtService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
  private final UserService userService;
  public UsersController(UserService userService, JwtService jwtService) {
    this.userService = userService;
  }

  @PostMapping
  public void add(@RequestBody User user)
  {
    userService.add(user);
  }

  @PostMapping("login")
  public String login(@RequestBody LoginDto loginDto)
  {
    return userService.login(loginDto);
  }
}
