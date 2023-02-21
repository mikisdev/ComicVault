package com.example.comicvault.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.comicvault.Activities.Login;
import com.example.comicvault.Logica.DatabaseHelper;
import com.example.comicvault.Logica.Validaciones;
import com.example.comicvault.R;

public class Registro extends AppCompatActivity implements View.OnClickListener {

    private DatabaseHelper databaseHelper;
    private Button btnCrearCuenta;
    private EditText etEmail;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnCrearCuenta = findViewById(R.id.btnCrearCuenta);
        btnCrearCuenta.setOnClickListener(this);
        etEmail = findViewById(R.id.etCrearEmail);
        etPassword = findViewById(R.id.etCrearPass);

        databaseHelper = new DatabaseHelper(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCrearCuenta:
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                if (Validaciones.hayTexto(this, email, password)){
                    if (Validaciones.validarEmail(this, email)){
                        if(Validaciones.validarPassword(this, password)){
                            Boolean chekUser = databaseHelper.checkEmail(email);

                            if (!chekUser){
                                boolean insert = databaseHelper.insertData(email, password);

                                if (insert){
                                    Toast.makeText(this, "Registro completado!", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(this, Login.class);
                                    startActivity(intent);
                                }else Toast.makeText(this, "Error al registrate", Toast.LENGTH_SHORT).show();

                            }else Toast.makeText(this, "Error al registrate", Toast.LENGTH_SHORT).show();
                        }

                    }

                }
                break;
        }
    }
}