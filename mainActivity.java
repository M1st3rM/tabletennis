package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score_a, score_b, game_a, game_b;
 
    public void display_points_a(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_points);
        scoreView.setText(String.valueOf(score));
    }

    public void display_games_a(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_games);
        scoreView.setText(String.valueOf(score));
    }

    public  void point_a (View v)
    {
        score_a = score_a + 1;
        display_points_a(score_a);
    }
    public  void game_a (View v)
    {
        game_a = game_a + 1;
        display_games_a(game_a);
    }







    public void display_points_b(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_points);
        scoreView.setText(String.valueOf(score));
    }

    public void display_games_b(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_games);
        scoreView.setText(String.valueOf(score));
    }


    public  void point_b (View v)
    {
        score_b = score_b + 1;
        display_points_b(score_b);
    }

    public  void game_b (View v)
    {
        game_b = game_b + 1;
        display_games_b(game_b);
    }
public void reset (View v)
{
    score_a= 0;
    score_b= 0;
    game_a = 0;
    game_b = 0;
    display_points_a(score_a);
    display_games_a(game_a);
    display_points_b(score_b);
    display_games_b(game_b);
}

}
