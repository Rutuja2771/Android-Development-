package com.example.practice_prac5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    Spinner subjectSpinner;
    CheckBox checkbox, checkbox2;
    RadioGroup genderRadioGroup;
    RadioButton maleRadioButton, femaleRadioButton;
    Button submitButton;

    String Name, Subject, Degree, Gender;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName =findViewById(R.id.editName);
        checkbox =findViewById(R.id.checkbox);
        checkbox2 =findViewById(R.id.checkbox2);
        genderRadioGroup =findViewById(R.id.genderRadioGroup);
        maleRadioButton =findViewById(R.id.maleRadioButton);
        femaleRadioButton =findViewById(R.id.femaleRadioButton);
        submitButton =findViewById(R.id.submitButton);

        subjectSpinner = findViewById(R.id.subjectSpinner);
        List<String> subjects = new ArrayList<>();
        subjects.add("Android Development");
        subjects.add("FOC");
        subjects.add("Digital Marketing");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, subjects);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        subjectSpinner.setAdapter(adapter);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this , ShowActivity.class);
                if (validate()){
                    a.putExtra("Name",Name);
                    a.putExtra("Subject",Subject);
                    a.putExtra("Degree",Degree);
                    a.putExtra("Gender",Gender);
                    startActivity(a);
                }
            }
        });
    }

    protected boolean validate(){
        Name = editName.getText().toString();
        Subject= subjectSpinner.getSelectedItem().toString();
        Gender = maleRadioButton.isChecked()? "Male" : "Female";
        Degree = "";
        if(checkbox.isChecked()){
            Degree += "BE";
        }
        if(checkbox2.isChecked()){
            Degree += "BTech";
        }
        return true;
    }


}




