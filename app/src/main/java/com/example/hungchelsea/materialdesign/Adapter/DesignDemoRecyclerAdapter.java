package com.example.hungchelsea.materialdesign.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hungchelsea.materialdesign.Activity.MainActivity;
import com.example.hungchelsea.materialdesign.Fragment.DesignDemoFragment;
import com.example.hungchelsea.materialdesign.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HungChelsea on 04-Jul-16.
 */
public class DesignDemoRecyclerAdapter  extends RecyclerView.Adapter<DesignDemoRecyclerAdapter.ViewHolder>{

    private ArrayList<String> mItems;
    public DesignDemoFragment designDemoFragment;
    public Context context;
    public DesignDemoRecyclerAdapter(DesignDemoFragment designDemoFragment,ArrayList<String> items) {
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
        String item = mItems.get(i);
        //Toast.makeText(context.getApplicationContext(),item+"",Toast.LENGTH_LONG).show();
        viewHolder.mTextView.setText(item);
        viewHolder.index = i;
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        private final TextView mTextView;
        int index;

        ViewHolder(View v) {
            super(v);
            mTextView = (TextView)v.findViewById(R.id.list_item);
            TextView mTextView = (TextView) v.findViewById(R.id.list_item);
            mTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),index+"",Toast.LENGTH_LONG).show();
                }
            });
        }

        @Override
        public void onClick(View v) {

        }
    }
}
