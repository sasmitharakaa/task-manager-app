package com.example.task_manager_app.controller.admin;


import com.example.task_manager_app.dto.TaskDTO;
import com.example.task_manager_app.services.admin.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
@CrossOrigin("*")
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/users")
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(adminService.getUsers());
    }

    @PostMapping("/task")
    public ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO taskDTO) {
        TaskDTO createdTaskDTO = adminService.createTask(taskDTO);
        if (createdTaskDTO == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTaskDTO);
    }

    @GetMapping("/tasks")
    public ResponseEntity<?> getAllTasks() {
        return ResponseEntity.ok(adminService.getAllTasks());
    }

    @DeleteMapping("/task/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        adminService.deleteTask(id);
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/task/{id}")
    public ResponseEntity<TaskDTO> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(adminService.getTaskById(id));
    }

    @PutMapping("/task/{id}")
    public ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody TaskDTO taskDTO) {
        TaskDTO updatedTask = adminService.updateTask(id, taskDTO);
        if (updatedTask == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updatedTask);
    }



}
