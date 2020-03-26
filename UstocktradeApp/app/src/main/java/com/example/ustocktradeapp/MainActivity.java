package com.example.ustocktradeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        btLogin = findViewById(R.id.bt_submit);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etEmail.getText().toString().equals("test@test.com") && etPassword.getText().toString().equals("test123")) {
                        startActivity(new Intent(MainActivity.this,Dashboard.class));
                        finish();
                }else {
                    Toast.makeText(getApplicationContext(),"Invalid Email or Password!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
