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

public class uchast extends AppCompatActivity {
    private Integer picture = R.drawable.log;

    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        LinearLayout pictureView = (LinearLayout) findViewById(R.id.fonfurino);


        Intent intent = getIntent();
        String marzota = intent.getStringExtra("marzota");

        if (marzota.equals("Marklum")) {
            picture = R.drawable.marklum;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("G2N")) {
            picture = R.drawable.gun;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("керыч")) {
            picture = R.drawable.kerich;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("flipside")) {
            picture = R.drawable.flipside;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("sazuka")) {
            picture = R.drawable.sazuka;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("maloy")) {
            picture = R.drawable.maloy;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("demit")) {
            picture = R.drawable.demit;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("buyan")) {
            picture = R.drawable.buyan;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("Мспох")) {
            picture = R.drawable.mspoh;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("kirya")) {
            picture = R.drawable.kirya;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("sp1rixx")) {
            picture = R.drawable.spirixx;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("X1NEKS")) {
            picture = R.drawable.xineks;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("ДEVИД")) {
            picture = R.drawable.dev;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("BUSH")) {
            picture = R.drawable.bush;
            pictureView.setBackgroundResource(picture);
        } else if (marzota.equals("Fontazer")) {
            picture = R.drawable.fontazer;
            pictureView.setBackgroundResource(picture);
        }
    }
}

