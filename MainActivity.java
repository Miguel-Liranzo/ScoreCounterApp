package com.example.scorecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView teamOne;
    private TextView teamTwo;
    private int teamOneScore;
    private int teamTwoScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamOneScore = 0;
        teamTwoScore = 0;

        teamOne = findViewById(R.id.tv_team_one_score);
        teamOne.setText(String.valueOf(teamOneScore));

        teamTwo = findViewById(R.id.tv_team_two_score);
        teamTwo.setText(String.valueOf(teamTwoScore));

    }

    public void incrementTeamOne(View view) {
        teamOne.setText(String.valueOf(++teamOneScore));

        if(teamOneScore == 5) {
            Intent intent = new Intent(this, WinnerActivity.class);

            intent.putExtra("Team", "Team 1");
            intent.putExtra("scoreDiff", String.valueOf(teamOneScore - teamTwoScore));

            startActivity(intent);
        }
    }

    public void incrementTeamTwo(View view) {
        teamTwo.setText(String.valueOf(++teamTwoScore));

        if(teamTwoScore == 5) {
            Intent intent = new Intent(this, WinnerActivity.class);

            intent.putExtra("Team", "Team 2");
            intent.putExtra("scoreDiff", String.valueOf(teamTwoScore - teamOneScore));

            startActivity(intent);
        }
    }
}