package com.example.comicvault.Logica;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String databaseName = "Singup.db";

    public DatabaseHelper(@Nullable Context context){
        super(context,"Singup.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table usuarios(email text primary key, password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("drop Table if exists usuarios");
    }

    public boolean insertData(String email, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        long result;
        try{
            ContentValues contentValues = new ContentValues();
            contentValues.put("email", email);
            contentValues.put("password", password);
            result= db.insert("usuarios", null, contentValues);
            if (result==-1){
                return false;
            }else return true;
        }catch (Exception e){return false;}

    }

    public boolean checkEmail(String email){
        SQLiteDatabase db = this.getWritableDatabase();

        try {
            Cursor cursor = db.rawQuery("Select * from usuarios where email = ?", new String[] {email});

            if (cursor.getCount() >0 ){
                return true;
            }else return false;
        }catch (Exception e){return false;}

    }

    public boolean checkEmailPassword(String email, String password){
        SQLiteDatabase db = this.getWritableDatabase();

        try {
            Cursor cursor = db.rawQuery("Select * from usuarios where email = ? and password = ?", new String[] {email, password});

            if (cursor.getCount() >0 ){
                return true;
            }else return false;
        }catch (Exception e){return false;}
    }
}
