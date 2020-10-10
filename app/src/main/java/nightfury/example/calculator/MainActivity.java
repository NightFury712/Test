package nightfury.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {
    TextView textView;
    TextView textCal;
    Button deleteNum;
    Button deleteCal;
    Button deleteSingle;
    Button zero;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button plus;
    Button minus;
    Button multiplication;
    Button divide;
    Button change;
    Button dot;
    Button equal;
    String text = "";
    String textNum = "";
    String cal = "";
    double result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_View);
        textCal = findViewById(R.id.text_Cal);
        deleteNum =  findViewById(R.id.delete_Num);
        deleteCal = findViewById(R.id.delete_cal);
        deleteSingle = findViewById(R.id.delete_single);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiplication = findViewById(R.id.multiplication);
        divide = findViewById(R.id.divide);
        change = findViewById(R.id.change);
        dot = findViewById(R.id.dot);
        equal = findViewById(R.id.equal);

        deleteNum.setOnClickListener(this);
        deleteCal.setOnClickListener(this);
        deleteSingle.setOnClickListener(this);
        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        change.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    public void printResult() {
        if(textNum == "" || textNum == "0") {
            textView.setText(String.format("%.2f", result));
        } else {
            if (cal.equals("+")) {
                result = result + Double.parseDouble(textNum);
                textView.setText(String.format("%.2f", result));
            }
            if (cal.equals("-")) {
                result = result - Double.parseDouble(textNum);
                textView.setText(String.format("%.2f", result));
            }
            if (cal.equals("x")) {
                result = result * Double.parseDouble(textNum);
                textView.setText(String.format("%.2f", result));
            }
            if (cal.equals("/")) {
                result = result / Double.parseDouble(textNum);
                textView.setText(String.format("%.2f", result));
            }
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == deleteNum.getId()) {
            textNum = "";
            cal = "";
            textCal.setText(cal);
            result = 0;
            textView.setText(String.format("%.2f", result));
        }
        if(v.getId() == deleteCal.getId()) {
            textNum = "0";
            cal = "";
            textCal.setText(cal);
            textView.setText(String.format("%.2f", result));
        }
        if (v.getId() == deleteSingle.getId()) {
            String[] str = textNum.split("");
            textNum = "";
            for(int i = 0; i < str.length-1; i++) {
                textNum = textNum + str[i];
            }
            if(textNum.equals("")) {
                textNum = "0";
            }
            textView.setText(textNum);
        }
        if(v.getId() == zero.getId()) {
            textNum = textNum + "0";
            textView.setText(textNum);
        }
        if(v.getId() == one.getId()) {
            textNum = textNum + "1";
            textView.setText(textNum);
        }
        if(v.getId() == two.getId()) {
            textNum = textNum + "2";
            textView.setText(textNum);
        }
        if(v.getId() == three.getId()) {
            textNum = textNum + "3";
            textView.setText(textNum);
        }
        if(v.getId() == four.getId()) {
            textNum = textNum + "4";
            textView.setText(textNum);
        }
        if(v.getId() == five.getId()) {
            textNum = textNum + "5";
            textView.setText(textNum);
        }
        if(v.getId() == six.getId()) {
            textNum = textNum + "6";
            textView.setText(textNum);
        }
        if(v.getId() == seven.getId()) {
            textNum = textNum + "7";
            textView.setText(textNum);
        }
        if(v.getId() == eight.getId()) {
            textNum = textNum + "8";
            textView.setText(textNum);
        }
        if(v.getId() == nine.getId()) {
            textNum = textNum + "9";
            textView.setText(textNum);
        }
        if(v.getId() == plus.getId()) {
            if(cal.equals("")) {
                result = result + Double.parseDouble(textNum);
                textView.setText(String.format("%.2f", result));
                textNum = "";
                cal = "+";
                textCal.setText(cal);
            } else {
                printResult();
                cal = "+";
                textCal.setText(cal);
                textNum = "";
            }
        }
        if(v.getId() == minus.getId()) {
            if(cal.equals("")) {
                result = result + Double.parseDouble(textNum);
                textView.setText(textNum);
                textNum = "";
                cal = "-";
                textCal.setText(cal);
            } else {
                printResult();
                cal = "-";
                textCal.setText(cal);
                textNum = "";
            }
        }
        if(v.getId() == multiplication.getId()) {
            if(cal.equals("")) {
                result = result + Double.parseDouble(textNum);
                textView.setText(textNum);
                textNum = "";
                cal = "x";
                textCal.setText(cal);
            } else {
                printResult();
                cal = "x";
                textCal.setText(cal);
                textNum = "";
            }
        }
        if(v.getId() == divide.getId()) {
            if(cal.equals("")) {
                result = result + Double.parseDouble(textNum);
                textView.setText(textNum);
                textNum = "";
                cal = "/";
                textCal.setText(cal);
            } else {
                printResult();
                cal = "/";
                textCal.setText(cal);
                textNum = "";
            }
        }
        if(v.getId() == dot.getId()) {
            if(!textNum.contains(".")) {
                textNum = textNum + ".";
                textView.setText(textNum);
            }

        }
        if(v.getId() == change.getId()) {
            if(textNum.equals("0")|| textNum.equals("")) {
                result = - result;
                textView.setText(String.format("%.2f", result));
            } else {
                double num = Double.parseDouble(textNum);
                num = - num;
                textNum = String.valueOf(num);
                textView.setText(textNum);
            }

        }
        if(v.getId() == equal.getId()) {
            printResult();
            textNum = "0";
            cal = "";
            textCal.setText(cal);
        }
    }
}