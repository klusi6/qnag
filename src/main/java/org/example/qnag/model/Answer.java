package org.example.qnag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@Entity
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue
    private Long id;
    private boolean isCorrect;
    private String content;
    @ManyToOne
    private Question question;

    public Answer(String content, boolean isCorrect) {
        this.content = content;
        this.isCorrect = isCorrect;
    }
}
