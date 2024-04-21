package com.example.uts_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Deklarasi views
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private TextView forgotPasswordTextView;
    private TextView registerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi views
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView);
        registerTextView = findViewById(R.id.registerTextView);

        // Setup onClickListener untuk tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Contoh validasi sederhana, ganti dengan validasi sesuai kebutuhan
                if (email.isEmpty() || password.isEmpty()) {
                    showToast("Email atau password tidak boleh kosong.");
                } else if (email.equals("nurikaadwi@gmail.com") && password.equals("nurika123")) {
                    // Login berhasil
                    showToast("Login berhasil. Selamat datang, " + email + "!");
                    // Intent untuk membuka BerandaMahasiswaActivity setelah login berhasil
                    Intent intent = new Intent(MainActivity.this, BerandaKoordinatorActivity.class);
                    startActivity(intent);

                } else if (email.equals("jamal@gmail.com") && password.equals("jamal123")) {
                    // Login berhasil
                    showToast("Login berhasil. Selamat datang, " + email + "!");
                    // Intent untuk membuka BerandaMahasiswaActivity setelah login berhasil
                    Intent intent = new Intent(MainActivity.this, StatusMahasiswaActivity.class);
                    startActivity(intent);
                } else {
                    // Login gagal
                    showToast("Email atau password salah.");
                }
            }
        });

        // Setup onClickListener untuk teks forgot password
        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka ForgotPasswordActivity
                Intent intent = new Intent(MainActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });

        // Setup onClickListener untuk teks register
        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk membuka RegisterActivity
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    // Fungsi untuk menampilkan pesan Toast
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
