package com.example.quizmaniac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clicked(View v)
    {

        int id = v.getId();
        Intent intent = new Intent(this, Instructions.class);

        switch (id)
        {
            case R.id.cvSports:
                intent.putExtra("option", "sports");
                break;
            case R.id.cvCinema:
                intent.putExtra("option", "cinema");
                break;
            case R.id.cvGK:
                intent.putExtra("option", "gk");
                break;
            case R.id.cvHistory:
                intent.putExtra("option", "history");
                break;
            case R.id.cvLiterature:
                intent.putExtra("option", "literature");
                break;
            case R.id.cvScience:
                intent.putExtra("option", "science");
        }

        startActivity(intent);
    }
}