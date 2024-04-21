package com.example.uts_2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMahasiswaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mahasiswa);

        // Inisialisasi Spinner
        Spinner spinnerStatus = findViewById(R.id.spinnerStatus);

        // Buat ArrayAdapter menggunakan array resource untuk opsi status
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.status_array, android.R.layout.simple_spinner_item);

        // Atur tata letak yang akan digunakan saat daftar opsi ditampilkan
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Terapkan adapter ke Spinner
        spinnerStatus.setAdapter(adapter);
    }
}
