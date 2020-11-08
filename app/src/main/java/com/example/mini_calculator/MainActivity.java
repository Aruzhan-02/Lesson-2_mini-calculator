package com.example.mini_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    Button btnPlus, btnMinus;
    Button btnMulti, btnDivide;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.et_number1);
        number2 = findViewById(R.id.et_number2);

        btnPlus = findViewById(R.id.button_plus);
        btnMinus = findViewById(R.id.button_minus);
        btnMulti = findViewById(R.id.button_multi);
        btnDivide = findViewById(R.id.button_divide);

        result = findViewById(R.id.tv_result);
    }
}