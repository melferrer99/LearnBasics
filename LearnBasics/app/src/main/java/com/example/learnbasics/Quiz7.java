package com.example.learnbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Quiz7 extends AppCompatActivity {
    EditText answer;
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz7);

        answer = (EditText) findViewById(R.id.ans);
        sub = (Button) findViewById(R.id.submit);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = String.valueOf((answer.getText()));
                if (word.equalsIgnoreCase("panda")) {
                    startActivity(new Intent(Quiz7.this, SubQuiz7c.class));
                } else {
                    startActivity(new Intent(Quiz7.this,SubQuiz7w.class));
                }
            }
        });
    }
}
