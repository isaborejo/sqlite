package com.example.sensorpam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageButton;



public class Principal extends AppCompatActivity
{

    ImageButton callbotao;
    ImageButton smsbotao;
    SensorManager sensorManager;
    Sensor sensorProximity;
    Vibrator vibrator;
    private SensorEventListener LightEventListener;
    private View principal;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


    }
    public void mariabotao (View view){
        Intent intent = new Intent (this, Maria.class);
        startActivity(intent);

        callbotao = (ImageButton) findViewById(R.id.callbotao);
                principal = (ConstraintLayout) findViewById(R.id.principal);

        callbotao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:");
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(uri);
                if (ActivityCompat.checkSelfPermission(Principal.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Principal.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    return;
                }
                startActivity(intent);
            }
        });

    }

}




