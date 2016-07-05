package com.example.hungchelsea.materialdesign.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hungchelsea.materialdesign.Adapter.DesignDemoRecyclerAdapter;
import com.example.hungchelsea.materialdesign.R;

import java.util.ArrayList;

/**
 * Created by HungChelsea on 04-Jul-16.
 */
public class DesignDemoFragment extends Fragment {
    int color;
    private static final String tab_postion = "tab_position";
    private ArrayList<String>  listString = new ArrayList<>();

    public DesignDemoFragment() {
    }

    public static DesignDemoFragment newInstance(int tabPosition) {
        DesignDemoFragment fragment = new DesignDemoFragment();
        Bundle args = new Bundle();
        args.putInt(tab_postion, tabPosition);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        int tabPosition = bundle.getInt(tab_postion);
        listString.add("hungchelsea");
        listString.add("hungcoi");

        View v = inflater.inflate(R.layout.fragment_list_view, container, false);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new DesignDemoRecyclerAdapter(this,listString));

        return v;
    }
}