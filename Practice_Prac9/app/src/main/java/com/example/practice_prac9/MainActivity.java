package com.example.practice_prac9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editName, editFood;
    CheckBox drinkBox1, drinkBox2;
    Button button;

    String name , food, drinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editFood = findViewById(R.id.editFood);
        drinkBox1 = findViewById(R.id.drinkBox1);
        drinkBox2 = findViewById(R.id.drinkBox2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()){
                    name = editName.getText().toString();
                    food = editFood.getText().toString();

                    Intent a = new Intent(MainActivity.this, ShowActivity.class);

                    a.putExtra("name",name);
                    a.putExtra("food", food);
                    a.putExtra("drinks", drinks);

                    startActivity(a);
                }
            }
        });
    }

    private boolean validate(){
        drinks = "";
        if(drinkBox1.isChecked())
        {
            drinks += "GATORADE";
        } else if (drinkBox2.isChecked())
        {
            drinks += "SPRITE";
        }
        return true;
    }
}