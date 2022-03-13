package com.example.capstone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity extends AppCompatActivity {

    CheckBox meal, snack, rice, noodle, bread, meat, seafood, riceCake;
    CheckBox koreanFood, ChineseFood, AmericanFood, JapaneseFood, veryHot, hot, littleHot, notHot, soup, notSoup;

    Button btnCancel, btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        meal = (CheckBox) findViewById(R.id.meal);
        snack = (CheckBox) findViewById(R.id.snack);
        rice = (CheckBox) findViewById(R.id.rice);
        noodle = (CheckBox) findViewById(R.id.noodle);
        bread = (CheckBox) findViewById(R.id.bread);
        seafood = (CheckBox) findViewById(R.id.seafood);
        meat = (CheckBox) findViewById(R.id.meat);
        riceCake = (CheckBox) findViewById(R.id.riceCake);
        koreanFood = (CheckBox) findViewById(R.id.koreanFood);
        ChineseFood = (CheckBox) findViewById(R.id.ChineseFood);
        AmericanFood = (CheckBox) findViewById(R.id.AmericanFood);
        JapaneseFood = (CheckBox) findViewById(R.id.JapaneseFood);
        veryHot = (CheckBox) findViewById(R.id.veryHot);
        hot = (CheckBox) findViewById(R.id.hot);
        littleHot = (CheckBox) findViewById(R.id.littleHot);
        notHot = (CheckBox) findViewById(R.id.notHot);
        soup = (CheckBox) findViewById(R.id.soup);
        notSoup = (CheckBox) findViewById(R.id.notSoup);

        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnOk = (Button) findViewById(R.id.btnOk);



        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
