package com.ad.sidik.trialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        /*menampilkan tombol back
        tapi sebelumnya pada manifest tentukan dahulu parentnya
         */

        getSupportActionBar().setTitle("Informasi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
