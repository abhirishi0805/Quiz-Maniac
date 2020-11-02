package com.example.quizmaniac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instructions extends AppCompatActivity {

    Button btnQuizUp;
    String option;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        btnQuizUp = findViewById(R.id.btnQuizUp);
        option = getIntent().getStringExtra("option");

        btnQuizUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Instructions.this, com.example.quizmaniac.Quiz.class);
                intent.putExtra("option", option);
                startActivity(intent);
            }
        });
    }
}