package org.example.qnag.dto;

import org.example.qnag.model.Question;

public record QuestionDTO (Long id, String question, String answer_a, String answer_b, String answer_c, String answer_d) {
    public QuestionDTO(Question question) {
        this(question.getId(), question.getContent(), question.getAnswers().get(0).getContent(), question.getAnswers().get(1).getContent(), question.getAnswers().get(2).getContent(), question.getAnswers().get(3).getContent());
    }

}
