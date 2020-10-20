package com.example.fortuna_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
    }

    public void Stat(View view) {
        TextView stat = findViewById(R.id.Stat);
       Intent intent=getIntent();

    }
    public void Play (View view){
        TextView play  = findViewById(R.id.Play);
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}