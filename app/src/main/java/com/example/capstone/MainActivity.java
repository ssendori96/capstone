package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView goQuestion, goRandom, goGwangjang, goDiary, goMyMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goQuestion = (TextView) findViewById(R.id.goQuestion);
        goRandom = (TextView) findViewById(R.id.goRandom);
        goGwangjang = (TextView) findViewById(R.id.goGwangjang);
        goDiary = (TextView) findViewById(R.id.goDiary);
        goMyMap = (TextView) findViewById(R.id.goMyMap);

        goQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
                startActivity(intent);
            }
        });

    }
}