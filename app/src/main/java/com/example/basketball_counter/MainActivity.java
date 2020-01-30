package com.example.basketball_counter;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
import java.util.Locale;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int teamAscore = 0;
    int teamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus3pointsB(View view){
        teamBscore = teamBscore + 3;
        displayB(teamBscore);

    }
    public void plus2pointsB(View view){
        teamBscore = teamBscore + 2;
        displayB(teamBscore);
    }
    public void freethrowB(View view){
        teamBscore++;
        displayB(teamBscore);
    }
    public void resetB(View view){
        teamBscore = 0;
        displayB(teamBscore);
    }


    public void plus3pointsA(View view){
        teamAscore = teamAscore + 3;
        displayA(teamAscore);

    }
    public void plus2pointsA(View view){
        teamAscore = teamAscore + 2;
        displayA(teamAscore);
    }
    public void freethrowA(View view){
        teamAscore++;
        displayA(teamAscore);
    }
    public void resetA(View view){
        teamAscore = 0;
        displayA(teamAscore);
    }
    private void displayA(int number){
        TextView scoreTextView = findViewById(R.id.scoreTeamA);
        scoreTextView.setText("" + number);
    }
    private void displayB(int number){
        TextView scoreTextView = findViewById(R.id.scoreTeamB);
        scoreTextView.setText("" + number);
    }
}
