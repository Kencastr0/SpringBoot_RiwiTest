package com.riwi.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.domain.entities.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
