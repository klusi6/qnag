package org.example.qnag.controller;

import org.example.qnag.dto.QuestionDTO;
import org.example.qnag.model.Question;
import org.example.qnag.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final QuestionService questionService;

    public ApiController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/questions")
    public ResponseEntity<List<QuestionDTO>> showQuestions() {
        return ResponseEntity.ok(questionService.findAll().stream()
                .map(QuestionDTO::new)
                .collect(Collectors.toList()));
    }
}
