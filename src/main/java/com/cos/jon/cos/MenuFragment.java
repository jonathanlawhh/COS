package com.cos.jon.cos;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by HappyBoy on 19/10/2016.
 */

public class MenuFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_menu, container, false);

        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.orderfab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Send to Food Tray?");
                builder.setMessage(R.string.orderedfood)
                        .setPositiveButton("Add!", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(getActivity(), "Your order has been placed !",
                                        Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNegativeButton("Not yet", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });


                builder.show();
            }
        });
        return rootView;

    }
}
