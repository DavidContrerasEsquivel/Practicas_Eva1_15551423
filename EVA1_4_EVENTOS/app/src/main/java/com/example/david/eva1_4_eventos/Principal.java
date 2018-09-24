package com.example.david.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener{
    TextView txtVwMensa;
    Button btnInterfaz;
    Button btnClaseAnonima;
    Button btnPorClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtVwMensa = findViewById(R.id.txtVwMensa);
        txtVwMensa.setText("Hola mundo cruel!!!");

        //EVENTO POR INTERFAZ
        btnInterfaz  =  findViewById(R.id.btnInterfaz);
        btnInterfaz.setOnClickListener(this);

        //EVENTO POR CLASE ANONIMA
        final Context cntApp = getApplicationContext();
        btnClaseAnonima = findViewById(R.id.btnClaseAnonima);
        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cntApp, "Evento por clase anonima",Toast.LENGTH_LONG).show();

            }
        });

        //POR CLASE
        btnPorClase = findViewById(R.id.btnPorClase);
        ClickListener miClickLis = new ClickListener();
        btnPorClase.setOnClickListener(miClickLis);
    }

    public void MiClick(View v){
        Toast.makeText(this, "Hola mundo cruel XML!!!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Hola mundo cruel Interfaz!!!", Toast.LENGTH_LONG).show();
    }
}
