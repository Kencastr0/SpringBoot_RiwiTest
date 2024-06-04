package com.riwi.spring_boot_test.infraestructure.abstract_service;

import java.util.List;

import com.riwi.spring_boot_test.api.dto.request.OptionFromQuestionRequest;
import com.riwi.spring_boot_test.api.dto.request.OptionQuestionRequest;

public interface IOptionQuestionService
{
    void createOptionsFromQuestion(List<OptionQuestionRequest> files, Long questionId);
    void updateOptionsFromQuestion(List<OptionFromQuestionRequest> files, Long questionId);
}
