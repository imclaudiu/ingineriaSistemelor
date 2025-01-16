package com.example.demo.controllers;

//import com.example.demo.DTO.LoginRequest;
import com.example.demo.Entities.Trainee;
import com.example.demo.Repositories.TraineeRepository;
import com.example.demo.Services.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private TraineeService traineeService;
    @Autowired
    private TraineeRepository traineeRepository;

    @PostMapping("/login")
    public ResponseEntity<Trainee> login(@RequestParam String username, @RequestParam String password) {
        Trainee trainee = traineeService.findByEmailAndPassword(username, password);
        if (trainee == null) {
            return ResponseEntity.status(401).build(); // Unauthorized if no match
        }
        return ResponseEntity.ok(trainee);
}
}
