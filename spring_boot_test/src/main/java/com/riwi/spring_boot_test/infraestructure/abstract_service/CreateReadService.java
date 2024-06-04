package com.riwi.spring_boot_test.infraestructure.abstract_service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CreateReadService<Request, Response, Id> {
    Response create(Request request);
    Page<Response> getAll(Pageable pageable);
    Optional<Response> getById(Id id);
}
