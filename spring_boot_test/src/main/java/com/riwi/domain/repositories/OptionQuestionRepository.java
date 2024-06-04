package com.riwi.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.domain.entities.OptionQuestion;

@Repository
public interface OptionQuestionRepository extends JpaRepository<OptionQuestion, Long> {
}
