package com.example.practice_prac3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayFragment<view> extends Fragment {

    View view;
    TextView nameDisplay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_display, container, false);

        nameDisplay = view.findViewById(R.id.nameDisplay);

        getParentFragmentManager().setFragmentResultListener("User data", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {

                String s1 = result.getString("Name");
                nameDisplay.setText(s1);
            }
        });

        return view;
    }

}










