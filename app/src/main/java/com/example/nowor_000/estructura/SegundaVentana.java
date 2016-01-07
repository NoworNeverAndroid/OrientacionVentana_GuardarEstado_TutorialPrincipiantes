package com.example.nowor_000.estructura;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SegundaVentana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_ventana);

        String orientacion = getIntent().getExtras().getString("orientacion");
        if(orientacion!=null){

            switch (orientacion){

                case "v":
                  this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                    break;
                case "h":
                    this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                    break;
                default:
                    Toast.makeText(getApplicationContext(),"Orientacion no determinada", Toast.LENGTH_SHORT).show();
                    this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
                    break;

            }


        }

    }
}
