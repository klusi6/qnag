package org.example.qnag.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private String nickname;
    private int score = 0;
    private int level = 1;
    @OneToMany(mappedBy = "player")
    private List<Question> questionList;

    public Player(String nickname, List<Question> questionList) {
        this.nickname = nickname;
        this.questionList = questionList;
    }
}
