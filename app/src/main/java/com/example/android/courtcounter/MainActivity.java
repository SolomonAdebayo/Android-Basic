package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when team A score three points .
     */
    public void three(View view) {

        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when team A score two points.
     */
    public void two(View view) {

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    /**
     * This method is called when team A score one point.
     */
    public void one(View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void resetA(View v) {
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * This method is called when team B score three points.
     */
    public void threeB(View view) {

        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    /**
     * This method is called when team B score two points.
     */
    public void twoB(View view) {

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when team B score one point.
     */
    public void oneB(View view) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetB(View v) {
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void setScoreTeamA(int scoreTeamA) {
        this.scoreTeamA = scoreTeamA;
    }

    public void setScoreTeamB(int scoreTeamB) {
        this.scoreTeamB = scoreTeamB;
    }
}