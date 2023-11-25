package com.AuthWithToken.Auth.service;

import com.AuthWithToken.Auth.model.User;

public interface UserService {
    User register(User user);
    User findByUsername(String username);
    User findById(Long id);

}
