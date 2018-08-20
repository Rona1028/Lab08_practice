package com.example.android.lab08_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    private static final String TAG="resultActivity";

    private TextView m_tv_result;
    private CharSequence m_q1_answer;
    private CharSequence m_q2_answer;
    private CharSequence m_q3_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        init();
        logIntent();
        showResult();
    }

    private void showResult() {
        StringBuilder result=new StringBuilder();
        result.append("1. ").append(m_q1_answer).append("\n").
                append("2. ").append(m_q2_answer).append("\n").
                append("3. ").append(m_q3_answer).append("\n");

        m_tv_result=findViewById(R.id.tv_result);
        m_tv_result.setText(result);

    }

    private void logIntent() {
        Intent intent=getIntent();
        m_q1_answer=intent.getCharSequenceExtra(question1.Q1_ANSWER_KEY);
        m_q2_answer=intent.getCharSequenceExtra(question2.Q2_ANSWER_KEY);
        m_q3_answer=intent.getCharSequenceExtra(question3.Q3_ANSWER_KEY);

        Log.d(TAG, "q1Answer=" +m_q1_answer);
        Log.d(TAG, "q2Answer=" +m_q2_answer);
        Log.d(TAG, "q3Answer=" +m_q3_answer);
    }

    private void init() {
        m_tv_result=findViewById(R.id.tv_result);
    }

    public void main(View view) {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in,R.anim.push_left_in);
    }
}
