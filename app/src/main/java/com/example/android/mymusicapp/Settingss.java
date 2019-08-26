package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Settingss extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_settingss );

        ArrayList<String> settings = new ArrayList<>();

        settings.add( "Filter settings" );
        settings.add( "Timmer" );
        settings.add( "Home screen lyrics" );
        settings.add( "Screen rotation" );
        settings.add( "Clear cache" );
        settings.add( "About" );

        ArrayAdapter<String> songAdapter = new ArrayAdapter( this, android.R.layout.simple_expandable_list_item_1, settings );
        ListView songListView = findViewById( R.id.settingsId );
        songListView.setAdapter( songAdapter );
    }
}
