package com.example.comicvault.Logica;

import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

    public static boolean validarEmail(Context context, String email){

        Pattern pat = Pattern.compile("^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");



        Matcher mather = pat.matcher(email);

        if (mather.find()) {
            return true;
        } else {
            Toast.makeText(context, "Correo electronico no válido", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public static boolean validarPassword(Context context, String password){

        Pattern pat = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");

        Matcher mather = pat.matcher(password);

        if (mather.find()) {
            return true;
        } else {
            Toast.makeText(context, "Contraseña no válida, recuerda que tiene que contener una letra minúscula, otra mayuscula, un número, un carácter especial y tener un tamaño de entre 8 y 20 caracteres", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
    public static boolean hayTexto(Context context, String email, String password ){

        if (email.equals("") || password.equals("")){
            Toast.makeText(context, "Debes introducir todos los campos", Toast.LENGTH_SHORT).show();
            return false;
        }else return true;
    }
}
