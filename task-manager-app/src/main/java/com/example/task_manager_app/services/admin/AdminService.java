package com.example.task_manager_app.services.admin;

import com.example.task_manager_app.dto.TaskDTO;
import com.example.task_manager_app.dto.UserDto;
import com.example.task_manager_app.entities.Task;

import java.util.List;

public interface AdminService {

    List<UserDto> getUsers();

    TaskDTO createTask(TaskDTO taskDTO);

    List<TaskDTO> getAllTasks();

    void deleteTask(Long id);

    TaskDTO getTaskById(Long id);

    TaskDTO getTaskbyId(Long id);

    TaskDTO updateTask(Long id,TaskDTO taskDTO );
}
