package com.example.task_manager_app.dto;

import com.example.task_manager_app.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;

    private Long userId;

    private UserRole userRole;

}
