package com.example.inclassassignment07_lingyiz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final int PEOPLE_REQUEST_CODE = 1;
    String summary;

    TextView displayPanel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayPanel = findViewById(R.id.displayPanel);
    }


    public void submit(View view) {
        //go to second window
        Intent toInputWindow = new Intent(this, InputWindow.class);
        startActivityForResult(toInputWindow, PEOPLE_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PEOPLE_REQUEST_CODE) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                //change display panel
                displayPanel.setText(finalizeDisplayPanel());
            }
        }
    }

    String finalizeDisplayPanel(){
        summary = "getExtra here";
        return summary;
    }
}
