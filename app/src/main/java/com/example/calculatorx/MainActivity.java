package com.example.calculatorx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etFirstValue , etSecoundValue;
    TextView tvAns;
    Button add , substract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     etFirstValue= findViewById(R.id.etFirstValue);
        etSecoundValue= findViewById(R.id.etSecoundValue);
        tvAns= findViewById(R.id.tvAns);
        add= findViewById(R.id.btnAdd);
        substract= findViewById(R.id.btnSubtract);
        multiply= findViewById(R.id.btnMultiply);
        divide= findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstView , secoundView , ans;
                firstView = Integer.parseInt(etFirstValue.getText().toString());
                secoundView = Integer.parseInt(etSecoundValue.getText().toString());

                ans= firstView + secoundView;

                tvAns.setText("Ans is =" + ans);
            }
        });


        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstView , secoundView , ans;
                firstView = Integer.parseInt(etFirstValue.getText().toString());
                secoundView = Integer.parseInt(etSecoundValue.getText().toString());

                ans= firstView - secoundView;

                tvAns.setText("Ans is =" + ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstView , secoundView , ans;
                firstView = Integer.parseInt(etFirstValue.getText().toString());
                secoundView = Integer.parseInt(etSecoundValue.getText().toString());

                ans= firstView * secoundView;

                tvAns.setText("Ans is =" + ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstView , secoundView , ans;
                firstView = Integer.parseInt(etFirstValue.getText().toString());
                secoundView = Integer.parseInt(etSecoundValue.getText().toString());

                ans= firstView / secoundView;

                tvAns.setText("Ans is =" + ans);
            }
        });
    }
}