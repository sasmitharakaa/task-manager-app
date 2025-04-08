package com.example.task_manager_app.services.auth;

import com.example.task_manager_app.dto.SignupRequest;
import com.example.task_manager_app.dto.UserDto;

public interface AuthService {

    UserDto signupUser(SignupRequest signupRequest);

    boolean hasUserWithEmail(String email);
}
