package com.example.task_manager_app.dto;


import lombok.Data;

@Data
public class SignupRequest {

    private String name;

    private String email;

    private String password;
}

