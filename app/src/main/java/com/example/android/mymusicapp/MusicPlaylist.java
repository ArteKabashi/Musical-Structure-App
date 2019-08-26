package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MusicPlaylist extends AppCompatActivity implements View.OnClickListener {
        Button newPlayListButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_music_playlist);

            newPlayListButton = findViewById( R.id.create_album_btn );
            newPlayListButton.setOnClickListener( this );
        }

        @Override
        public void onClick(View v) {
            Toast.makeText( this, "Create a new Playlist", Toast.LENGTH_SHORT ).show();
        }
    }
