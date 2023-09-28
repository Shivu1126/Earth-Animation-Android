package com.androidwithshiv.earth3d;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView star, world;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        star = findViewById(R.id.stars);
        world = findViewById(R.id.earth);

        float screenWidth =getResources().getDisplayMetrics().widthPixels;
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(star, "translationX", -screenWidth,1 );
        objectAnimator.setInterpolator(new LinearInterpolator());
        objectAnimator.setDuration(30000);
        objectAnimator.setRepeatMode(ObjectAnimator.REVERSE);
        objectAnimator.setRepeatCount(ObjectAnimator.INFINITE);
        objectAnimator.start();

        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(world, "translationX", 1,-screenWidth );
        objectAnimator2.setInterpolator(new LinearInterpolator());
        objectAnimator2.setDuration(30000);
        objectAnimator2.setRepeatMode(ObjectAnimator.REVERSE);
        objectAnimator2.setRepeatCount(ObjectAnimator.INFINITE);
        objectAnimator2.start();
    }
}