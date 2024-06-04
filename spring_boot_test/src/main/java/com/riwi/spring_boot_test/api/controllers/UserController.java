package com.riwi.spring_boot_test.api.controllers;

import com.riwi.spring_boot_test.api.controllers.dto.request.UserRequest;
import com.riwi.spring_boot_test.api.controllers.dto.response.UserResponse;
import com.riwi.spring_boot_test.infraestructure.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request) {
        UserResponse userResponse = userService.create(request);
        return ResponseEntity.ok(userResponse);
    }

    @GetMapping
    public ResponseEntity<Page<UserResponse>> getAllUsers(Pageable pageable) {
        Page<UserResponse> users = userService.getAll(pageable);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id) {
        Optional<UserResponse> userResponse = userService.getById(id);
        return userResponse.map(ResponseEntity::ok)
                           .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable Long id, @RequestBody UserRequest request) {
        UserResponse userResponse = userService.update(id, request);
        return ResponseEntity.ok(userResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

