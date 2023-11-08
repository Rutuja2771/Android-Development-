package com.example.practice_prac5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    private TextView nametextView, subjecttextView, degreetextView, gendertextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        nametextView = findViewById(R.id.nametextView);
        subjecttextView = findViewById(R.id.subjecttextView);
        degreetextView = findViewById(R.id.degreetextView);
        gendertextView = findViewById(R.id.gendertextView);

        Intent a = getIntent();
        String Name = a.getStringExtra("Name");
        String Subject = a.getStringExtra("Subject");
        String Gender = a.getStringExtra("Gender");
        String Degree = a.getStringExtra("Degree");

        nametextView.setText(Name);
        subjecttextView.setText(Subject);
        degreetextView.setText(Degree);
        gendertextView.setText(Gender);


    }
}












