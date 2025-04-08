package com.example.task_manager_app.dto;


import com.example.task_manager_app.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;

}
