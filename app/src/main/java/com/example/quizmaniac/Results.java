package com.example.quizmaniac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

public class Results extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    AnyChartView chartMarkings;
    TextView tvScore;
    int correct = 0, wrong = 0, unanswered = 0, score;
    private long pressedTime = 0;
    private Toast showToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        chartMarkings = findViewById(R.id.chartMarkings);
        tvScore = findViewById(R.id.tvScore);

        switch (Quiz.option)
        {
            case "cinema":
                resultCalculate(ApplicationClass.cinema, Quiz.optionMarked, Quiz.questionNumbers);
                break;
            case "gk":
                resultCalculate(ApplicationClass.gk, Quiz.optionMarked, Quiz.questionNumbers);
                break;
            case "science":
                resultCalculate(ApplicationClass.science, Quiz.optionMarked, Quiz.questionNumbers);
                break;
            case "literature":
                resultCalculate(ApplicationClass.literature, Quiz.optionMarked, Quiz.questionNumbers);
                break;
            case "sports":
                resultCalculate(ApplicationClass.sports, Quiz.optionMarked, Quiz.questionNumbers);
                break;
            case "history":
                resultCalculate(ApplicationClass.history, Quiz.optionMarked, Quiz.questionNumbers);
                break;
        }
    }


    private void resultCalculate(ArrayList<Question> questions, char[] optionMarked, int[] questionNumbers)
    {
        for(byte i = 0; i < questionNumbers.length; i++)
        {
            if(optionMarked[i] == 'N')
                unanswered++;
            else if(questions.get(questionNumbers[i]).getAnswer() == optionMarked[i])
                correct++;
            else
                wrong++;
        }

        chartSetup();

        score = (correct*2) - wrong;
        tvScore.setText(String.format(getString(R.string.scored), score));

        prepareAnswers(questions, optionMarked, questionNumbers);
    }


    private void chartSetup()
    {
        Pie pie = AnyChart.pie();

        List<DataEntry> dataEntries = new ArrayList<>();
        dataEntries.add(new ValueDataEntry("Correct", correct));
        dataEntries.add(new ValueDataEntry("Wrong", wrong));
        dataEntries.add(new ValueDataEntry("Unanswered", unanswered));

        pie.data(dataEntries);
        pie.background().stroke("5 black");
        chartMarkings.setChart(pie);
    }


    private void prepareAnswers(ArrayList<Question> categoryQuestions, char[] optionMarked, int[] questionNumbers)
    {
        recyclerView = findViewById(R.id.correctAnswers);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new ResultQuestionAdapter(this, categoryQuestions, optionMarked, questionNumbers);
        recyclerView.setAdapter(myAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.game_menu, menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.item_restart)
        {
            if(pressedTime + 2000 > System.currentTimeMillis())
            {
                showToast.cancel();
                Intent intent = new Intent(this, com.example.quizmaniac.MainActivity.class);
                startActivity(intent);
            }
            else
            {
                showToast = Toast.makeText(this, "Press again to restart", Toast.LENGTH_SHORT);
                showToast.show();
            }

            pressedTime = System.currentTimeMillis();
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        if(pressedTime + 2000 > System.currentTimeMillis())
        {
            showToast.cancel();
            finishAffinity();
            finish();
        }
        else
        {
            showToast = Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT);
            showToast.show();
        }

        pressedTime = System.currentTimeMillis();
    }
}