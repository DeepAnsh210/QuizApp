package com.quizapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class QuizResult extends MyDataClass {

    TextView score_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        //Remove status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        score_card=findViewById(R.id.score_card);
        String s=Integer.toString(result);
        score_card.setText(String.format("%s%s%s", getString(R.string.sr1), s, getString(R.string.sr2)));

    }




    public void restartQuiz(View v){
        Intent intent = new Intent(QuizResult.this, MainActivity.class);
        startActivity(intent);
    }
}