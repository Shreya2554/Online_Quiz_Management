package com.devops.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuizService {
    private List<Question> questions = new ArrayList<>();

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}