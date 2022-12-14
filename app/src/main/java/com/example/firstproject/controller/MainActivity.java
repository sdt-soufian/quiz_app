package com.example.firstproject.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.firstproject.R;
import com.example.firstproject.model.User;

public class MainActivity extends AppCompatActivity {
    private TextView myText;
    private EditText myEditTxt;
    private Button myBtnClick;
    User nameUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = findViewById(R.id.myText);
        myEditTxt = findViewById(R.id.editTxt);
        myBtnClick = findViewById(R.id.btnClick);
        myBtnClick.setEnabled(false);
        nameUser = new User();

        //add Listner to input text
        myEditTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                myBtnClick.setEnabled(!editable.toString().isEmpty());
            }
        });

        //click event

        myBtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivityIntent);
                nameUser.setMyFirstName(myEditTxt.getText().toString());
            }
        });
    }

    /*public void ButtonOnClick(View v) {
        myText.setText("Hello : "+newTxt.getText().toString());
        newTxt.setText("");
    }*/

}