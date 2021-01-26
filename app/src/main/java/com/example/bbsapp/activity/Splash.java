package com.example.bbsapp.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.bbsapp.MainActivity;
import com.example.bbsapp.R;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer timer = new Timer();
        timer.schedule(timerTask, 2000);
    }

    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            startActivity(new Intent(Splash.this, MainActivity.class));
        }
    };

}