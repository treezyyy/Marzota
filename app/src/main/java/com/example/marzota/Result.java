package com.example.marzota.;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Result extends AppCompatActivity {

    LinearLayout LinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        LinearLayout = findViewById(R.id.text_view);
        Intent intent = getIntent();
        String cartoon = intent.getStringExtra("marzota");

        if (cartoon.equals("Marklum")) {
            LinearLayout.setText();
        } else if (cartoon.equals("G2N")) {
            LinearLayout.setText();
        } else if (cartoon.equals("керыч")) {
            LinearLayout.setText();
        } else if (cartoon.equals("flipside")) {
            LinearLayout.setText();
        } else if (cartoon.equals("l3koyn")) {
            LinearLayout.setText();
        } else if (cartoon.equals("demit")) {
            LinearLayout.setText();
        } else if (cartoon.equals("buyan")) {
            LinearLayout.setText();
        } else if (cartoon.equals("maloyi")) {
            LinearLayout.setText();
        } else if (cartoon.equals("Mcпох")) {
            LinearLayout.setText();
        } else if (cartoon.equals("kirya")) {
            LinearLayout.setText();
        } else if (cartoon.equals("fontazer")) {
            LinearLayout.setText();
        }
    }
}