package com.kastro.blogapp.service;

import com.kastro.blogapp.model.User;
import com.kastro.blogapp.model.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
