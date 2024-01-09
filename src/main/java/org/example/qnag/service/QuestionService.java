package org.example.qnag.service;

import lombok.AllArgsConstructor;
import org.example.qnag.dto.QuestionDTO;
import org.example.qnag.model.Question;
import org.example.qnag.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> findAll() {
        return questionRepository.findAll();
    }
}
