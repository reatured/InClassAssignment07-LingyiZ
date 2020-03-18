package com.example.inclassassignment07_lingyiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InputWindow extends AppCompatActivity {


    EditText name, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_window);
        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
    }

    public void submitPerson(View view){
        Person newPerson = new Person(name.getText().toString(), age.getText().toString());
        Intent data = new Intent();
        data.putExtra("Return", newPerson);
        setResult(RESULT_OK, data);
        finish();
    }
}
