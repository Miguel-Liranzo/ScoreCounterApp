package com.example.scorecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    TextView teamName;
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        Intent intent = getIntent();

        String winningTeam = intent.getStringExtra("Team");
        String scoreDiff = intent.getStringExtra("scoreDiff");


        teamName = findViewById(R.id.team_name);
        score = findViewById(R.id.score_diff);

        teamName.setText(winningTeam + " wins!");
        score.setText(scoreDiff + " pts");
    }
}