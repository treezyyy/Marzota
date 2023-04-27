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

            }
}