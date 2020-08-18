package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editTextNum1;
    EditText editTextNum2;
    TextView lblSum;        //can use id value or else anything

    String number1;
    String number2;

    int n1;
    int n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTextNum1 = findViewById(R.id.editTextNum1);
        editTextNum2 = findViewById(R.id.editTextNum2);
        lblSum = findViewById(R.id.lblSum);


        Intent intent = getIntent();

         number1 = intent.getStringExtra("n1");
         number2 = intent.getStringExtra("n2");

        editTextNum1.setText(number1);
        editTextNum2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

    }
    public void add(View view){
        lblSum.setText(number1 + "+" + number2 + "=" + (n1+n2));
    }

    public void sub(View view){
        lblSum.setText(number1 + "-" + number2 + "=" + (n1-n2));
    }
    public void mul(View view){
        lblSum.setText(number1 + "X" + number2 + "=" + (n1*n2));
    }
    public void div(View view){
        lblSum.setText(number1 + "/" + number2 + "=" + (n1/n2));
    }
}