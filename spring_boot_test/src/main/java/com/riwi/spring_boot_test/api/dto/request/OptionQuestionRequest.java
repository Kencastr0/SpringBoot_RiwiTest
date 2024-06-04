package com.riwi.spring_boot_test.api.dto.request;

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
public class OptionQuestionRequest {
    @NotBlank(message = "Text cannot be empty")
    private String text;

    @NotNull(message = "Active cannot be null")
    private boolean active;
}
