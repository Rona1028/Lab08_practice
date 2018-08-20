package com.example.android.lab08_practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class question1 extends AppCompatActivity {

    public static final String Q1_ANSWER_KEY="Q1";

    private TextView m_tv_no;
    private TextView m_tv_question;
    private RadioButton m_radio_a;
    private RadioButton m_radio_b;
    private RadioButton m_radio_c;

    private CharSequence m_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        init();
    }

    private void init() {
       /* m_tv_no=findViewById(R.id.tv_no);
        m_tv_question=findViewById(R.id.tv_question);
        m_radio_a=findViewById(R.id.radio_a);
        m_radio_b=findViewById(R.id.radio_b);
        m_radio_c=findViewById(R.id.radio_c);
        m_tv_no.setText("1");
        m_tv_question.setText(getString(R.string.question_1));
        m_radio_a.setText(getString(R.string.question_1_radio_a));
        m_radio_b.setText(getString(R.string.question_1_radio_b));
        m_radio_c.setText(getString(R.string.question_1_radio_c));*/
    }

    public void next(View view) {
        Intent intent=new Intent(this,question2.class);
        intent.putExtra(Q1_ANSWER_KEY, m_answer);
        startActivity(intent);

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
}
