package com.example.marzota;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class Result extends AppCompatActivity {


    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ImageView tg;
        tg = (ImageView) findViewById(R.id.tg);
        tg.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Marzota"));
                startActivity(browserIntent);
            }
        });
        ImageView ds;
        ds = (ImageView) findViewById(R.id.ds);
        ds.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://discord.gg/r4ckTgNZRh"));
                startActivity(browserIntent);
            }
        });
        ImageView tv;
        tv = (ImageView) findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitch.tv/marklum_7"));
                startActivity(browserIntent);
            }
        });
        ImageView vk;
        vk = (ImageView) findViewById(R.id.vk);
        vk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/fliips1de"));
                startActivity(browserIntent);
            }
        });
    }

}
