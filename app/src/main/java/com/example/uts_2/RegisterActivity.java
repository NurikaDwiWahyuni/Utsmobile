package com.example.uts_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText nameEditText, nimEditText, emailEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize EditText fields
        nameEditText = findViewById(R.id.nameEditText);
        nimEditText = findViewById(R.id.nimEditText);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

        Button signUpButton = findViewById(R.id.signUpButton);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });

        TextView alreadyHaveAccountTextView = findViewById(R.id.alreadyHaveAccountTextView);
        alreadyHaveAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAlreadyHaveAccountClick();
            }
        });
    }

    // Method to handle sign up button click
    private void signUp() {
        // Get input values
        String name = nameEditText.getText().toString().trim();
        String nim = nimEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        // Perform validation (you can add more validation as per your requirement)
        if (name.isEmpty() || nim.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        } else {
            // Perform signup process (you can implement your signup logic here)

            // For now, just display a success message
            Toast.makeText(this, "Sign up successful", Toast.LENGTH_SHORT).show();

            // Redirect to MainActivity
            startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            finish(); // Finish current activity
        }
    }

    // Method to handle already have account click
    private void onAlreadyHaveAccountClick() {
        // Redirect to MainActivity
        startActivity(new Intent(RegisterActivity.this, MainActivity.class));
        finish(); // Finish current activity
    }
}
