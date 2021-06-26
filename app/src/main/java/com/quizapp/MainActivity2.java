package com.quizapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends MyDataClass {
    Button btn_start;
    TextView et_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        //Remove status bar
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //setContentView(R.layout.activity_main2);

        btn_start=findViewById(R.id.btn_start);
        et_name=findViewById(R.id.et_name);
        btn_start.setOnClickListener(v -> {
            if(et_name.getText().toString().isEmpty()) {
                Toast.makeText(MainActivity2.this, "Please enter your name", Toast.LENGTH_SHORT).show();
            }
            else {
                openQuizQuestion01();
            }
        });

    }

    public void openQuizQuestion01() {
        Intent intent = new Intent(MainActivity2.this, QuizQuestion01.class);
        startActivity(intent);
    }

}