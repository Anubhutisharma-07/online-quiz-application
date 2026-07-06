package com.anubhuti.online_quiz_application.repository;

import com.anubhuti.online_quiz_application.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}