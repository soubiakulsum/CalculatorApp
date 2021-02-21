package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnClear;
    private Button btnBracket;
    private Button btnPercent;
    private Button btnDivision;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnMultiply;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btnMinus;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btnPlus;
    private Button btn0;
    private Button btnDot;
    private Button btnEqual;
    private TextView tvInput;
    private TextView tvOutPut;

    private String Display;
    boolean checkBracket = false;

    private double inputOne;
    private double inputTwo;
    private double result=0;

    private StringBuffer stringBuffer;
    private StringBuffer stringBuffer2;

    private boolean Addition,Subtraction,Multiplication,Division;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewsAndListeners();
    }

    private void initViewsAndListeners() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnDivision = findViewById(R.id.btnDivision);

        btnDot = findViewById(R.id.btnDot);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        btnBracket = findViewById(R.id.btnBracket);
        btnPercent = findViewById(R.id.btnPercent);

        tvInput = findViewById(R.id.tvInput);
        tvOutPut = findViewById(R.id.tvOutPut);

        stringBuffer = new StringBuffer();
        stringBuffer2 = new StringBuffer();

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
        btnBracket.setOnClickListener(this);

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (Addition || Subtraction || Multiplication || Division){
//
//                    inputOne = Double.parseDouble(stringBuffer.toString());
//                    inputTwo = Double.parseDouble(stringBuffer.toString());
//
//                    if (Addition){
//                    }
//
//
//
//                }

                tvOutPut.setText(result+"");
            }
        });




        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutPut.setText("");
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer2.delete(0,stringBuffer2.length());
            }
        });

//        btnBracket.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (checkBracket){
//                    Display = btnBracket.getText().toString();
//                    tvInput.setText(Display + ")");
//                    checkBracket = false;
//                }else {
//                    Display = btnBracket.getText().toString();
//                    tvInput.setText(Display + "(");
//                    checkBracket = true;
//                }
//            }
//        });

    }

    @Override
    public void onClick(View v) {

        char c;

        switch (v.getId()){

            case R.id.btn0:
//              c = btn0.getText().toString().charAt(0);
                c='0';
              stringBuffer.append(c);
              stringBuffer2.append(c);
              updateInput();
                break;

            case R.id.btn1:
//                c = btn1.getText().toString().charAt(0);
                c = '1';
                stringBuffer.append(c);
                stringBuffer2.append(c);
                updateInput();
                break;

            case R.id.btn2:
//                c = btn2.getText().toString().charAt(0);
                c = '2';
                stringBuffer.append(c);
                stringBuffer2.append(c);
                updateInput();
                break;

            case R.id.btn3:
//                c = btn3.getText().toString().charAt(0);
                c = '3';
                stringBuffer.append(c);
                stringBuffer2.append(c);
                updateInput();
                break;

            case R.id.btn4:
//                c = btn4.getText().toString().charAt(0);
                c = '4';
                stringBuffer.append(c);
                stringBuffer2.append(c);
                updateInput();
                break;

            case R.id.btn5:
//                c = btn5.getText().toString().charAt(0);
                c = '5';
                stringBuffer.append(c);
                stringBuffer2.append(c);
                updateInput();
                break;

            case R.id.btn6:
//                c = btn6.getText().toString().charAt(0);
                c = '6';
                stringBuffer.append(c);
                stringBuffer2.append(c);
                updateInput();
                break;

            case R.id.btn7:
//                c = btn7.getText().toString().charAt(0);
                c = '7';
                stringBuffer.append(c);
                stringBuffer2.append(c);
                updateInput();
                break;

            case R.id.btn8:
//                c = btn8.getText().toString().charAt(0);
                c = '8';
                stringBuffer.append(c);
                stringBuffer2.append(c);
                updateInput();
                break;

            case R.id.btn9:
//                c = btn9.getText().toString().charAt(0);
                c = '9';
                stringBuffer.append(c);
                stringBuffer2.append(c);
                updateInput();
                break;


            case R.id.btnDot:
                c = '.';
                stringBuffer.append(c);
                updateInput();
                break;


            case R.id.btnPercent:
                c = '/';
                stringBuffer.append(c);
                updateInput();
                break;

            case R.id.btnDivision:
                c = '/';
                if (stringBuffer.length()!=0  && stringBuffer2.length() != 0){
                    inputOne = Double.parseDouble(stringBuffer2.toString());
                    result/=inputOne;
                    stringBuffer2.delete(0,stringBuffer2.length());
                    stringBuffer.append(c);
                    updateInput();

                }
                break;

            case R.id.btnMultiply:
                c = '*';
                if (stringBuffer.length()!=0  && stringBuffer2.length() != 0){
                    inputOne = Double.parseDouble(stringBuffer2.toString());
                    result*=inputOne;
                    stringBuffer2.delete(0,stringBuffer2.length());
                    stringBuffer.append(c);
                    updateInput();

                }
                break;

            case R.id.btnMinus:
                c = '-';
                if (stringBuffer.length()!=0 && stringBuffer2.length() != 0){
                    inputOne = Double.parseDouble(stringBuffer2.toString());
                    result-=inputOne;
                    stringBuffer2.delete(0,stringBuffer2.length());
                    stringBuffer.append(c);
                    updateInput();

                }
                break;

            case R.id.btnPlus:
                c = '+';
                if (stringBuffer.length()!=0  && stringBuffer2.length() != 0){
                    inputOne = Double.parseDouble(stringBuffer2.toString());
                    result+=inputOne;
                    Log.d("result",result+"");
                    stringBuffer2.delete(0,stringBuffer2.length());
                    stringBuffer.append(c);
                    updateInput();

                }

                break;

            case R.id.btnBracket:
                c = btnBracket.getText().toString().charAt(0);
                stringBuffer.append(c);
                updateInput();
                break;

        }



    }

    private void updateInput() {
        tvInput.setText(stringBuffer.toString());
    }


}