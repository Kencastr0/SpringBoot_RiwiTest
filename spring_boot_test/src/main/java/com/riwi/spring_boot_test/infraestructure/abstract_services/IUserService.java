package com.riwi.spring_boot_test.infraestructure.abstract_services;

import com.riwi.spring_boot_test.api.controllers.dto.request.UserRequest;
import com.riwi.spring_boot_test.api.controllers.dto.response.UserResponse;

public interface IUserService extends
        CreateReadService<UserRequest, UserResponse, Long>,
        UpdateService<UserRequest, UserResponse, Long>
{
}
