package com.example.comicvault.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.comicvault.Logica.DatabaseHelper;
import com.example.comicvault.Logica.Validaciones;
import com.example.comicvault.R;

public class Login extends AppCompatActivity implements View.OnClickListener {

    private TextView tvCrearCuenta;
    private EditText etEmail, etPassword;
    private Button btnLogin;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvCrearCuenta = findViewById(R.id.tvCrearCuentaLog);
        tvCrearCuenta.setOnClickListener(this);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        etEmail = findViewById(R.id.etEmailLog);
        etPassword = findViewById(R.id.etPassLog);

        databaseHelper = new DatabaseHelper(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.tvCrearCuentaLog:
                Intent intent = new Intent(this, Registro.class);
                startActivity(intent);
                break;
            case R.id.btnLogin:
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                if (Validaciones.hayTexto(this,email,password)){
                    Boolean checkDatos = databaseHelper.checkEmailPassword(email,password);

                    if (checkDatos){
                        Toast.makeText(this, "Iniciado sesion con exito", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(this, ListaComics.class);
                        startActivity(intent2);
                        finish();
                    }else Toast.makeText(this, "Error al iniciar sesion", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}