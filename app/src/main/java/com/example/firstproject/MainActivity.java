package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myText;
    EditText newTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = (TextView) findViewById(R.id.myText);
        newTxt = (EditText) findViewById(R.id.userName);
    }

    public void ButtonOnClick(View v) {
        myText.setText("Hello : "+newTxt.getText().toString());
        newTxt.setText("");
    }

}