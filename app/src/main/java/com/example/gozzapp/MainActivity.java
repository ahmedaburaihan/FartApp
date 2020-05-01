package com.example.gozzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ImageView makhdoom, raziq, javed, sher, hayat, abdullah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.newsexy);
        mp.start();

        makhdoom = findViewById(R.id.makhdoom);
        makhdoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fartmakhdoom);
                mp.start();
                Toast.makeText(MainActivity.this, "گوز مخدوم اساس است", Toast.LENGTH_SHORT).show();
            }
        });


        raziq = findViewById(R.id.raziq);
        raziq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fartraziq);
                mp.start();
                Toast.makeText(MainActivity.this, "گوز رازق لباس است", Toast.LENGTH_SHORT).show();
            }
        });


        sher = findViewById(R.id.sher);
        sher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.farthayat);
                mp.start();
                Toast.makeText(MainActivity.this, "گوز شیرگ بلا است", Toast.LENGTH_SHORT).show();
            }
        });

        javed = findViewById(R.id.javed);
        javed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fartjaved);
                mp.start();
                Toast.makeText(MainActivity.this, "گوز جاوید دَرافشا است", Toast.LENGTH_SHORT).show();
            }
        });


        hayat = findViewById(R.id.hayat);
        hayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fartsherag);
                mp.start();
                Toast.makeText(MainActivity.this, "گوز حیات جلا  است", Toast.LENGTH_SHORT).show();
            }
        });


        abdullah = findViewById(R.id.abdullah);
        abdullah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fartabdullah);
                mp.start();
                Toast.makeText(MainActivity.this, "گوز عبدالله دوا است", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
