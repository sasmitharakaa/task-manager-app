package com.example.task_manager_app.services.auth;


import com.example.task_manager_app.dto.SignupRequest;
import com.example.task_manager_app.dto.UserDto;
import com.example.task_manager_app.entities.User;
import com.example.task_manager_app.enums.UserRole;
import com.example.task_manager_app.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UserRepository userRepository;

    @PostConstruct
    public void createAnAdminAccount(){
        Optional<User> optionalUser = userRepository.findByUserRole(UserRole.ADMIN);
        if (optionalUser.isEmpty()) {
           User user = new User();
           user.setEmail("admin@test.com");
           user.setName("admin");
           user.setPassword(new BCryptPasswordEncoder().encode("admin"));
           user.setUserRole(UserRole.ADMIN);
           userRepository.save(user);
            System.out.println("Admin account created successfully!");
        } else {
            System.out.println("Admin account already exist!");
        }
    }

    @Override
    public UserDto signupUser(SignupRequest signupRequest) {
        User user = new User();
        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        user.setUserRole(UserRole.EMPLOYEE);
        userRepository.save(user);
        return null;
    }

    @Override
    public boolean hasUserWithEmail(String email) {
        return userRepository.findFirstByEmail(email).isPresent();
    }
}
