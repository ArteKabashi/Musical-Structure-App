package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Youtube extends AppCompatActivity {
    private RecyclerView recyclerViewYt;
    private RecyclerView.Adapter AdapterYt;
    private RecyclerView.LayoutManager LayoutManagerYt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_youtube );

        ArrayList<YoutubeLinks> watchItInYoutube = new ArrayList<>();

        watchItInYoutube.add( new YoutubeLinks( "Bebe Rexha - Small Doses", "www.youtube.com/watch?v=hkafKITOlVA" ) );
        watchItInYoutube.add( new YoutubeLinks( "Charli XCX - 5 In The Morning", "www.youtube.com/watch?v=4qyUb4OU_P8" ) );
        watchItInYoutube.add( new YoutubeLinks( "Dardan - Krone", "www.youtube.com/watch?v=Ih_FvdBb6bs" ) );
        watchItInYoutube.add( new YoutubeLinks( "Queen - I Wanna Break Free", "www.youtube.com/watch?v=f4Mc-NYPHaQ" ) );
        watchItInYoutube.add( new YoutubeLinks( "Queen - Crazy Little Thing Called Love", "www.youtube.com/watch?v=zO6D_BAuYCI" ) );
        watchItInYoutube.add( new YoutubeLinks( "Queen - Killer Queen", "https://www.youtube.com/watch?v=2ZBtPf7FOoM" ) );
        watchItInYoutube.add( new YoutubeLinks( "Queen - Under Pressure", "https://www.youtube.com/watch?v=a01QQZyl-_I" ) );
        watchItInYoutube.add( new YoutubeLinks( "Queen - Don't Stop Me Now", "https://www.youtube.com/watch?v=HgzGwKwLmgM" ) );
        watchItInYoutube.add( new YoutubeLinks( "Coldplay - Viva La Vida", "https://www.youtube.com/watch?v=dvgZkm1xWPE" ) );
        watchItInYoutube.add( new YoutubeLinks( "Coldplay - Paradise", "https://www.youtube.com/watch?v=1G4isv_Fylg" ) );
        watchItInYoutube.add( new YoutubeLinks( "Coldplay - Clocks", "https://www.youtube.com/watch?v=d020hcWA_Wg" ) );
        watchItInYoutube.add( new YoutubeLinks( "Coldplay - Magic", "https://www.youtube.com/watch?v=Qtb11P1FWnc" ) );
        watchItInYoutube.add( new YoutubeLinks( "Coldplay - Princess Of China ft. Rihanna", "https://www.youtube.com/watch?v=1Uw6ZkbsAH8" ) );
        watchItInYoutube.add( new YoutubeLinks( "Imagine Dragons - Next To Me", "https://www.youtube.com/watch?v=-C_rvt0SwLE" ) );
        watchItInYoutube.add( new YoutubeLinks( "Imagine Dragons - Gold", "https://www.youtube.com/watch?v=Rl3ELiPXFRo" ) );
        watchItInYoutube.add( new YoutubeLinks( "Miike Snow - Genghis Khan", "https://www.youtube.com/watch?v=P_SlAzsXa7E" ) );
        watchItInYoutube.add( new YoutubeLinks( "Cher Lloyd - None Of My Business", "https://www.youtube.com/watch?v=IMeFI0eVk2w" ) );
        watchItInYoutube.add( new YoutubeLinks( "DNCE - Cake By The Ocean", "https://www.youtube.com/watch?v=vWaRiD5ym74" ) );
        watchItInYoutube.add( new YoutubeLinks( "R.E.M. - Losing My Religion", "https://www.youtube.com/watch?v=xwtdhWltSIg" ) );
        watchItInYoutube.add( new YoutubeLinks( "Yusuf (Cat Stevens) - Dont Let Me Be Misunderstood", "https://www.youtube.com/watch?v=LX2e_yl8m9g" ) );

        recyclerViewYt = findViewById( R.id.youtubeRecycleView );
        recyclerViewYt.setHasFixedSize( true );
        LayoutManagerYt = new LinearLayoutManager( this );
        AdapterYt = new CustomYoutubeAdapter( watchItInYoutube );
        recyclerViewYt.setLayoutManager( LayoutManagerYt );
        recyclerViewYt.setAdapter( AdapterYt );
    }
}