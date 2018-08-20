package com.example.android.lab08_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class question3 extends AppCompatActivity {

    private static final String TAG="question3";

    public static final String Q3_ANSWER_KEY="Q3";

    private TextView m_tv_no;
    private TextView m_tv_question;
    private RadioButton m_radio_a;
    private RadioButton m_radio_b;
    private RadioButton m_radio_c;

    private CharSequence m_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);


        logIntent();




    }

    private void logIntent() {

        Intent intent=getIntent();

        CharSequence q2Answer= intent.getCharSequenceExtra(question2.Q2_ANSWER_KEY);
        Log.d(TAG, "q2Answer=" +q2Answer);
    }



    public void click(View view) {
        switch (view.getId()){
            case R.id.radio_a:
                m_answer="A";
                break;
            case R.id.radio_b:
                m_answer="B";
                break;
            case R.id.radio_c:
                m_answer="C";
                break;
        }


    }

    public void next(View view) {
        Intent intent = getIntent();
        intent.setClass(this, resultActivity.class);
        intent.putExtra(Q3_ANSWER_KEY, m_answer);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_in);

    }
}
