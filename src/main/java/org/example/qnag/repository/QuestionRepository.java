package org.example.qnag.repository;

import org.example.qnag.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
