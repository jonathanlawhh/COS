package com.cos.jon.cos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HappyBoy on 19/10/2016.
 */

public class HistoryFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_history, container, false);

        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.balance);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Your balance is RMxx.xx", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });
        return rootView;
}}
