package com.example.nowor_000.estructura;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contador;
    private EditText ed1;
    private Button bt1, btnContador;
    private TextView tvContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVistas();

      //  restaurarEstado(savedInstanceState);



    }

    public void inicializarVistas(){

        tvContador=(TextView) findViewById(R.id.tvContador);
        ed1=(EditText) findViewById(R.id.ed1);
        bt1= (Button) findViewById(R.id.b1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), SegundaVentana.class);
                i.putExtra("orientacion", ed1.getText().toString());
                startActivity(i);

            }
        });

        btnContador=(Button) findViewById(R.id.btnContador);
        btnContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++contador;
                tvContador.setText(String.valueOf(contador));
            }
        });
    }




    /**
     * forma de guardar el estado
     */
    @Override
    protected void onSaveInstanceState(Bundle estado) {
        super.onSaveInstanceState(estado);
        estado.putInt("contador", contador);

    }




    /**
     * forma 1 de resturar el estado
     */
    public void restaurarEstado(Bundle savedInstanceState){

        if(savedInstanceState!=null){
            contador=savedInstanceState.getInt("contador");
            tvContador.setText(String.valueOf(contador));
            Log.d("contador", String.valueOf(contador));
        }
    }




    /**
     * forma 2 de resturar el estado
*/
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        contador = savedInstanceState.getInt("contador");

        tvContador.setText(String.valueOf(contador));
        Log.d("contador", String.valueOf(contador));

    }







}
