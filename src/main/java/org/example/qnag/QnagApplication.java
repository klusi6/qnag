package org.example.qnag;

import org.example.qnag.model.Answer;
import org.example.qnag.model.Player;
import org.example.qnag.model.Question;
import org.example.qnag.repository.AnswerRepository;
import org.example.qnag.repository.PlayerRepository;
import org.example.qnag.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class QnagApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(QnagApplication.class, args);
    }
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    AnswerRepository answerRepository;
    @Autowired
    PlayerRepository playerRepository;
    @Override
    public void run(String... args) throws Exception {

        Question question = new Question
                ("What is the capital of France?",
                        List.of(new Answer("London", false),
                                new Answer("Paris", true),
                                new Answer("Rome", false),
                                new Answer("Madrid", false)));
        Player player = new Player("John Doe", List.of(question));
        question.setPlayer(player);
        playerRepository.save(player);
        questionRepository.save(question);
        for (Answer answer : question.getAnswers()) {
            answer.setQuestion(question);
        }
        answerRepository.saveAll(question.getAnswers());



        System.out.println("Hello World!");
        System.out.println(question.getContent());
        System.out.println("The answers are:");
        for (Answer answer : question.getAnswers()) {
            System.out.println(answer.getContent());
        }
    }
}
