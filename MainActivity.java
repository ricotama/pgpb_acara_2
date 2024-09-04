package com.example.penugasanacara2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText;
    EditText passwordEditText;
    Button loginButton;
    TextView successTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menghubungkan komponen dengan layout
        usernameEditText = findViewById(R.id.edt_username);
        passwordEditText = findViewById(R.id.edt_password);
        loginButton = findViewById(R.id.btn_login);
        successTextView = findViewById(R.id.txt_success);

        // Set click listener untuk tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginClicked();
            }
        });
    }

    public void onLoginClicked() {
        // Mendapatkan username dan password yang dimasukkan
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        // Melakukan logika login di sini
        if (username.equals("rico") && password.equals("456")) {
            // Login berhasil
            successTextView.setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(), " YeAyyy Login sukses", Toast.LENGTH_SHORT).show();
        } else {
            // Login gagal
            successTextView.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(), "Username atau password salah", Toast.LENGTH_SHORT).show();
        }
    }
}
