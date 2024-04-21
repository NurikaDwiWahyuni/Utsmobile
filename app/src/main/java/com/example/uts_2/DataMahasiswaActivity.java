package com.example.uts_2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import androidx.appcompat.app.AppCompatActivity;

public class DataMahasiswaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);

        // Mendapatkan referensi ke TableLayout
        TableLayout tableLayout = findViewById(R.id.tableLayout);

        // Menambahkan OnClickListener untuk setiap tombol Detail di setiap baris data
        for (int i = 1; i < tableLayout.getChildCount(); i++) {
            TableRow row = (TableRow) tableLayout.getChildAt(i);
            Button detailButton = (Button) row.getChildAt(row.getChildCount() - 1); // Mendapatkan tombol Detail di baris tersebut
            final int finalI = i; // Gunakan variabel final untuk mengakses variabel i di dalam inner class
            detailButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Buat Intent untuk beralih ke DetailMahasiswaActivity
                    Intent intent = new Intent(DataMahasiswaActivity.this, DetailMahasiswaActivity.class);
                    // Tambahkan data tambahan ke Intent jika perlu, misalnya ID mahasiswa atau informasi lainnya
                    // Di sini kita hanya memindahkan informasi nomor baris (finalI) sebagai contoh
                    intent.putExtra("ROW_NUMBER", finalI);
                    startActivity(intent);
                }
            });
        }
    }
}
