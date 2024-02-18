package com.example.aquaapplication;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class WaterFragment extends Fragment {

    Activity context1;
    Activity context2;



    public WaterFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context1 = getActivity();
        context2= getActivity();

        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_water, container, false);
        return view;
        };

    public void onStart(){
        super.onStart();
        Button btn = (Button)context1.findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context1,qualityreport.class);
                startActivity(intent);
            }
        });
    }
    public void onStop(){
        super.onStop();
        Button btn = (Button)context2.findViewById(R.id.button7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(context2,trackreport.class);
                startActivity(intent2);


            }
        });
    }
            }
