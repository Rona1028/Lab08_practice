package com.example.android.lab08_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void start(View view) {
        Intent intent=new Intent(this,question1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_in,R.anim.push_right_in);
    }
}
