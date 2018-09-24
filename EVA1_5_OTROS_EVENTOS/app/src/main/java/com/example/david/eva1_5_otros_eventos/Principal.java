package com.example.david.eva1_5_otros_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup rdGrpOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rdGrpOpciones = findViewById(R.id.rdGrpOpciones);
        rdGrpOpciones.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        String sMensa;
        switch (i){
            case R.id.rdBtnTacos:
                sMensa = "Tacos";
                break;
            case R.id.rdBtnTamales:
                sMensa = "Tamales";
                break;
            case R.id.rdBtnTortas:
                sMensa = "Tortas";
                break;
            case R.id.rdBtnChiles:
                sMensa = "Chiles";
                break;
            case R.id.rdBtnMontados:
                sMensa = "Montados";
                break;
            default:
                sMensa = "Sin comer";
        }
        Toast.makeText(this,sMensa,Toast.LENGTH_LONG).show();
    }
}
