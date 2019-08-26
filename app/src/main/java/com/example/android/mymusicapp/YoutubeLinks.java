package com.example.android.mymusicapp;

public class YoutubeLinks {

    private String songName;
    private String url;

    public YoutubeLinks(String songName, String url) {
        this.songName = songName;
        this.url = url;
    }

    public String getSongName() {
        return songName;
    }

    public String getUrl() {
        return url;
    }
}

