package com.cos.jon.cos;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by HappyBoy on 19/10/2016.
 */

public class FoodTrayFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_foodtray, container, false);

        Button button = (Button) rootView.findViewById(R.id.cancelorder);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Cancel order?");
                builder.setMessage("There will be no refund")
                        .setPositiveButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        })
                        .setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(getActivity(), "Your order has been cancelled.",
                                        Toast.LENGTH_LONG).show();
                            }
                        });


                builder.show();
            }
            });

        return rootView;
        }
    }

