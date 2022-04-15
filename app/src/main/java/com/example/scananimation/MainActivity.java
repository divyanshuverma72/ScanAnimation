package com.example.scananimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView avatar;
    private ImageView line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avatar = findViewById(R.id.avatar);
        line = findViewById(R.id.line);

        startDown();
    }

    private void startUp() {
        new Handler().postDelayed(() -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_up);
            line.startAnimation(animation);
            startDown();
        }, 800);
    }

    private void startDown() {
        new Handler().postDelayed(() -> {
            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_down);
            line.startAnimation(animation);
            startUp();
        }, 800);
    }
}