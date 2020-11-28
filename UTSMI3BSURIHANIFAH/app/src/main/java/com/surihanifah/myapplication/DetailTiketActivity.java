package com.surihanifah.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailTiketActivity extends AppCompatActivity {

    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tiket);

        hasil = findViewById(R.id.result);

        Intent hs = getIntent();

        hasil.setText(hs.getStringExtra("data"));
    }
}