package com.riwi.spring_boot_test.api.controllers;

import com.riwi.spring_boot_test.api.dto.request.UserRequest;
import com.riwi.spring_boot_test.api.dto.response.UserResponse;
import com.riwi.spring_boot_test.infraestructure.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@Validated @RequestBody UserRequest request) {
        UserResponse userResponse = userService.create(request);
        return ResponseEntity.ok(userResponse);
    }

    @GetMapping
    public ResponseEntity<Page<UserResponse>> getAllUsers( @RequestParam(defaultValue = "1") int page,
    @RequestParam(defaultValue = "10") int size) {
         Pageable pageable = PageRequest.of(page, size);
        if (page != 0)
            pageable = PageRequest.of(page - 1, size);
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
    public ResponseEntity<UserResponse> updateUser(@Validated @PathVariable Long id, @RequestBody UserRequest request) {
        UserResponse userResponse = userService.update(id, request);
        return ResponseEntity.ok(userResponse);
    }
}

