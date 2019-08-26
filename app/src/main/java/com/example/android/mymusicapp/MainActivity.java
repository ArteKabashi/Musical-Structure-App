package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        button1 = findViewById( R.id.button1 );
        button2 = findViewById( R.id.button2 );
        button3 = findViewById( R.id.button3 );
        button4 = findViewById( R.id.button4);

        button1.setOnClickListener( this );
        button2.setOnClickListener( this );
        button3.setOnClickListener( this );
        button4.setOnClickListener( this );
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                openMusic();
                break;
            case R.id.button2:
                openPlaylist();
                break;
            case R.id.button3:
                openSettings();
                break;
            case R.id.button4:
                openYoutube();
                break;
        }
    }

    public void openMusic() {
        Intent i = new Intent( this, Music.class );
        startActivity( i );
    }

    public void openPlaylist() {
        Intent j = new Intent( this, MusicPlaylist.class );
        startActivity( j );
    }

    public void openSettings() {
        Intent k = new Intent( this, Settingss.class );
        startActivity( k );
    }

    public void openYoutube() {
        Intent l = new Intent( this, Youtube.class );
        startActivity( l );
    }
}


