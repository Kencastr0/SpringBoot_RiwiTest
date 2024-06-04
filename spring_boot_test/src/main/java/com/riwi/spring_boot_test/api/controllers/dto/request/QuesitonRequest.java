package com.riwi.spring_boot_test.api.controllers.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuesitonRequest {
    @NotBlank(message = "Text cannot be empty")
    private String text;

    @NotBlank(message = "Type cannot be empty")
    private String type;

    @NotNull(message = "Survey ID is required")
    @Min(value = 1, message = "Survey ID needs to be higher than 0")
    private Long surveyId;

    @NotNull(message = "Active cannot be null")
    private boolean active;

    @NotNull(message = "Options cannot be empty")
    private List<OptionQuestionRequest> options;
}
