package com.example.sensorpam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity
{
    EditText loginEditText;
    EditText senhaEditText;

        public void checar (View view){
            SQLiteDatabase cadastro = this.openOrCreateDatabase("cadastroBD", MODE_PRIVATE, null);
            Cursor cursor;
                    cursor = cadastro.rawQuery("select * from usuario where user=? AND senha=?;",new String[]{loginEditText.getText().toString(), senhaEditText.getText().toString(),null});
            while(cursor.moveToNext()){
                if (String.valueOf(loginEditText.getText()).equals(cursor.getString(1)) && String.valueOf(senhaEditText.getText()).equals(cursor.getString(3)));{
                    Intent intent= new Intent (this, Principal.class);
                    startActivity(intent);
                    loginEditText.getText().clear();
                    senhaEditText.getText().clear();
                }
            }
        }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEditText = findViewById(R.id.login);
        senhaEditText = findViewById(R.id.senha);

    }
    public void Cadastro (View view){
        Intent intent = new Intent(Login.this, Cadastro.class);
        startActivity(intent);
    }
}

