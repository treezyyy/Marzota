package com.example.marzota;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mates extends AppCompatActivity {
    ListView listView;
    String[] marzota = {"Marklum", "G2N", "керыч", "flipside", "sazuka", "maloy", "demit", "buyan", "maloyi", "Mcпох", "kirya","sp1rixx","x1neks","ДEVИД","bush", "Fontazer"};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mates);
        listView = findViewById(R.id.mates);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, marzota);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(mates.this, uchast.class);
                startActivity(intent);
            }
        });
    }
}