package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView goQuestion, goRandom, goGwangjang, goDiary, goMyMap, goLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goQuestion = (TextView) findViewById(R.id.goQuestion);
        goRandom = (TextView) findViewById(R.id.goRandom);
        goGwangjang = (TextView) findViewById(R.id.goGwangjang);
        goDiary = (TextView) findViewById(R.id.goDiary);
        goMyMap = (TextView) findViewById(R.id.goMyMap);
        goLogin = (TextView) findViewById(R.id.goLogin);

        goQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
                startActivity(intent);
            }
        });

        goRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RandomActivity.class);
                startActivity(intent);
            }
        });


//        다이어리 목록 화면으로 먼저 이동하도록 하고, 목록에서 다이어리 추가 버튼을 통해 DiaryActivity를 수행할 수 있도록 구성
        goDiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DiaryActivity.class);
                startActivity(intent);
            }
        });

        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });





        //        goGwangjang.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), GwanjangActivity.class);
//                startActivity(intent);
//            }
//        });


//        goMyMap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), MyMapActivity.class);
//                startActivity(intent);
//            }
//        });



    }
}