package com.riwi.spring_boot_test.api.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 100, message = "min 3 characters, and max 100 characters")
    private String name;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Please provide a valid email address. Example: riwi@email.com")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 5, max = 50, message = "min 5 characters, and max 50 characters")
    private String password;

    @NotNull
    private Boolean active;
}
