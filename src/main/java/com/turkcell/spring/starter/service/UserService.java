package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.entity.User;

public interface UserService {
  void add(User user);
  boolean login(User user);
}
