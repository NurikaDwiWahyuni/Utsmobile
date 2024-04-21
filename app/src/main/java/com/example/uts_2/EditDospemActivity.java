package com.example.uts_2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditDospemActivity extends AppCompatActivity {

    // Deklarasi views
    private EditText namaDosenEditText;
    private EditText nipEditText;
    private Spinner jenisKelaminSpinner;
    private EditText keahlianEditText;
    private EditText kuotaEditText;
    private Button submitButton;
    private Button kembaliButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_dospem);

        // Inisialisasi views
        namaDosenEditText = findViewById(R.id.editTextNamaDosen);
        nipEditText = findViewById(R.id.editTextNIP);
        jenisKelaminSpinner = findViewById(R.id.spinnerJenisKelamin);
        keahlianEditText = findViewById(R.id.editTextKeahlian);
        kuotaEditText = findViewById(R.id.editTextKuota);
        submitButton = findViewById(R.id.buttonSubmit);
        kembaliButton = findViewById(R.id.buttonKembali);

        // Setup onClickListener untuk tombol Submit
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil nilai dari setiap field
                String namaDosen = namaDosenEditText.getText().toString();
                String nip = nipEditText.getText().toString();
                String jenisKelamin = jenisKelaminSpinner.getSelectedItem().toString();
                String keahlian = keahlianEditText.getText().toString();
                String kuota = kuotaEditText.getText().toString();

                // Lakukan validasi sederhana
                if (namaDosen.isEmpty() || nip.isEmpty() || jenisKelamin.isEmpty() || keahlian.isEmpty() || kuota.isEmpty()) {
                    showToast("Semua field harus diisi.");
                } else {
                    // Proses submit data, misalnya simpan ke database atau lakukan operasi lainnya
                    // Di sini Anda dapat menambahkan kode sesuai kebutuhan aplikasi Anda

                    // Tampilkan pesan berhasil
                    showToast("Data berhasil disubmit: " + namaDosen);
                }
            }
        });

        // Setup onClickListener untuk tombol Kembali
        kembaliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kembali ke activity sebelumnya (misalnya MainActivity)
                finish();
            }
        });
    }

    // Fungsi untuk menampilkan pesan Toast
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
