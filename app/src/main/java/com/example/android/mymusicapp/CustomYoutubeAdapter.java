package com.example.android.mymusicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomYoutubeAdapter extends RecyclerView.Adapter<CustomYoutubeAdapter.CustomViewHolder> {
    private ArrayList<YoutubeLinks> WatchItInYoutube;
    private Context contextOne;

    public static class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewYt;
        public TextView urlYoutube;
        public RelativeLayout itemYoutube;

        public CustomViewHolder(View itemViewyt) {
            super( itemViewyt );
            textViewYt = itemViewyt.findViewById( R.id.song_name );
            urlYoutube = itemViewyt.findViewById( R.id.song_link );
            itemYoutube = itemViewyt.findViewById( R.id.itemYoutubeId );
        }
    }

    public CustomYoutubeAdapter(ArrayList<YoutubeLinks> watchItInYoutube) {
        WatchItInYoutube = watchItInYoutube;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewOne = LayoutInflater.from( parent.getContext() ).inflate( R.layout.youtube_item, parent, false );
        CustomViewHolder customViewHolderOne = new CustomViewHolder( viewOne );
        return customViewHolderOne;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, final int position) {
        final YoutubeLinks currentYoutubeLinks = WatchItInYoutube.get( position );

        customViewHolder.textViewYt.setText( currentYoutubeLinks.getSongName() );
        customViewHolder.urlYoutube.setText( currentYoutubeLinks.getUrl() );
    }

    @Override
    public int getItemCount() {
        return WatchItInYoutube.size();
    }
}
