package com.example.learnbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class JackW extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jack_w);
    }
    public void play(View view){
        if(player==null){
            player = MediaPlayer.create(this,R.raw.bean);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause(View view){
        if (player != null){
            player.pause();
        }
    }
    public void stop(View view){
        stopPlayer();
    }

    private void stopPlayer(){
        if(player != null){
            player.release();
            player = null;
        }
    }
    @Override
    protected void onStop(){
        super.onStop();
        stopPlayer();
    }
}