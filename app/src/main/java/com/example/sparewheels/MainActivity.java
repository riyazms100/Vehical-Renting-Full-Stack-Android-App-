package com.example.sparewheels;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void MyIntent(View view) {
        Intent spf = new Intent(this, login_activity.class);
        startActivity(spf);
    }

    public void move2(View view) {
        Intent spf1 = new Intent(this, Signup.class);
        startActivity(spf1);
    }
}