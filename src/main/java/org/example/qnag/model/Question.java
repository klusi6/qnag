package org.example.qnag.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
public class Question {
    @Id
    @GeneratedValue
    private Long id;
    private String content;
    private Boolean isAnswered = false;
    private Boolean isCorrect = false;
    @OneToMany(mappedBy = "question",cascade = CascadeType.PERSIST)
    private List<Answer> answers = new ArrayList<>();
    @ManyToOne
    private Player player;


    public Question(String content, List<Answer> answers) {
        this.content = content;
        this.answers = answers;
    }
}
