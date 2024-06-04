package com.riwi.spring_boot_test.api.controllers.dto.response;

import com.riwi.spring_boot_test.domain.entities.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String name;
    private String email;
    private boolean active;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.active = user.isActive();
    }
}
