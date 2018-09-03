package com.inducesmile.androidpayexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SingleLyricActivity extends AppCompatActivity {
    ImageView loadingLeaf;
    private int height;
    private Timer timer;
    private int leafFallDuration = 6000;
    private int leafRotationDuration = 900;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_lyric);
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        LyricSongAdapter lyricSongAdapter = new LyricSongAdapter(this);
        TextView textViewLyric=(TextView)findViewById(R.id.textViewLyric);
        textViewLyric.setText(lyricSongAdapter.lyricsTextViews[position]);

    }

}
