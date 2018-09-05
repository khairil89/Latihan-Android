package com.example.khairil.lesson_1_khairil_anwar;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.lang.Double;

public class MainActivity extends AppCompatActivity {

    String tampung = "0";
    String operator = "";
    Double result;
    Double val1;
    Double faktorial = 1.0;
    Double getVal = 0.0;
    EditText valResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1();
        btn2();
        btn3();
        btn4();
        btn5();
        btn6();
        btn7();
        btn8();
        btn9();
        btn0();
        btnPlus();
        btnMin();
        btnTimes();
        btnDivide();
        btnFactorial();
        btnReset();
        btnBackspace();
        btnMod();
        btnEqual();
        btnComma();
        valResult = findViewById(R.id.numberExecute);
        valResult.setEnabled(false);
    }

    public void btnEqual() {
        Button inputEq = findViewById(R.id.equalBtn);
        inputEq.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    if(operator.equals("+")) {
                            result = val1 + Double.valueOf(valResult.getText() + "");
                    }
                    else if(operator.equals("-")) {
                        result = val1 - Double.valueOf(valResult.getText() + "");
                    }
                    else if(operator.equals("x")) {
                        result = val1 * Double.valueOf(valResult.getText() + "");
                    }
                    else if(operator.equals("/")) {
                        result = val1 / Double.valueOf(valResult.getText() + "");
                    }
                    else if(operator.equals("!")) {
                        result = faktorial;
                        for(int x=1; x<=val1; x++) {
                            result = result * x;
                        }
                    }
                    else if(operator.equals("%")) {
                        result = val1 % Double.valueOf(valResult.getText() + "");
                    }
                    else {
                        String zero = "0.0";
                        String fold = zero.substring(0, zero.length()-2);
                        valResult.setText(fold);
                    }
                }
                catch (ArithmeticException e){
                    e.printStackTrace();
                    valResult.setText("Division by Zero!");
                }
                catch (NumberFormatException e) {
                    e.printStackTrace();
                    valResult.setText("Dot Overdoze");
                }
                catch (Exception et) {
                    et.printStackTrace();
                    valResult.setText("Under Maintenance");
                }

                if(valResult.getText().toString().matches(".[1-9]+")) {
                    String resultStr = result + "";
                    valResult.setText(resultStr.substring(0, resultStr.length()-2));
                }
                else {
                    valResult.setText(result + "");
                }
            }
        });
    }

    public void btnMod() {
        Button inputComma = findViewById(R.id.modBtn);
        inputComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.valueOf(valResult.getText() + "");
                operator = "%";
                valResult.setText("");
            }
        });
    }

    public void btn1() {
        Button input1 = findViewById(R.id.oneBtn);
        input1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(valResult.getText().toString().equals("0")) {
                    valResult.setText("1");
                }
                else {
                    valResult.setText(valResult.getText() + "1");
                }
            }
        });
    }

    public void btn2() {
        Button input2 = findViewById(R.id.twoBtn);
        input2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valResult.getText().toString().equals("0")) {
                    valResult.setText("2");
                }
                else {
                    valResult.setText(valResult.getText() + "2");
                }
            }
        });
    }

    public void btn3() {
        Button input3 = findViewById(R.id.threeBtn);
        input3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valResult.getText().toString().equals("0")) {
                    valResult.setText("3");
                }
                else {
                    valResult.setText(valResult.getText() + "3");
                }
            }
        });
    }

    public void btn4() {
        Button input4 = findViewById(R.id.fourBtn);
        input4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valResult.getText().toString().equals("0")) {
                    valResult.setText("4");
                }
                else {
                    valResult.setText(valResult.getText() + "4");
                }
            }
        });
    }

    public void btn5() {
        Button input5 = findViewById(R.id.fiveBtn);
        input5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valResult.getText().toString().equals("0")) {
                    valResult.setText("5");
                }
                else {
                    valResult.setText(valResult.getText() + "5");
                }
            }
        });
    }

    public void btn6() {
        Button input6 = findViewById(R.id.sixBtn);
        input6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valResult.getText().toString().equals("0")) {
                    valResult.setText("6");
                }
                else {
                    valResult.setText(valResult.getText()+ "6");
                }
            }
        });
    }

    public void btn7() {
        Button input7 = findViewById(R.id.sevenBtn);
        input7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valResult.getText().toString().equals("0")) {
                    valResult.setText("7");
                }
                else {
                    valResult.setText(valResult.getText()+ "7");
                }
            }
        });
    }

    public void btn8() {
        Button input8 = findViewById(R.id.eightBtn);
        input8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valResult.getText().toString().equals("0")) {
                    valResult.setText("8");
                }
                else {
                    valResult.setText(valResult.getText()+ "8");
                }
            }
        });
    }

    public void btn9() {
        Button input9 = findViewById(R.id.nineBtn);
        input9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valResult.getText().toString().equals("0")) {
                    valResult.setText("9");
                }
                else {
                    valResult.setText(valResult.getText()+ "9");
                }
            }
        });
    }

    public void btn0() {
        Button input0 = findViewById(R.id.zeroBtn);
        input0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!valResult.getText().toString().equals("0")) {
                    valResult.setText(valResult.getText()+ "0");
                }
                else if(valResult.getText().toString().equals(".")) {
                    valResult.setText("0.");
                }
                else {
                    valResult.setText("0");
                }
            }
        });
    }

    public void btnComma() {
        Button input0 = findViewById(R.id.commaBtn);
        input0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valResult.getText().toString().equals("0")) {
                    valResult.setText("0.");
                }
                else if(valResult.getText().toString().matches("[.]+")) {
                    valResult.setText(valResult.getText()+ ".");
                }
                else {
                    valResult.setText(valResult.getText()+ ".");
                }
            }
        });
    }

    public void btnPlus() {
        Button inputPlus = findViewById(R.id.plusBtn);
        inputPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.valueOf(valResult.getText() + "");
                operator = "+";
                valResult.setText("");
            }
        });
    }

    public void btnMin() {
        Button inputMin = findViewById(R.id.minusBtn);
        inputMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.valueOf(valResult.getText() + "");
                operator = "-";
                valResult.setText("");
            }
        });
    }

    public void btnTimes() {
        Button inputTimes = findViewById(R.id.timesBtn);
        inputTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.valueOf(valResult.getText() + "");
                operator = "x";
                valResult.setText("");
            }
        });
    }

    public void btnDivide() {
        Button inputDivide = findViewById(R.id.divideBtn);
        inputDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.valueOf(valResult.getText() + "");
                operator = "/";
                valResult.setText("");
            }
        });
    }

    public void btnFactorial() {
        Button inputFactorial = findViewById(R.id.factorialBtn);
        inputFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Double.valueOf(valResult.getText() + "");
                operator = "!";
                valResult.setText("");
            }
        });
    }

    public void btnBackspace() {
        Button actionReset = findViewById(R.id.deleteBtn);
        actionReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tampung = valResult.getText() + "";
                if(tampung.length() > 1) {
                    tampung = tampung.substring(0, tampung.length() - 1);
                    valResult.setText(tampung);
                }
                else if(tampung == "Division by Zero" || tampung == "Infinity" || tampung == "NaN") {
                    valResult.setText("0");
                }
                else {
                    valResult.setText("0");
                }
            }
        });
    }

    public void btnReset() {
        Button actionClear = findViewById(R.id.clearBtn);
        actionClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valResult.setText("0");
            }
        });
    }
}