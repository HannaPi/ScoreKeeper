package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds one point for Player 1.
     */
    public void increment_1_p1(View view) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Deducts 1 point from Player 1 score.
     */
    public void decrement_1_p1(View view) {
        if (scorePlayer1 == 0) {
            return;
        } else {
            scorePlayer1 = scorePlayer1 - 1;
        }
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Resets the score of Player 1.
     */
    public void reset_p1(View view) {
        scorePlayer1 = 0;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Adds one point for Player 2.
     */
    public void increment_1_p2(View view) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Deducts 1 point from Player 2 score.
     */
    public void decrement_1_p2(View view) {
        if (scorePlayer2 == 0) {
            return;
        } else {
            scorePlayer2 = scorePlayer2 - 1;
        }
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Resets the score of Player 2.
     */
    public void reset_p2(View view) {
        scorePlayer2 = 0;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Resets the score for both players.
     */
    public void reset(View view) {
        scorePlayer1 = 0;
        displayForPlayer1(scorePlayer1);
        scorePlayer2 = 0;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int scorePlayer1) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(scorePlayer1));
    }

    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayer2(int scorePlayer2) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(scorePlayer2));
    }
}

