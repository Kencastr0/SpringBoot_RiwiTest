package com.riwi.spring_boot_test.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.spring_boot_test.domain.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
