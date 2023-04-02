package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Plus = (Button) findViewById(R.id.button);
        Button Minus = (Button) findViewById(R.id.button2);
        Button Multiply = (Button) findViewById(R.id.button3);
        Button Divide = (Button) findViewById(R.id.button4);

        EditText t1 = (EditText) findViewById(R.id.editTextNumber);
        EditText t2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText t3 = (EditText) findViewById(R.id.editTextNumber3);

        Plus.setOnClickListener(e -> {
            String n1 = t1.getText().toString();
            String n2 = t2.getText().toString();
            int result =  Integer.parseInt(n1) + Integer.parseInt(n2);
            t3.setText("" + result);
        });

        Minus.setOnClickListener(e -> {
            String n1 = t1.getText().toString();
            String n2 = t2.getText().toString();
            int result =  Integer.parseInt(n1) - Integer.parseInt(n2);
            if (Integer.parseInt(n1) > Integer.parseInt(n2))
            {
                t3.setText("" + result);
            } else {
                t3.setText("-" + result);
            }
        });

        Multiply.setOnClickListener(e -> {
            String n1 = t1.getText().toString();
            String n2 = t2.getText().toString();
            int result =  Integer.parseInt(n1) * Integer.parseInt(n2);
            t3.setText("" + result);
        });

        Divide.setOnClickListener(e -> {
            String n1 = t1.getText().toString();
            String n2 = t2.getText().toString();
            int result =  Integer.parseInt(n1) / Integer.parseInt(n2);
            t3.setText("" + result);
        });
    }
}