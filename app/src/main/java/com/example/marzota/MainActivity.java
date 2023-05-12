package com.example.marzota;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.music);
        //music.start();
        ImageView login;
        login = (ImageView) findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Shopper.class));
            }
        });

        ImageView login1;
        login1 = (ImageView) findViewById(R.id.button_login1);
        login1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, links.class));
            }
        });

        ImageView login2;
        login2 = (ImageView) findViewById(R.id.button_login2);
        login2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Result.class));
            }
        });

        ImageView login3;
        login3 = (ImageView) findViewById(R.id.button_login3);
        login3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, mates.class));
            }
        });

    }


}