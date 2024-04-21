package com.example.uts_2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PendaftaranActivity extends AppCompatActivity {

    private EditText editTextNamaMahasiswa, editTextNIM, editTextEmail, editTextJudul;
    private Spinner spinnerJenisTA, spinnerKategoriTA, spinnerPembimbing1, spinnerPembimbing2;
    private Button buttonSubmit, buttonKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        // Inisialisasi views
        editTextNamaMahasiswa = findViewById(R.id.editTextNamaMahasiswa);
        editTextNIM = findViewById(R.id.editTextNIM);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextJudul = findViewById(R.id.editTextJudul);
        spinnerJenisTA = findViewById(R.id.spinnerJenisTA);
        spinnerKategoriTA = findViewById(R.id.spinnerKategoriTA);
        spinnerPembimbing1 = findViewById(R.id.spinnerPembimbing1);
        spinnerPembimbing2 = findViewById(R.id.spinnerPembimbing2);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonKembali = findViewById(R.id.buttonKembali);

        // Menambahkan data ke spinner jenis TA
        ArrayAdapter<CharSequence> jenisTaAdapter = ArrayAdapter.createFromResource(this,
                R.array.jenis_ta_array, android.R.layout.simple_spinner_item);
        jenisTaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJenisTA.setAdapter(jenisTaAdapter);

        // Menambahkan data ke spinner kategori TA
        ArrayAdapter<CharSequence> kategoriTaAdapter = ArrayAdapter.createFromResource(this,
                R.array.kategori_ta_array, android.R.layout.simple_spinner_item);
        kategoriTaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerKategoriTA.setAdapter(kategoriTaAdapter);

        // Menambahkan data ke spinner calon pembimbing 1
        ArrayAdapter<CharSequence> pembimbing1Adapter = ArrayAdapter.createFromResource(this,
                R.array.calon_pembimbing_array, android.R.layout.simple_spinner_item);
        pembimbing1Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPembimbing1.setAdapter(pembimbing1Adapter);

        // Menambahkan data ke spinner calon pembimbing 2
        ArrayAdapter<CharSequence> pembimbing2Adapter = ArrayAdapter.createFromResource(this,
                R.array.calon_pembimbing_array, android.R.layout.simple_spinner_item);
        pembimbing2Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPembimbing2.setAdapter(pembimbing2Adapter);

        // Setup onClickListener untuk tombol submit
        buttonSubmit.setOnClickListener(view -> {
            // Mengambil nilai dari input fields
            String namaMahasiswa = editTextNamaMahasiswa.getText().toString().trim();
            String nim = editTextNIM.getText().toString().trim();
            String email = editTextEmail.getText().toString().trim();
            String judul = editTextJudul.getText().toString().trim();
            String jenisTA = spinnerJenisTA.getSelectedItem().toString();
            String kategoriTA = spinnerKategoriTA.getSelectedItem().toString();
            String pembimbing1 = spinnerPembimbing1.getSelectedItem().toString();
            String pembimbing2 = spinnerPembimbing2.getSelectedItem().toString();

            // Lakukan operasi submit disini
            // Misalnya, validasi input, menyimpan ke database, dll.

            // Tampilkan pesan sukses
            Toast.makeText(PendaftaranActivity.this, "Pendaftaran berhasil!", Toast.LENGTH_SHORT).show();
        });

        // Setup onClickListener untuk tombol kembali
        buttonKembali.setOnClickListener(view -> {
            // Kembali ke activity sebelumnya atau ke main activity
            finish();
        });
    }
}
