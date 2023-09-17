package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,Fnumber,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editTextText);
        Fnumber = findViewById(R.id.editTextNumber);
        ed3 = findViewById(R.id.editTextNumber2);
    }
    public void page2(View view) {
        String st1 = ed1.getText().toString();
        String st2 = Fnumber.getText().toString();
        String st3 = ed3.getText().toString();
        Intent si = new Intent(this,MainActivity2.class);
        si.putExtra("st1",st1);
        si.putExtra("st2",st2);
        si.putExtra("st3",st3);
        startActivity(si);

    }

}