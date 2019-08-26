package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

public class Music extends AppCompatActivity {
    public static ArrayList<MusicianNamesAndLogos> musicAndArtist;
    private RecyclerView recyclerViewOne;
    private RecyclerView.Adapter AdapterOne;
    private RecyclerView.LayoutManager LayoutManagerOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_music );

        musicAndArtist = new ArrayList<>();

        musicAndArtist.add( new MusicianNamesAndLogos( "Bebe Rexha - Small Doses", R.mipmap.beberexha ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Charli XCX - 5 In The Morning", R.mipmap.charliexcx ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Dardan - Krone", R.mipmap.dardankrone ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Queen - I Wanna Break Free", R.mipmap.queen ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Queen - Crazy Little Thing Called Love", R.mipmap.queen ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Queen - Killer Queen", R.mipmap.queen ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Queen - Under Pressure", R.mipmap.queen ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Queen - Don't Stop Me Now", R.mipmap.queen ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Coldplay - Viva La Vida", R.mipmap.coldplay ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Coldplay - Paradise", R.mipmap.coldplay ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Coldplay - Clocks", R.mipmap.coldplay ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Coldplay - Magic", R.mipmap.coldplay ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Coldplay - Princess Of China ft. Rihanna", R.mipmap.coldplay ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Imagine Dragons - Next To Me", R.mipmap.imaginegragons ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Imagine Dragons - Gold", R.mipmap.imaginegragons ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Miike Snow - Genghis Khan", R.mipmap.miikesnow ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Cher Lloyd - None Of My Business", R.mipmap.cherlloyd ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "DNCE - Cake By The Ocean", R.mipmap.dnce ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "R.E.M. - Losing My Religion", R.mipmap.rem ) );
        musicAndArtist.add( new MusicianNamesAndLogos( "Yusuf (Cat Stevens) - Dont Let Me Be Misunderstood", R.mipmap.yusufcat ) );

        recyclerViewOne = findViewById( R.id.recyclerView );
        recyclerViewOne.setHasFixedSize( true );
        LayoutManagerOne = new LinearLayoutManager( this );
        AdapterOne = new CustomMusicAdapter( musicAndArtist, this );
        recyclerViewOne.setLayoutManager( LayoutManagerOne );
        recyclerViewOne.setAdapter( AdapterOne );
    }
}

