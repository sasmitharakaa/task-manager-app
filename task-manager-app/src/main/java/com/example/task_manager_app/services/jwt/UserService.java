package com.example.task_manager_app.services.jwt;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

    UserDetailsService userDetailsService();

    UserDetailsService userDetailService();
}
