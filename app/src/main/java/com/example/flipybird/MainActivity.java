package com.example.flipybird;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button start;
    int x = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.btn1);
        start.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ImageView cat = findViewById(R.id.imageView);
                cat.setImageResource(R.drawable.running);
                AnimationDrawable runningCat = (AnimationDrawable) cat.getDrawable();
                if(x==1)
                    runningCat.start();
                else
                    v.clearAnimation();
                x = 1-x;
            }
        });
    }
}