package com.riwi.spring_boot_test.infraestructure.abstract_service;

import com.riwi.spring_boot_test.api.dto.request.UserRequest;
import com.riwi.spring_boot_test.api.dto.response.UserResponse;

public interface IUserService extends
        CreateReadService<UserRequest, UserResponse, Long>,
        UpdateService<UserRequest, UserResponse, Long>
{
}
