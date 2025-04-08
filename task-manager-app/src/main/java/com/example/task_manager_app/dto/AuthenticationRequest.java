package com.example.task_manager_app.dto;


import lombok.Data;

@Data
public class AuthenticationRequest {

    private String email;

    private String password;


}
