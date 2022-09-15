package com.example.firstproject.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.firstproject.R;
import com.example.firstproject.model.Question;
import com.example.firstproject.model.QuestionBank;

import java.util.Arrays;

public class GameActivity extends AppCompatActivity {
    private TextView question;
    private Button btnRep1, btnRep2, btnRep3, btnRep4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btnRep1 = findViewById(R.id.btnAnswer1);
        btnRep2 = findViewById(R.id.btnAnswer2);
        btnRep3 = findViewById(R.id.btnAnswer3);
        btnRep4 = findViewById(R.id.btnAnswer4);
        question = findViewById(R.id.myQuestion);
    }


    private QuestionBank generateQuestionsList(){
        Question q1 = new Question("What is the name of the German airline?", Arrays.asList(
                "Lufthansa",
                "Raynair",
                "jet brain",
                "ibiza"
        ), 0);
        Question q2 = new Question("In which European city can you find the home of Anne Frank?", Arrays.asList(
                "Pais",
                "Amsterdam",
                "London",
                "Madrid"
        ), 1);
        Question q3 = new Question("In what year did princess diana die?", Arrays.asList(
                "In the year 1997",
                "In the year 1990",
                "In the year 1991",
                "In the year 1993"
        ), 0);
        Question q4 = new Question("What is the most famous university of Paris?", Arrays.asList(
                "Lyon Claude Bernard",
                "Toulouse",
                "Pot",
                "Sorbonne"
        ), 3);

        return new QuestionBank(Arrays.asList(q1, q2, q3, q4));

    }
}