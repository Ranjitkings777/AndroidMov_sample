package com.inducesmile.androidpayexample;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import co.mobiwise.library.InteractivePlayerView;
import co.mobiwise.library.OnActionClickedListener;

public class SongPlayerActivity extends AppCompatActivity implements OnActionClickedListener {
    TextView textViewSong_1,textViewSong_2,textViewSong_3;
    MediaPlayer mediaPlayer;
     double startTime,finalTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_player);
        textViewSong_1=(TextView)findViewById(R.id.textViewSong_1);
        textViewSong_2=(TextView)findViewById(R.id.textViewSong_2);
        textViewSong_3=(TextView)findViewById(R.id.textViewSong_3);
        final InteractivePlayerView mInteractivePlayerView = (InteractivePlayerView) findViewById(R.id.interactivePlayerView);
        mInteractivePlayerView.setMax(200);
        mInteractivePlayerView.setProgress(10);
        mInteractivePlayerView.setOnActionClickedListener(this);

        final ImageView imageView = (ImageView) findViewById(R.id.control);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mInteractivePlayerView.isPlaying()) {
                    mInteractivePlayerView.start();
                    imageView.setBackgroundResource(R.drawable.ic_action_pause);
                    Toast.makeText(getApplicationContext(),"Please click on song list to pause and play",Toast.LENGTH_SHORT).show();
                    } else {
                    mInteractivePlayerView.stop();
                    imageView.setBackgroundResource(R.drawable.ic_action_play);
                    Toast.makeText(getApplicationContext(),"Please click on song list to pause and play",Toast.LENGTH_SHORT).show();
                }
            }
        });
        textViewSong_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mInteractivePlayerView.isPlaying()) {
                    mInteractivePlayerView.start();
                    imageView.setBackgroundResource(R.drawable.ic_action_pause);
                    mediaPlayer= MediaPlayer.create(SongPlayerActivity.this,R.raw.paravashanadenu);
                    mediaPlayer.stop();
                    mediaPlayer= MediaPlayer.create(SongPlayerActivity.this,R.raw.hesarupoorthi);
                    mediaPlayer.stop();
                    mediaPlayer= MediaPlayer.create(SongPlayerActivity.this,R.raw.yavanigottu);
                    startTime=mediaPlayer.getCurrentPosition();
                    mInteractivePlayerView.setProgress( (int)startTime);
                    finalTime=mediaPlayer.getDuration();
                    mediaPlayer.start();
                } else {
                    mInteractivePlayerView.stop();
                   // mediaPlayer=MediaPlayer.create(SongPlayerActivity.this,R.raw.yavanigottu);
                    mediaPlayer.stop();
                    imageView.setBackgroundResource(R.drawable.ic_action_play);
                }
            }
        });
        //
        textViewSong_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mInteractivePlayerView.isPlaying()) {
                    mInteractivePlayerView.start();
                    imageView.setBackgroundResource(R.drawable.ic_action_pause);
                    mediaPlayer= MediaPlayer.create(SongPlayerActivity.this,R.raw.yavanigottu);
                    mediaPlayer.stop();
                    mediaPlayer= MediaPlayer.create(SongPlayerActivity.this,R.raw.hesarupoorthi);
                    mediaPlayer.stop();
                    mediaPlayer= MediaPlayer.create(SongPlayerActivity.this,R.raw.paravashanadenu);
                    startTime=mediaPlayer.getCurrentPosition();
                    mInteractivePlayerView.setProgress( (int)startTime);
                    finalTime=mediaPlayer.getDuration();
                    mediaPlayer.start();
                } else {
                    mInteractivePlayerView.stop();
                    // mediaPlayer=MediaPlayer.create(SongPlayerActivity.this,R.raw.paravashanadenu);
                    mediaPlayer.stop();
                    imageView.setBackgroundResource(R.drawable.ic_action_play);
                }
            }
        });
        //
        textViewSong_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mInteractivePlayerView.isPlaying()) {
                    mInteractivePlayerView.start();
                    imageView.setBackgroundResource(R.drawable.ic_action_pause);
                    mediaPlayer= MediaPlayer.create(SongPlayerActivity.this,R.raw.yavanigottu);
                    mediaPlayer.stop();
                    mediaPlayer= MediaPlayer.create(SongPlayerActivity.this,R.raw.paravashanadenu);
                    mediaPlayer.stop();
                    mediaPlayer= MediaPlayer.create(SongPlayerActivity.this,R.raw.hesarupoorthi);
                    startTime=mediaPlayer.getCurrentPosition();
                    mInteractivePlayerView.setProgress( (int)startTime);
                    finalTime=mediaPlayer.getDuration();
                    mediaPlayer.start();
                } else {
                    mInteractivePlayerView.stop();
                    // mediaPlayer=MediaPlayer.create(SongPlayerActivity.this,R.raw.hesarupoorthi);
                    mediaPlayer.stop();
                    imageView.setBackgroundResource(R.drawable.ic_action_play);
                }
            }
        });
    }

    @Override
    public void onActionClicked(int id) {
        switch (id) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
