package com.riwi.spring_boot_test.infraestructure.abstract_service;

public interface DeleteService<Id> {
    void delete(Id id);
}
