package com.example.ourshop.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import android.content.Intent;
import com.example.ourshop.R;

import android.view.View;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set tanggal di home
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.tvDate);
        textViewDate.setText(currentDate);
    }

    public void launchActivityWisata(View view) {
        Intent intent = new Intent(this, ActivityWisata.class);
    }

    public void launchActivityPenginapan(View view) {
        Intent intent = new Intent(this, ActivityPenginapan.class);
    }
    public void launchActivityKuliner(View view) {
        Intent intent = new Intent(this, ActivityKuliner.class);
    }
    public void launchActivityTempatIbadah(View view) {
        Intent intent = new Intent(this, ActivityTempatIbadah.class);
    }


}