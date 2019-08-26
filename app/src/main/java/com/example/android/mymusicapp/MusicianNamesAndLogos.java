package com.example.android.mymusicapp;

public class MusicianNamesAndLogos {
        private String ArtistName;
        private int ArtistLogo;

        public MusicianNamesAndLogos(String artistName, int artistLogo) {
            ArtistName = artistName;
            ArtistLogo = artistLogo;
        }

        public int getArtistLogo(int position) {

            return ArtistLogo;
        }

        public String getArtistName(int position) {
            return ArtistName;
        }
    }
