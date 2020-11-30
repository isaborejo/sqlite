package com.example.sensorpam;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {

    EditText cadnomeEditText;
    EditText caduserEditText;
    EditText cadsenhaEditText;
    EditText cadtelEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        cadastrar();
        selectlogin();
        selectsenha();

        cadnomeEditText = findViewById(R.id.cadnome);
        caduserEditText = findViewById(R.id.caduser);
        cadsenhaEditText = findViewById(R.id.cadsenha);
        cadtelEditText = findViewById(R.id.cadnumero);
    }

    public void cadastrar() {
        SQLiteDatabase cadastro = this.openOrCreateDatabase("cadastroBD", MODE_PRIVATE, null);
        cadastro.execSQL("CREATE TABLE IF NOT EXISTS usuario (cod_user INT primary key , user TEXT, nome TEXT,  senha TEXT, tel TEXT);");
    }

    public void selectlogin(){
        SQLiteDatabase cadastro = this.openOrCreateDatabase("cadastroBD", MODE_PRIVATE, null);
        cadastro.execSQL("select user from usuario ");
    }

    public void selectsenha (){
        SQLiteDatabase cadastro = this.openOrCreateDatabase("cadastroBD", MODE_PRIVATE, null);
        cadastro.execSQL("select senha from usuario");
    }

    public void insertnovos (View view){
        String user = caduserEditText.getText().toString();
        String nome = cadnomeEditText.getText().toString();
        String tel = cadtelEditText.getText().toString();
        String senha = cadsenhaEditText.getText().toString();
        SQLiteDatabase cadastro = this.openOrCreateDatabase("cadastroBD", MODE_PRIVATE, null);
        cadastro.execSQL("insert into usuario(rowid, user, nome, senha, tel, ftperfil) values (null, ?, ?, ?, ?, ?);", new String[] {user, nome, senha, tel});
    }
}
