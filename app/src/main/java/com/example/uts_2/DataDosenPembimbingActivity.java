package com.example.uts_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class DataDosenPembimbingActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageButton buttonDrawerMahasiswa;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen_pembimbing);

        drawerLayout = findViewById(R.id.drawer_layout);
        buttonDrawerMahasiswa = findViewById(R.id.buttonDrawerMahasiswa);
        navigationView = findViewById(R.id.navigationView);

        buttonDrawerMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });

        View headerView = navigationView.getHeaderView(0);
        ImageView userImage = headerView.findViewById(R.id.userImage);
        TextView textUsername = headerView.findViewById(R.id.textUsername);

        userImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DataDosenPembimbingActivity.this, textUsername.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.navBeranda) {
                    Toast.makeText(DataDosenPembimbingActivity.this, "Beranda Clicked", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navPendaftaran) {
                    // Intent untuk pindah ke PendaftaranActivity
                    Intent intent = new Intent(DataDosenPembimbingActivity.this, PendaftaranActivity.class);
                    startActivity(intent);
                } else if (itemId == R.id.navDospem) {
                    Toast.makeText(DataDosenPembimbingActivity.this, "Dosen Pembimbing Clicked", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navStatus) {
                    Toast.makeText(DataDosenPembimbingActivity.this, "Status Clicked", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navLogout) {
                    // Intent untuk kembali ke MainActivity
                    Intent intent = new Intent(DataDosenPembimbingActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Selesaikan activity saat ini agar tidak kembali ke BerandaMahasiswaActivity saat menekan tombol back
                }

                drawerLayout.close();
                return true;
            }
        });
    }



}
