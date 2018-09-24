package com.example.david.eva1_8_recursos_idioma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.RadioAccessSpecifier;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    //RADIO
    RadioGroup rdgIdioma;
    RadioButton rdBtnEsp;
    RadioButton rdBtnIng;
    //NOMBRE
    TextView txtVwNomre;
    EditText edtTxtNomre;
    //APELLIDO
    TextView txtVwApellido;
    EditText edttxtApellido;
    //EDAD
    TextView txtVwEdad;
    EditText edtVwEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //RADIO
        rdgIdioma = findViewById(R.id.rdgIdioma);
        rdBtnEsp = findViewById(R.id.rdBtnEsp);
        rdBtnIng = findViewById(R.id.rdBtnIng);
        //NOMBRE
        txtVwNomre = findViewById(R.id.txtVwNomre);
        edtTxtNomre = findViewById(R.id.edtTxtNomre);
        //APELLIDO
        txtVwApellido = findViewById(R.id.txtVwApellido);
        edttxtApellido = findViewById(R.id.edttxtApellido);
        //EDAD
        txtVwEdad = findViewById(R.id.txtVwEdad);
        edtVwEdad = findViewById(R.id.edtVwEdad);

        rdgIdioma.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        if(i == R.id.rdBtnEsp){
            rdBtnEsp.setText(R.string.rd_espa_es);
            rdBtnIng.setText(R.string.rd_ingles_es);
            txtVwNomre.setText(R.string.tv_nombre_es);
            edtTxtNomre.setHint(R.string.et_nomre_es);
            txtVwApellido.setText(R.string.tv_apellido_es);
            edttxtApellido.setHint(R.string.et_apellido_es);
            txtVwEdad.setText(R.string.tv_edad_es);
            edtVwEdad.setHint(R.string.et_edad_es);
        }else{
            rdBtnEsp.setText(R.string.rd_espa_en);
            rdBtnIng.setText(R.string.rd_ingles_en);
            txtVwNomre.setText(R.string.tv_nombre_en);
            edtTxtNomre.setHint(R.string.et_nomre_en);
            txtVwApellido.setText(R.string.tv_apellido_en);
            edttxtApellido.setHint(R.string.et_apellido_en);
            txtVwEdad.setText(R.string.tv_edad_en);
            edtVwEdad.setHint(R.string.et_edad_en);
        }
    }
}
