package com.riwi.spring_boot_test.api.controllers.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SurveyAllResponse extends SurveyResponse{
    private UserResponse user;
    private List<QuestionResponse> questions;
}
