package com.example.marzota;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
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
        ImageView login;
        login = (ImageView) findViewById(R.id.button_login);
        login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //TODO: your code here
            }
        });

        ImageView login1;
        login1 = (ImageView) findViewById(R.id.button_login1);
        login1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //TODO: your code here
            }
        });

        ImageView login2;
        login2 = (ImageView) findViewById(R.id.button_login2);
        login2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //TODO: your code here
            }
        });

        ImageView login3;
        login3 = (ImageView) findViewById(R.id.button_login3);
        login3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //TODO: your code here
            }
        });

    }





}