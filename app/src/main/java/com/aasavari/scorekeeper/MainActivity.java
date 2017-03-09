package com.aasavari.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.aasavari.scorekeeper.R.id.teamBNoBall;
import static com.aasavari.scorekeeper.R.id.teamBSixer;
import static com.aasavari.scorekeeper.R.id.teamBWideBall;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    TextView scoreAView;
    TextView scoreBView;
    Button teamBBoundary;
    Button teamBSixer;
    Button teamBNoBall;
    Button teamBWideBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //locating all the xml views by id
        scoreAView = (TextView) findViewById(R.id.team_a_score);
        scoreBView = (TextView) findViewById(R.id.team_b_score);
        teamBBoundary = (Button) findViewById(R.id.teamBBoundary);
        teamBSixer = (Button) findViewById(R.id.teamBSixer);
        teamBNoBall = (Button) findViewById(R.id.teamBNoBall);
        teamBWideBall = (Button) findViewById(R.id.teamBWideBall);

        //setting event listeners for the 4 Team B buttons to separate the UI from the logic

        teamBBoundary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFourForTeamB(v);
            }
        });

        teamBSixer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSixForTeamB(v);
            }
        });

        teamBNoBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOneForTeamB(v);
            }
        });

        teamBWideBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOneForTeamB(v);
            }
        });
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreAView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        scoreBView.setText(String.valueOf(score));
    }

    public void addFourForTeamA(View view) {
        scoreTeamA += 4;
        displayForTeamA(scoreTeamA);
    }

    public void addSixForTeamA(View view) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void addFourForTeamB(View view) {
        scoreTeamB += 4;
        displayForTeamB(scoreTeamB);
    }

    public void addSixForTeamB(View view) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void onReset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
