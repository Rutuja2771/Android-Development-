package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    // Using ArrayList to store images data
    ArrayList Img = new ArrayList<>(Arrays.asList(
            R.drawable.india, R.drawable.japan,
            R.drawable.australia, R.drawable.china,
            R.drawable.egypt, R.drawable.england,
            R.drawable.france, R.drawable.germany,
            R.drawable.italy, R.drawable.southkorea,
            R.drawable.thailand, R.drawable.russia,
            R.drawable.newzealand));
    ArrayList Name = new ArrayList<>(Arrays.asList("\tIndia\n\tNew Delhi", "\tJapan\n\tTokyo",
            "\tAustralia\n\tCanberra",
            "\tChina\n\tBeijing", "\tEgypt\n\tCairo", "\tEngland\n\tLondon", "\tFrance\n\tParis",
            "\tGermany\n\tBerlin",
            "\tItaly\n\tRome" ,"\tSouth Korea\n\tSeoul","\tThailand\n\tBangkok","\tRussia\n\tMoscow",
            "\tNew Zealand\n\tWellington"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Getting reference of recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // Setting the layout as linear
        // layout for vertical orientation
        LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        // Sending reference and data to Adapter
        Adapter adapter = new Adapter(MainActivity.this, Img, Name);
        // Setting Adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
