package com.example.uts_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataDosenPembimbingKoordinatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_dosen_pembimbing);

        // Mendapatkan referensi tombol Tambah
        Button tambahButton = findViewById(R.id.tambahButton);

        // Memberikan listener klik pada tombol Tambah
        tambahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke activity tambahDosen
                Intent intent = new Intent(DataDosenPembimbingKoordinatorActivity.this, TambahDospemActivity.class);
                startActivity(intent);
            }
        });

        // Mendapatkan referensi nama dosen pertama
        TextView namaDosen1 = findViewById(R.id.namaDosen1);

        // Memberikan listener klik pada nama dosen pertama
        namaDosen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke activity editDosen
                Intent intent = new Intent(DataDosenPembimbingKoordinatorActivity.this, EditDospemActivity.class);
                startActivity(intent);
            }
        });

        // Mendapatkan referensi nama dosen kedua
        TextView namaDosen2 = findViewById(R.id.namaDosen2);

        // Memberikan listener klik pada nama dosen kedua
        namaDosen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke activity editDosen
                Intent intent = new Intent(DataDosenPembimbingKoordinatorActivity.this, EditDospemActivity.class);
                startActivity(intent);
            }
        });

        // Mendapatkan referensi nama dosen ketiga
        TextView namaDosen3 = findViewById(R.id.namaDosen3);

        // Memberikan listener klik pada nama dosen ketiga
        namaDosen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke activity editDosen
                Intent intent = new Intent(DataDosenPembimbingKoordinatorActivity.this, EditDospemActivity.class);
                startActivity(intent);
            }
        });
    }
}
