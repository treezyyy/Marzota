package com.example.marzota;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import java.net.URI;

public class Result extends AppCompatActivity {

    private Integer picture = R.drawable.fon;

    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        LinearLayout pictureView = (LinearLayout) findViewById(R.id.fonfurino);


        Intent intent = getIntent();
        String marzota = intent.getStringExtra("marzota");

        if (marzota.equals("buyan")) {
            picture = R.drawable.buyan;
            pictureView.setBackgroundResource(picture);

        }
    }
}
