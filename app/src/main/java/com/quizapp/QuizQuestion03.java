package com.quizapp;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class QuizQuestion03 extends MyDataClass {

    Button b11;
    Button b12;
    Button b13;
    Button b14;
    public int result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question03);

        //Remove status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);
        b14=findViewById(R.id.b14);

    }
    public void openQuizQuestion02() {
        Intent intent = new Intent(QuizQuestion03.this, QuizQuestion04.class);
        startActivity(intent);
    }

    public void forDelay(){
        Runnable r = () -> {
            openQuizQuestion02();
            finish();
        };

        Handler handler = new Handler();
        // The Runnable will be executed after the given delay time
        handler.postDelayed(r, 2000); // will be delayed for 1.5 seconds
    }



    public void greenColor(View v){
        //To freeze buttons

        b11.setClickable(false);
        b12.setClickable(false);
        b13.setClickable(false);
        b14.setClickable(false);
        //To change button colour
        b12.setBackgroundColor(Color.GREEN);
        MyDataClass.result+=1;
        //Toast
        Toast.makeText(QuizQuestion03.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
        //To delay activity change and to change activity after delay
        forDelay();

    }



    public void redColor1(View v){
        //To freeze buttons

        b11.setClickable(false);
        b12.setClickable(false);
        b13.setClickable(false);
        b14.setClickable(false);
        b11.setBackgroundColor(Color.RED);
        Toast.makeText(QuizQuestion03.this, "Incorrect Answer!", Toast.LENGTH_SHORT).show();
        forDelay();

    }


    public void redColor2(View v){
        //To freeze buttons

        b11.setClickable(false);
        b12.setClickable(false);
        b13.setClickable(false);
        b14.setClickable(false);
        b13.setBackgroundColor(Color.RED);
        Toast.makeText(QuizQuestion03.this, "Incorrect Answer!", Toast.LENGTH_SHORT).show();
        forDelay();
    }

    public void redColor3(View v){
        //To freeze buttons
        b11.setClickable(false);
        b12.setClickable(false);
        b13.setClickable(false);
        b14.setClickable(false);
        b14.setBackgroundColor(Color.RED);
        Toast.makeText(QuizQuestion03.this, "Incorrect Answer!", Toast.LENGTH_SHORT).show();
        forDelay();
    }

}