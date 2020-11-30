package com.example.sensorpam;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loginbotao (View view){
        Intent intent = new Intent (this, Login.class);
        startActivity(intent);
    }
    public void botao (View view) {
        Uri uri = Uri.parse("https://www.sosmulher.sp.gov.br/");
        Intent internet = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(internet);
    }
}
