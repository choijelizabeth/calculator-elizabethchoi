package com.example.calculator_elizabethchoi;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    EditText operator;
    String firstNum;
    String secNum;
    TextView result;
    String op;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.editTextEnter1);
        num2 = findViewById(R.id.editTextEnter2);
        operator = findViewById(R.id.editTextEnterOp);
        result = findViewById(R.id.textViewRes);
    }


    // Calculate answers
    public void math(View v) {
        firstNum = num1.getText().toString();
        secNum = num2.getText().toString();
        op = operator.getText().toString();
        /*
            Code for num1 and num2 vars found on abhiandroid.com,
             How To Create Calculator App In Android Studio: Step By Step Guide
             as well as line 61
         */
        double num1 = parseDouble(firstNum);
        double num2 = parseDouble(secNum);
        double res;

        //addition
        if(op.equals("+")){
            res = num1 + num2;
        }

        // subtraction
        else if(op.equals("-")){
            res = num1 - num2;
        }

        // multiplication
        else if(op.equals("x")){
            res = num1 * num2;
        }

        // division
        else{
            res = num1 / num2;
        }

        result.setText(Double.toString(res));
    }

    // Enter operator into text box
    public void enterX(View v){
        Button opVal = findViewById(R.id.buttonMultiply);
        String oper = opVal.getText().toString();

        operator.setText(oper);
    }

    public void enterDiv(View v){
        Button opVal = findViewById(R.id.buttonDivide);
        String oper = opVal.getText().toString();

        operator.setText(oper);
    }

    public void enterAdd(View v){
        Button opVal = findViewById(R.id.buttonAdd);
        String oper = opVal.getText().toString();

        operator.setText(oper);
    }

    public void enterSub(View v){
        Button opVal = findViewById(R.id.buttonSubtract);
        String oper = opVal.getText().toString();

        operator.setText(oper);
    }


    // Enter buttons into text boxes
    public void enterNum0(View v){
        Button numVal = findViewById(R.id.button0);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }
    public void enterNum1(View v){
        Button numVal = findViewById(R.id.button1);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }
    public void enterNum2(View v){
        Button numVal = findViewById(R.id.button2);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }
    public void enterNum3(View v){
        Button numVal = findViewById(R.id.button3);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }
    public void enterNum4(View v){
        Button numVal = findViewById(R.id.button4);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }
    public void enterNum5(View v){
        Button numVal = findViewById(R.id.button5);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }
    public void enterNum6(View v){
        Button numVal = findViewById(R.id.button6);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }
    public void enterNum7(View v){
        Button numVal = findViewById(R.id.button7);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }
    public void enterNum8(View v){
        Button numVal = findViewById(R.id.button8);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }
    public void enterNum9(View v){
        Button numVal = findViewById(R.id.button9);
        String num = numVal.getText().toString();

        if(num1.equals("")){
            num1.setText(num);
        }
        else{
            num2.setText(num);
        }
    }

}