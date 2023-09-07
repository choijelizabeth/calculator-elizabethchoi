package com.example.calculator_elizabethchoi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
    enterNum method to hold numbers for textView
     */
    public void enterNum0(View v){
        Button num0 = findViewById(R.id.button0);
        int num;

        if(num0.getText().toString().equals("0")){
            num = 0;
        }

    }
}