package com.example.david.eva1_6_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements  ListView.OnItemClickListener{
    //OBJETOS
    TextView  txtVwMostrar;
    ListView  lstVwDatos;
    //ARREGLO
    final String[] sResta = {"Buffalo Wild Wings","Los Peques","El garage","Taller del chef","Las Nix","Tori´s Burguer",
    "El campeon","Pizza Hut","La Cabaña del Catarro","Liru  sisa","Akari","Elotes Alex","Wings Stop","Come Camila","Fast Bull"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //INSTANCIARLOS
        txtVwMostrar = findViewById(R.id.txtVwMostrar);
        lstVwDatos = findViewById(R.id.lstVwDatos);
        //ASIGNAR UN ADAPTADOR (INTERMEDIARIO PARA EL ORIGEN DE LOS DATOS)
        lstVwDatos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sResta));

        lstVwDatos.setOnItemClickListener(this);
    }

    //METODO PARA SELECCIONAR ITEMS
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        txtVwMostrar.setText(sResta[i]);
    }
}
