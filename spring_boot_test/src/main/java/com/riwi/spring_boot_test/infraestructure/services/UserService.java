package com.riwi.spring_boot_test.infraestructure.services;

import com.riwi.spring_boot_test.infraestructure.abstract_service.IUserService;
import com.riwi.spring_boot_test.api.dto.request.UserRequest;
import com.riwi.spring_boot_test.api.dto.response.UserResponse;
import com.riwi.spring_boot_test.domain.entities.User;
import com.riwi.spring_boot_test.domain.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest request) {
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .active(request.getActive())
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
            user.isActive();
            user = userRepository.save(user);
            return new UserResponse(user);
        } else {
            throw new RuntimeException("User not found");
        }
    }
}
