package com.riwi.spring_boot_test.api.controllers.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Option_QuestionRequest {
    @NotNull(message = "ID is required")
    @Min(value = 1, message = "ID needs to be higher than 0")
    private Long id;
    @NotBlank(message = "Text must not be empty")
    private String text;

    @NotNull(message = "Active cannot be null")
    private boolean active;
}
