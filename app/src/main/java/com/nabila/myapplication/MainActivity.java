package com.nabila.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView outputUser;
    TextView passwordUser;
    private String username;
    private String password;
    private String KEY_NAME ="USERNAME";
    private String KEY_PASS ="PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputUser = (TextView) findViewById(R.id.outputUser);
        passwordUser = (TextView)findViewById(R.id.passwordUser);

        Bundle extras = getIntent().getExtras();
        password = extras.getString(KEY_PASS);
        username = extras.getString(KEY_NAME);
        outputUser.setText("Hai, "+username+"!");
        passwordUser.setText("Ini password anda, "+password);
    }
}