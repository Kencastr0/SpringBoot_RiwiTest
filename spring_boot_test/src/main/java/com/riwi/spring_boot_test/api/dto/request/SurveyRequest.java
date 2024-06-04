package com.riwi.spring_boot_test.api.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SurveyRequest {
    @NotBlank(message = "Title cannot be empty")
    @Size(max = 255)
    private String title;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    @NotNull(message = "Creator ID is required")
    @Min(value = 1, message = "Creator ID needs to be higher than 0")
    private Long creatorId;

    @NotNull
    private boolean active;
}
