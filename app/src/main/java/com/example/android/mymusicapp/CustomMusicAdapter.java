package com.example.android.mymusicapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import de.hdodenhof.circleimageview.CircleImageView;

public class CustomMusicAdapter extends RecyclerView.Adapter<CustomMusicAdapter.CustomViewHolder> {
    private ArrayList<MusicianNamesAndLogos> MusicAndArtist;
    private Context contextOne;

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView imageViewOne;
        private TextView textViewOne;
        private RelativeLayout itemMainLayout;

        public CustomViewHolder(View itemView) {
            super( itemView );
            imageViewOne = itemView.findViewById( R.id.img_image1 );
            textViewOne = itemView.findViewById( R.id.txt_text1 );
            itemMainLayout = itemView.findViewById( R.id.mainitemId );
        }
    }

    public CustomMusicAdapter(ArrayList<MusicianNamesAndLogos> musicAndArtist, Context context) {
        MusicAndArtist = musicAndArtist;
        contextOne = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewOne = LayoutInflater.from( parent.getContext() ).inflate( R.layout.main_item1, parent, false );
        CustomViewHolder customViewHolderOne = new CustomViewHolder( viewOne );
        return customViewHolderOne;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, final int position) {
        final MusicianNamesAndLogos currentMusicanNamesAndLogo = MusicAndArtist.get( position );

        customViewHolder.imageViewOne.setImageResource( currentMusicanNamesAndLogo.getArtistLogo( position ) );
        customViewHolder.textViewOne.setText( currentMusicanNamesAndLogo.getArtistName( position ) );

        customViewHolder.itemMainLayout.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent( contextOne, PlayMusic.class );
                intent1.putExtra( "songName1", currentMusicanNamesAndLogo.getArtistName( position ) );
                intent1.putExtra( "imageArtist1", currentMusicanNamesAndLogo.getArtistLogo( position ) );
                contextOne.startActivity( intent1 );

            }
        } );
    }

    @Override
    public int getItemCount() {
        return MusicAndArtist.size();
    }
}
