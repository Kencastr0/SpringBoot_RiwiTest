package com.riwi.spring_boot_test.api.controllers.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRequest{
    @NotBlank(message = "Text cannot be empty")
    private String text;

    @NotBlank(message = "Type cannot be empty")
    @Pattern(regexp = "CLOSED|OPEN", message = "The type must be CLOSED or OPEN.")
    private String type;

    @NotNull(message = "Survey ID is required")
    @Min(value = 1, message = "Survey ID must be higher than 0")
    private Long surveyId;

    @NotNull(message = "Active cannot be null")
    private boolean active;

    private List<OptionQuestionRequest> options;
}
