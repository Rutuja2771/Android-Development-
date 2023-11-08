package com.example.practice_prac9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    TextView receivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        receivedText =findViewById(R.id.receivedText);

        Intent a = getIntent();
        String str = a.getStringExtra("name");
        String str1 = a.getStringExtra("food");
        String str2 = a.getStringExtra("drinks");
        receivedText.setText("Customer name : "+str+" \n\tDish is "+str1+" \n\twith "+str2+" as drink");

    }
}