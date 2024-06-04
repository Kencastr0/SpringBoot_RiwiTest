package com.riwi.spring_boot_test.infraestructure.abstract_services;

import com.riwi.spring_boot_test.api.controllers.dto.request.SurveyRequest;
import com.riwi.spring_boot_test.api.controllers.dto.response.SurveyResponse;

public interface ISurveyService extends
        CreateReadService<SurveyRequest, SurveyResponse, Long>
{
}
