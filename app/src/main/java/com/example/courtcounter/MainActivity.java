package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayScoreA(5);
    }

    public void displayScoreA(int num){
        TextView textview= (TextView) findViewById(R.id.team_a_score);
        textview.setText(String.valueOf(num));
    }

    public void twoPointsA(View view){
        scoreA=scoreA+2;
        displayScoreA(scoreA);
    }

    public void threePointsA(View view){
        scoreA=scoreA+3;
        displayScoreA(scoreA);
    }

    public void onePointA(View view){
        scoreA=scoreA+1;
        displayScoreA(scoreA);
    }

    public void displayScoreB(int num){
        TextView textview= (TextView) findViewById(R.id.team_b_score);
        textview.setText(String.valueOf(num));
    }

    public void twoPointsB(View view){
        scoreB=scoreB+2;
        displayScoreB(scoreB);
    }

    public void threePointsB(View view){
        scoreB=scoreB+3;
        displayScoreB(scoreB);
    }

    public void onePointB(View view){
        scoreB=scoreB+1;
        displayScoreB(scoreB);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);

    }
}
