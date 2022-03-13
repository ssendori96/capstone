package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText insertID, insertPasswd;
    Button goJoin, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        insertID = (EditText) findViewById(R.id.insertID);
        insertPasswd = (EditText) findViewById(R.id.insertPasswd);
        goJoin = (Button) findViewById(R.id.goJoin);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        goJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }
        });


    }
}