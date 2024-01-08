package org.example.qnag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
    @Id
    @GeneratedValue
    private Long id;
    private boolean isCorrect;
    private String content;
    @ManyToOne
    private Question question;

}
