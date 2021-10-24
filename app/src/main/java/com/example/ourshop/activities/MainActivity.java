package com.example.ourshop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.ourshop.R;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton bt1 = (ImageButton) findViewById(R.id.button_wisata);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this,ActivityWisata.class);
                startActivity(Intent);
            }
        });

        ImageButton bt2 = (ImageButton) findViewById(R.id.button_hotel);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, ActivityPenginapan.class);
                startActivity(Intent);
            }
        });

        ImageButton bt3 = (ImageButton) findViewById(R.id.button_ibadah);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, ActivityTempatIbadah.class);
                startActivity(Intent);
            }
        });

        ImageButton bt4 = (ImageButton) findViewById(R.id.button_kuliner);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, ActivityKuliner.class);
                startActivity(Intent);
            }
        });

        // set tanggal di home
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.tvDate);
        textViewDate.setText(currentDate);
    }
}