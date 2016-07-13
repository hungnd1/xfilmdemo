package com.example.hungchelsea.film.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.hungchelsea.film.fragment.DesignDemoFragment;
import com.example.hungchelsea.film.models.Movie;
import com.example.hungchelsea.film.R;

import java.util.ArrayList;

/**
 * Created by HungChelsea on 04-Jul-16.
 */
public class DesignDemoRecyclerAdapter  extends RecyclerView.Adapter<DesignDemoRecyclerAdapter.ViewHolder>{

    private ArrayList<Movie> mItems;
    public DesignDemoFragment designDemoFragment;
    public Context context;
    public DesignDemoRecyclerAdapter(DesignDemoFragment designDemoFragment,ArrayList<Movie> items) {
        this.designDemoFragment = designDemoFragment;
        context = designDemoFragment.getContext();
        this.mItems = items;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, final int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Movie movie = mItems.get(i);
//        String item = mItems.get(i);
        //Toast.makeText(context.getApplicationContext(),item+"",Toast.LENGTH_LONG).show();
//        viewHolder.mTextView.setText(item);
        viewHolder.title.setText(movie.getTitle());
        viewHolder.genre.setText(movie.getGenre());
        viewHolder.year.setText(movie.getYear());
        viewHolder.index = i;
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        public  TextView mTextView,title,year,genre;

        int index;

        ViewHolder(View v) {
            super(v);
//            mTextView = (TextView)v.findViewById(R.id.list_item);
//            TextView mTextView = (TextView) v.findViewById(R.id.list_item);
//            mTextView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(v.getContext(),index+"",Toast.LENGTH_LONG).show();
//                }
//            });
            title = (TextView) v.findViewById(R.id.row_title);
            genre = (TextView) v.findViewById(R.id.genre);
            year  = (TextView) v.findViewById(R.id.year);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
