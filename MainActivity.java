package com.example.vatsc.mycalculator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import  java.util.*;
import  java.lang.*;

public class MainActivity extends AppCompatActivity {
       static public EditText display;
      static  String k= "";
       String num1="0",num2="0",result="";
       int nmI,nmI2,i,resultI,j;
       char[] temp2;
       char x;
       int p;
    Button one,two,three,four,five,six,seven,eight,nine,zero,equalTo,add,subtract,multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(EditText)findViewById(R.id.editTextCalcy);
        zero = (Button)findViewById(R.id.zero);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        add = (Button)findViewById(R.id.add);
        subtract= (Button)findViewById(R.id.subtract);
        multiply  =(Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        equalTo = (Button)findViewById(R.id.equalTo);
    }

   public  void onClick(View view)
    {
        k="";
        k =display.getText().toString();
        switch(view.getId()) {

            case R.id.zero:
                k += "0";
                display.setText(k);
                break;
            case R.id.one:
                k += "1";
                display.setText(k);
                break;
            case R.id.two:
                k += "2";
                display.setText(k);
                break;
            case R.id.three:
                k += "3";
                display.setText(k);
                break;
            case R.id.four:
                k += "4";
                display.setText(k);
                break;
            case R.id.five:
                k += "5";
                display.setText(k);
                break;
            case R.id.six:
                k += "6";
                display.setText(k);
                break;
            case R.id.seven:
                k += "7";
                display.setText(k);
                break;
            case R.id.eight:
                k += "8";
                display.setText(k);
                break;
            case R.id.nine:
                k += "9";
                display.setText(k);
                break;
            case R.id.subtract:
                k += "-";
                display.setText(k);
                break;
            case R.id.add:
                k += "+";
                display.setText(k);
                break;
            case R.id.multiply:
                k += "*";
                display.setText(k);
                break;
            case R.id.divide:
                k += "/";
                display.setText(k);
                break;

            case R.id.clear:
                k=display.getText().toString();

                int size = k.length();
                char[] tempChar=k.toCharArray();
                k="";
                for(int i=0;i<size-1;i++)
                {
                    k +=tempChar[i];
                }
                display.setText(k);
                break;
            case R.id.allClear:
                display.setText("0");
                break;
            case R.id.equalTo:
                LinkedList<Character> calcy = new LinkedList<Character>();
                k = display.getText().toString();
               int s = k.length();
                char[] temp = k.toCharArray();
                p=0;
                while(p<s)
                {
                    calcy.add(temp[p]);
                    p++;
                }
                Iterator itr = calcy.iterator();
                while(itr.hasNext())
                {
                    while((char)itr.next()!='+'||(char)itr.next()!='-'||(char)itr.next()!='*'||(char)itr.next()!='/')
                    {
                        num1 +=(char)itr.next();
                    }
                    x=(char)itr.next();
                    while((char)itr.next()=='0'||(char)itr.next()=='1'||(char)itr.next()=='2'||(char)itr.next()=='3'||(char)itr.next()=='4'||(char)itr.next()=='5'||(char)itr.next()=='6'||(char)itr.next()=='7'||(char)itr.next()=='8'||(char)itr.next()=='9')
                    {
                        num2+=(char)itr.next();
                    }

                }
                nmI = Integer.parseInt(num1);
                nmI2 = Integer.parseInt(num2);
                if(x=='+')
                {
                    resultI = nmI+nmI2;
                    result = String.valueOf(resultI);
                    display.setText(result);
                }
        }
        }
    }
