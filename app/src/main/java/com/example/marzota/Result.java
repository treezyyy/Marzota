package com.example.marzota;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.net.URI;

public class Result extends AppCompatActivity {

    ImageView ImageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageView imageView= findViewById(R.id.marzota);
        Intent intent = getIntent();
        String marzota = intent.getStringExtra("marzota");

        if (marzota.equals("buyan")) {
               ImageView.setImageURI(URI.parse());
        //    } else if (cartoon.equals("G2N")) {
        //          LinearLayout.setBackground();
        //       } else if (cartoon.equals("керыч")) {
        //           LinearLayout.setBackground();
        //            LinearLayout.setBackground();
        //    } else if (cartoon.equals("flipside")) {
        //        LinearLayout.setBackground();
        //   } else if (cartoon.equals("l3koyn")) {
        //        LinearLayout.setBackground();
        //     } else if (cartoon.equals("demit")) {
        //         LinearLayout.setBackground();
        //       } else if (cartoon.equals("buyan")) {
        //        LinearLayout.setBackground();
        //   } else if (cartoon.equals("maloyi")) {
        //         LinearLayout.setBackground();
        //  } else if (cartoon.equals("Mcпох")) {
        //       LinearLayout.setBackground();
        //   } else if (cartoon.equals("kirya")) {
        //       LinearLayout.setBackground();
        //   } else if (cartoon.equals("fontazer")) {
        //      LinearLayout.setBackground();
        }
    }
}