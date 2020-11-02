package com.example.quizmaniac;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Quiz extends AppCompatActivity {

    private TextView tvTime, tvQuestion, tvMarked, tvUnmarked;
    private CountDownTimer countDownTimer;
    private RadioGroup rbGroup;
    private RadioButton rbA, rbB, rbC, rbD;
    private Button btnNext, btnPrevious, btnSubmit;
    private int marked = 0, unMarked = 10;
    public static int[] questionNumbers;
    public static char[] optionMarked;
    private int currentQuestion;
    public static String option;
    private long backPressedTime = 0;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvTime = findViewById(R.id.tvTime);
        tvQuestion = findViewById(R.id.tvQuestion);
        tvMarked = findViewById(R.id.tvMarked);
        tvUnmarked = findViewById(R.id.tvUnmarked);
        rbGroup = findViewById(R.id.rbGroup);
        rbA = findViewById(R.id.rbA);
        rbB = findViewById(R.id.rbB);
        rbC = findViewById(R.id.rbC);
        rbD = findViewById(R.id.rbD);
        btnNext = findViewById(R.id.btnNext);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnSubmit = findViewById(R.id.btnSubmit);

        optionMarked = new char[]{'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N'};
        questionNumbers = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        currentQuestion = 0;

        option = getIntent().getStringExtra("option");

        Random random = new Random();
        byte i = 0;
        while(i != 10)
        {
            int ques = random.nextInt(ApplicationClass.science.size());
            boolean present = false;
            
            for(byte j = 0; j < i; j++)
            {
                if(ques == questionNumbers[j])
                    present = true;
            }
            
            if(present)
                continue;
            else
            {
                questionNumbers[i] = ques;
                i++;
            }
        }

        tvMarked.setText(marked + "");
        tvUnmarked.setText(unMarked + "");

        placeQuestion(questionNumbers[currentQuestion]);

        countDownTimer = new CountDownTimer(90000, 1000) {
            @Override
            public void onTick(long l) {

                int minutes = (int) l / 60000;
                int seconds = (int) (l % 60000) / 1000;

                String timeLeft = seconds < 10 ? minutes + " : 0" + seconds : minutes + " : " + seconds;
                tvTime.setText(timeLeft);
            }

            @Override
            public void onFinish() {
                TimeUpDialog timeUpDialog = new TimeUpDialog();
                timeUpDialog.show(getSupportFragmentManager(), "Time's Up");
            }
        }.start();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(currentQuestion != 9) {
                    currentQuestion++;

                    switch (optionMarked[currentQuestion])
                    {
                        case 'N':
                            rbGroup.clearCheck();
                            break;
                        case 'A':
                            rbA.setChecked(true);
                            break;
                        case 'B':
                            rbB.setChecked(true);
                            break;
                        case 'C':
                            rbC.setChecked(true);
                            break;
                        case 'D':
                            rbD.setChecked(true);
                            break;
                    }

                    placeQuestion(questionNumbers[currentQuestion]);
                }
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(currentQuestion != 0) {
                    currentQuestion--;

                    switch (optionMarked[currentQuestion])
                    {
                        case 'N':
                            rbGroup.clearCheck();
                            break;
                        case 'A':
                            rbA.setChecked(true);
                            break;
                        case 'B':
                            rbB.setChecked(true);
                            break;
                        case 'C':
                            rbC.setChecked(true);
                            break;
                        case 'D':
                            rbD.setChecked(true);
                            break;
                    }

                    placeQuestion(questionNumbers[currentQuestion]);
                }
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Quiz.this, com.example.quizmaniac.Results.class);
                startActivity(intent);
            }
        });

    }


    public void markAnswer(View v)
    {
        int selected = v.getId();

        if(optionMarked[currentQuestion] == 'N')
        {
            marked++;
            unMarked--;
            tvMarked.setText(String.format("%d", marked));
            tvUnmarked.setText(String.format("%d", unMarked));
        }

        switch (selected)
        {
            case R.id.rbA:
                optionMarked[currentQuestion] = 'A';
                break;
            case R.id.rbB:
                optionMarked[currentQuestion] = 'B';
                break;
            case R.id.rbC:
                optionMarked[currentQuestion] = 'C';
                break;
            case R.id.rbD:
                optionMarked[currentQuestion] = 'D';
        }
    }


    private void placeQuestion(int questionNumber)
    {
        switch (option)
        {
            case "cinema":
                tvQuestion.setText(ApplicationClass.cinema.get(questionNumber).getQuestion());
                rbA.setText(String.format(" %s", ApplicationClass.cinema.get(questionNumber).getA()));
                rbB.setText(String.format(" %s", ApplicationClass.cinema.get(questionNumber).getB()));
                rbC.setText(String.format(" %s", ApplicationClass.cinema.get(questionNumber).getC()));
                rbD.setText(String.format(" %s", ApplicationClass.cinema.get(questionNumber).getD()));
                break;
            case "gk":
                tvQuestion.setText(ApplicationClass.gk.get(questionNumber).getQuestion());
                rbA.setText(String.format(" %s", ApplicationClass.gk.get(questionNumber).getA()));
                rbB.setText(String.format(" %s", ApplicationClass.gk.get(questionNumber).getB()));
                rbC.setText(String.format(" %s", ApplicationClass.gk.get(questionNumber).getC()));
                rbD.setText(String.format(" %s", ApplicationClass.gk.get(questionNumber).getD()));
                break;
            case "science":
                tvQuestion.setText(ApplicationClass.science.get(questionNumber).getQuestion());
                rbA.setText(String.format(" %s", ApplicationClass.science.get(questionNumber).getA()));
                rbB.setText(String.format(" %s", ApplicationClass.science.get(questionNumber).getB()));
                rbC.setText(String.format(" %s", ApplicationClass.science.get(questionNumber).getC()));
                rbD.setText(String.format(" %s", ApplicationClass.science.get(questionNumber).getD()));
                break;
            case "sports":
                tvQuestion.setText(ApplicationClass.sports.get(questionNumber).getQuestion());
                rbA.setText(String.format(" %s", ApplicationClass.sports.get(questionNumber).getA()));
                rbB.setText(String.format(" %s", ApplicationClass.sports.get(questionNumber).getB()));
                rbC.setText(String.format(" %s", ApplicationClass.sports.get(questionNumber).getC()));
                rbD.setText(String.format(" %s", ApplicationClass.sports.get(questionNumber).getD()));
                break;
            case "literature":
                tvQuestion.setText(ApplicationClass.literature.get(questionNumber).getQuestion());
                rbA.setText(String.format(" %s", ApplicationClass.literature.get(questionNumber).getA()));
                rbB.setText(String.format(" %s", ApplicationClass.literature.get(questionNumber).getB()));
                rbC.setText(String.format(" %s", ApplicationClass.literature.get(questionNumber).getC()));
                rbD.setText(String.format(" %s", ApplicationClass.literature.get(questionNumber).getD()));
                break;
            case "history":
                tvQuestion.setText(ApplicationClass.history.get(questionNumber).getQuestion());
                rbA.setText(String.format(" %s", ApplicationClass.history.get(questionNumber).getA()));
                rbB.setText(String.format(" %s", ApplicationClass.history.get(questionNumber).getB()));
                rbC.setText(String.format(" %s", ApplicationClass.history.get(questionNumber).getC()));
                rbD.setText(String.format(" %s", ApplicationClass.history.get(questionNumber).getD()));
                break;
        }
    }


    @Override
    public void onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis())
        {
            backToast.cancel();
            finishAffinity();
            finish();
        }
        else
        {
            backToast = Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}