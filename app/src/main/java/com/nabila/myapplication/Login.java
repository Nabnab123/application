package com.nabila.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText username;
    EditText password;
    private Button buttonLogin;
    private String KEY_NAME = "USERNAME";
    private String KEY_PASS = "PASSWORD";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        buttonLogin = findViewById(R.id.btnlogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernama = username.getText().toString();
                String sandi = password.getText().toString();
                Intent move = new Intent(Login.this, MainActivity.class);
                move.putExtra(KEY_NAME, usernama);
                move.putExtra(KEY_PASS, sandi);
                startActivity(move);
            }
        });
    }
}