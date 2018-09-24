package com.example.david.eva1_practica_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, CheckBox.OnCheckedChangeListener, Button.OnClickListener {
    //RADIOGROUP
    RadioGroup rdGCafes;
    //RADIOBUTTON
    RadioButton btnAmericano;
    RadioButton btnExpreso;
    RadioButton btnCapuchino;
    //EDITTEXT
    EditText txtCantidad;
    //CHECKBOX
    CheckBox chkAzucar;
    CheckBox chkCrema;
    //BUTTON
    Button btnTotal;
    //TEXTVIEW
    TextView lblDescripcion;
    //VARIABLES
    String sDescripcion = "";
    int iPrecio = 0;
    int iExtra = 0;
    int iTotal = 0;
    int iCantidad = 0;
    String sCantidad = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //INSTANCIARLOS
        //RADIOGROUP
        rdGCafes = findViewById(R.id.rdGCafes);
        btnAmericano = findViewById(R.id.btnAmericano);
        btnExpreso = findViewById(R.id.btnExpreso);
        btnCapuchino = findViewById(R.id.btnCapuchino);
        //EXTRAS
        chkAzucar = findViewById(R.id.chkAzucar);
        chkCrema = findViewById(R.id.chkCrema);
        //CANTIDAD
        txtCantidad = findViewById(R.id.txtCantidad);
        //TOTAL
        btnTotal = findViewById(R.id.btnTotal);
        //DESCRIPCION
        lblDescripcion = findViewById(R.id.lblDescripcion);
        lblDescripcion.setText(" ");
        //------------------------------------------------------------------------------------------
        rdGCafes.setOnCheckedChangeListener(this);
        chkAzucar.setOnCheckedChangeListener(this);
        chkCrema.setOnCheckedChangeListener(this);
        //-----------------------------------------------------------------------------------------
        chkAzucar.setEnabled(false);
        chkCrema.setEnabled(false);
        //------------------------------------------------------------------------------------------
        btnTotal.setOnClickListener(this);
        btnTotal.setEnabled(false);
    }

    @Override
    public void onCheckedChanged(RadioGroup rdGCafes, int i) {
        if(R.id.btnAmericano == i){
            iPrecio = 20;
            iExtra = 0;
            iTotal = 0;
            chkAzucar.setChecked(false);
            chkCrema.setChecked(false);
            lblDescripcion.setText("Americano");
            sDescripcion  = "Americano";
            txtCantidad.setText("1");
            chkAzucar.setEnabled(true);
            chkCrema.setEnabled(true);
            btnTotal.setEnabled(true);
        }else if(R.id.btnCapuchino == i) {
            iPrecio = 48;
            iExtra = 0;
            iTotal = 0;
            chkAzucar.setChecked(false);
            chkCrema.setChecked(false);
            lblDescripcion.setText("Capuchino");
            sDescripcion  = "Capuchino";
            txtCantidad.setText("1");
            chkAzucar.setEnabled(true);
            chkCrema.setEnabled(true);
            btnTotal.setEnabled(true);
        }else if(R.id.btnExpreso == i){
            iPrecio = 30;
            iExtra = 0;
            iTotal = 0;
            chkAzucar.setChecked(false);
            chkCrema.setChecked(false);
            lblDescripcion.setText("Expresso");
            sDescripcion  = "Expresso";
            txtCantidad.setText("1");
            chkAzucar.setEnabled(true);
            chkCrema.setEnabled(true);
            btnTotal.setEnabled(true);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean i) {
        if(chkAzucar.isChecked()) {
            lblDescripcion.setText(sDescripcion + ", Azúcar");
            iExtra = 1;
            iTotal = 0;
            if(chkCrema.isChecked()){
                lblDescripcion.setText(sDescripcion + ", Azúcar, Crema");
                iExtra = 2;
                iTotal = 0;
            }
        }else if(chkCrema.isChecked()){
            lblDescripcion.setText(sDescripcion + ", Crema");
            iExtra = 1;
            iTotal = 0;
            if(chkAzucar.isChecked()){
                lblDescripcion.setText(sDescripcion + ", Azúcar, Crema");
                iExtra = 2;
                iTotal = 0;
            }
        }else{
            lblDescripcion.setText(sDescripcion);
            iExtra = 0;
            iTotal = 0;
        }
    }

    @Override
    public void onClick(View v) {
        sCantidad = String.valueOf(txtCantidad.getText());
        sCantidad = String.valueOf(txtCantidad.getText());
        iExtra = (iExtra) * (Integer.parseInt(sCantidad));
        iCantidad = (iPrecio) * (Integer.parseInt(sCantidad));
        iTotal = iCantidad + iExtra;

        Toast.makeText(this, "$"+iTotal, Toast.LENGTH_SHORT).show();
    }
}
