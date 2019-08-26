package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PlayMusic extends AppCompatActivity implements View.OnClickListener {
    Button previousSongBtn;
    Button nextSongBtn;
    Button playSongBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_play_music );

        previousSongBtn = findViewById( R.id.previousButton );
        nextSongBtn = findViewById( R.id.nextButton );
        playSongBtn = findViewById( R.id.playButton );

        previousSongBtn.setOnClickListener( this );
        playSongBtn.setOnClickListener( this );
        nextSongBtn.setOnClickListener( this );
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.previousButton:
                Toast.makeText( this, "Play previous Song", Toast.LENGTH_SHORT ).show();
                break;
            case R.id.playButton:
                Toast.makeText( this, "Play song", Toast.LENGTH_SHORT ).show();
                break;
            case R.id.nextButton:
                Toast.makeText( this, "Play next song", Toast.LENGTH_SHORT ).show();
                break;

        }
    }
}

