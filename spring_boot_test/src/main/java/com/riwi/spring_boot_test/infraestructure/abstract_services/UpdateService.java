package com.riwi.spring_boot_test.infraestructure.abstract_services;

public interface UpdateService<Request, Response, Id> {
    Response update(Id id, Request request);
}
