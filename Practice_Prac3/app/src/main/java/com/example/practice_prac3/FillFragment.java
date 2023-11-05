package com.example.practice_prac3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FillFragment extends Fragment {

    View view;
    EditText textName;
    Button button2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_fill, container, false);

        textName= view.findViewById(R.id.textName);
        button2 = view.findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = textName.getText().toString();
                Bundle bund = new Bundle();
                bund.putString("Name", str);

                getParentFragmentManager().setFragmentResult("User data", bund);
            }
        });

        return view;
    }
}