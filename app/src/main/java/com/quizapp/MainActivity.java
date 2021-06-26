package com.quizapp;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends MyDataClass {
    //Splash Screen
    static int SPLASH_SCREEN_TIME_OUT=3000;
    //Animation
    Animation topAnim, bottomAnim;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Remove status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Splash Screen
        new Handler().postDelayed(() -> {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            //Intent is used to switch from one activity to another.

            startActivity(i);
            //invoke the SecondActivity.

            finish();
            //the current activity will get finished.
        }, SPLASH_SCREEN_TIME_OUT);


        //Animation
        topAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bottom_animation);
        //Hooks
        image = findViewById(R.id.imageView);
        image.setAnimation(topAnim);
    }


}