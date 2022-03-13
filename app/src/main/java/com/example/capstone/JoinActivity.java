package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity extends AppCompatActivity {

    EditText setID, setPasswd, setBirthDate;
    RadioGroup selectGender;
    RadioButton setMale, setFemale;
    Button btnJoinCancel, btnJoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_member);

        setID = (EditText) findViewById(R.id.setID);
        setPasswd = (EditText) findViewById(R.id.setPasswd);
        setBirthDate = (EditText) findViewById(R.id.setBirthDate);

        selectGender = (RadioGroup) findViewById(R.id.selectGender);

        setMale = (RadioButton) findViewById(R.id.setMale);
        setFemale = (RadioButton) findViewById(R.id.setFemale);

        btnJoinCancel = (Button) findViewById(R.id.btnJoinCancel);
        btnJoin = (Button) findViewById(R.id.btnJoin);


        btnJoinCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




    }
}