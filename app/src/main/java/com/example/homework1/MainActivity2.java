package com.example.homework1;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String num1,num2,num3;
    ListView lv;
    TextView tv,tv2,tv3,tv4,tv5;
    String[] numbers = new String[20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent gi = getIntent();
        String sn1 = gi.getStringExtra("st1");
        num1=sn1;
        String Fnumber = gi.getStringExtra("st2");
        num2=Fnumber;
        String sn3 = gi.getStringExtra("st3");
        num3=sn3;
        numbers[0]=Fnumber;
        lv=findViewById(R.id.listview);
        tv2 = findViewById(R.id.textView13);
        tv3 = findViewById(R.id.textView14);
        tv4 = findViewById(R.id.textView15);
        tv5 = findViewById(R.id.textView16);
        if (num1.equals("a")){
            for(int i=1;i<numbers.length;i++){
                numbers[i]=String.valueOf(Integer.parseInt(numbers[i-1])+Integer.parseInt(sn3));
            }
        }
        else if (num1.equals("g")) {
            for(int i=1;i<numbers.length;i++){
                numbers[i]=String.valueOf(Integer.parseInt(numbers[i-1])*Integer.parseInt(sn3));
            }
        }
        tv2.setText(Fnumber);
        tv3.setText(num3);
        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,numbers);
        lv.setAdapter(adp);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (num1.equals("a")){
            double Math1= Double.valueOf(Double.valueOf(num2)+(Double.valueOf(numbers[position])));
            double a1=Double.parseDouble(String.valueOf(position+1))/2;
            tv5.setText(String.valueOf(Math1*a1));
            position++;
            tv4.setText(" "+position);
        }
        else if (num1.equals("g")) {
            double Math2 = Double.parseDouble(num2)*(Double.parseDouble(String.valueOf(Math.pow(Double.parseDouble(num3),position+1)))-1);
            tv5.setText(String.valueOf(Math2));
            position++;
            tv4.setText(" "+position);
        }
    }
}
