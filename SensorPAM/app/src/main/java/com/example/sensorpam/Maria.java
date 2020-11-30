package com.example.sensorpam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Maria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maria);
    }
    public void sitemaria (View view) {
        Uri uri = Uri.parse("hhttps://vestibular.uol.com.br/resumo-das-disciplinas/atualidades/cidadania-lei-maria-da-penha-completa-10-anos.htm#:~:text=A%20Lei%2011.340%20configura%20viol%C3%AAncia,e%20dano%20moral%20ou%20patrimonial%3A&text=Al%C3%A9m%20disso%2C%20garante%20o%20mesmo,em%20relacionamento%20com%20outras%20mulheres.");
        Intent internet = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(internet);
    }
}
