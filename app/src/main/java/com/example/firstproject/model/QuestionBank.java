package com.example.firstproject.model;

import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private List<Question> mQuestionList;
    private int mNextQuestionIndex;
    private static int count;

    public QuestionBank(List<Question> questionList) {
        // Shuffle the question list before storing it
        this.mQuestionList = questionList;
        Collections.shuffle(this.mQuestionList);
        count = 0;
    }

    public Question getNextQuestion() {
        if(count < this.mQuestionList.size()){
            this.mNextQuestionIndex = ++count;
        }
        return this.mQuestionList.get(this.mNextQuestionIndex);
    }
}
