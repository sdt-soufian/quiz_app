package com.example.firstproject.model;

import java.util.List;

public class Question {
    private final String mQuestion;
    private final List<String> mChoiceList;
    private final int mAnswerIndex;

    public Question(String mQuestion, List<String> choices, int index) {
        this.mQuestion = mQuestion;
        this.mAnswerIndex = index;
        this.mChoiceList = choices;
    }

    public String getmQuestion() {
        return mQuestion;
    }

    public List<String> getmChoiceList() {
        return mChoiceList;
    }

    public int getmAnswerIndex() {
        return mAnswerIndex;
    }
}
