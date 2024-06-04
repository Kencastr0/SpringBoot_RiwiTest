package com.riwi.spring_boot_test.infraestructure.abstract_services;

import java.util.List;

import com.riwi.spring_boot_test.api.controllers.dto.request.OptionQuestionRequest;
import com.riwi.spring_boot_test.api.controllers.dto.request.Option_QuestionRequest;

public interface IOptionQuestionService
{
    void createOptionsFromQuestion(List<OptionQuestionRequest> files, Long questionId);
    void updateOptionsFromQuestion(List<Option_QuestionRequest> files, Long questionId);
}
