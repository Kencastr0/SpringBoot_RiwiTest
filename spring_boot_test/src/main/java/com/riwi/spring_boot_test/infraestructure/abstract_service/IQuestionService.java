package com.riwi.spring_boot_test.infraestructure.abstract_service;

import com.riwi.spring_boot_test.api.dto.request.QuestionRequest;
import com.riwi.spring_boot_test.api.dto.request.QuestionUpdate2Request;
import com.riwi.spring_boot_test.api.dto.request.QuestionUpdateRequest;
import com.riwi.spring_boot_test.api.dto.response.QuestionResponse;

public interface IQuestionService extends
        CreateReadService<QuestionRequest, QuestionResponse, Long>,
        UpdateService<QuestionUpdateRequest, QuestionResponse, Long>,
        DeleteService<Long>
{
    QuestionResponse updateQuestionRequest(QuestionUpdate2Request questionRequest, Long id);
}
