package com.example.marzota.;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Result extends AppCompatActivity {

    LinearLayout LinearLayout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        LinearLayout = findViewById(R.id.ln);
        Intent intent = getIntent();
        String cartoon = intent.getStringExtra("marzota");

        if (cartoon.equals("Marklum")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("G2N")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("керыч")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("flipside")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("l3koyn")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("demit")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("buyan")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("maloyi")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("Mcпох")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("kirya")) {
            LinearLayout.setBackground();
        } else if (cartoon.equals("fontazer")) {
            LinearLayout.setBackground();
        }
    }
}