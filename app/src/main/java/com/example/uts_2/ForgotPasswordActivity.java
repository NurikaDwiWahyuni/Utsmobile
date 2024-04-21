package com.example.uts_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        TextView backToLoginTextView = findViewById(R.id.backToLogin);

        // Set click listener for back to login button
        backToLoginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToLogin();
            }
        });
    }

    // Method to handle back to login link click
    private void backToLogin() {
        // Redirect to MainActivity
        startActivity(new Intent(ForgotPasswordActivity.this, MainActivity.class));
        finish(); // Finish current activity
    }
}
