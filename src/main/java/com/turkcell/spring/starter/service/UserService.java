package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.dto.user.LoginDto;
import com.turkcell.spring.starter.entity.User;

public interface UserService {
  void add(User user);
  String login(LoginDto loginDto);
}
