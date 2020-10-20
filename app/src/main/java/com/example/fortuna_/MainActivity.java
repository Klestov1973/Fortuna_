package com.example.fortuna_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.FieldClassification;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a,b,c;
    public void Win1 (View view){
        TextView win1 = findViewById(R.id.Win1);
        win1.setText(a);
    }
    public void Win2 (View view){
        TextView win2 = findViewById(R.id.Win2);
        win2.setText(b);
    }
    public void Win3 (View view){
        TextView win3 = findViewById(R.id.Win3);
        win3.setText(c);
    }
    public void Result (View view){
        TextView result = findViewById(R.id.Result);
        result.setText(" УДАЧИ ");
    }
    public void Start (View view){
        TextView start  = findViewById(R.id.WIN_1);
        Random rand = new Random();
        a=rand.nextInt(10);
         b=rand.nextInt(10);
         c=rand.nextInt(10);
        if(a == (b = c)){
//            Intent rez = new Intent(this, Statistics.class);
//            rez.putExtra(Win1(View view), a);
//            startActivity(rez);
        }
        else {
//            Intent rez = new Intent(this, Statistics.class);
//            rez.putExtra(Win1(View view), a);
//            startActivity(rez);
        }
    }
    public void Statictics (View view){
        TextView statistics  = findViewById(R.id.Statistics);
        Intent intent= new Intent(this, Statistics.class);
        startActivity(intent);
    }
}