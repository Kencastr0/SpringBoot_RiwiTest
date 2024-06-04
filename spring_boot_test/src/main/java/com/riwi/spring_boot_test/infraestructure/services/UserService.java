package com.riwi.spring_boot_test.infraestructure.services;

import com.riwi.spring_boot_test.infraestructure.abstract_service.CreateReadService;
import com.riwi.spring_boot_test.infraestructure.abstract_service.UpdateService;
import com.riwi.spring_boot_test.infraestructure.abstract_service.DeleteService;
import com.riwi.spring_boot_test.api.controllers.dto.request.UserRequest;
import com.riwi.spring_boot_test.api.controllers.dto.response.UserResponse;
import com.riwi.spring_boot_test.domain.entities.User;
import com.riwi.spring_boot_test.domain.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements CreateReadService<UserRequest, UserResponse, Long>,
        UpdateService<UserRequest, UserResponse, Long>,
        DeleteService<Long> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest request) {
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .active(Boolean.parseBoolean(request.getActive())) // Convert String to boolean
                .build();
        user = userRepository.save(user);
        return new UserResponse(user);
    }

    @Override
    public Page<UserResponse> getAll(Pageable pageable) {
        return userRepository.findAll(pageable)
                .map(UserResponse::new);
    }

    @Override
    public Optional<UserResponse> getById(Long id) {
        return userRepository.findById(id)
                .map(UserResponse::new);
    }

    @Override
    public UserResponse update(Long id, UserRequest request) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setName(request.getName());
            user.setEmail(request.getEmail());
            user.setPassword(request.getPassword());
            user.setActive(request.getActive());
            user = userRepository.save(user);
            return new UserResponse(user);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
