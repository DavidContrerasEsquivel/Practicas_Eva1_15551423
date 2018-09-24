package com.example.david.eva1_practica_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    //EDITTEXT
    EditText txtFechNac;
    //RADIOGROUP - REGIONES
    RadioGroup rdgpRegiones;
    //RADIOBUTTON - REGIONES
    RadioButton btnDesarr;
    RadioButton btnAmer;
    RadioButton btnAsia;
    RadioButton btnAfri;
    //RADIOGROUP - GENERO
    RadioGroup rdgpGenero;
    //RADIOBUTTON - GENERO
    RadioButton btnHom;
    RadioButton btnMujer;
    //EDITTEXT
    EditText txtVida;
    EditText txtDeceso;
    //VARIABLES
    int iFechaNac = 0;
    int iDesarrollado = 0;
    int iAmerica = 0;
    int iAsia = 0;
    int iAfrica = 0;
    int iDiferencia = 0;
    int iDifereTotal = 0;
    int iVida = 0;
    int iFechaDeceso = 0;
    int iBandera = 0;
    int iDifReal = 0;
    boolean bHomre=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //INSTANCIAR
        //FECHA DE NACIMIENTO
        txtFechNac = findViewById(R.id.txtFechNac);
        //REGIONES
        rdgpRegiones = findViewById(R.id.rdgpRegiones);
        btnDesarr = findViewById(R.id.btnDesarr);
        btnAmer = findViewById(R.id.btnAmer);
        btnAsia = findViewById(R.id.btnAsia);
        btnAfri = findViewById(R.id.btnAfri);
        //GENEROS
        rdgpGenero = findViewById(R.id.rdgpGenero);
        btnHom = findViewById(R.id.btnHom);
        btnMujer = findViewById(R.id.btnMujer);
        //EXPECTATIVA DE VIDA
        txtVida = findViewById(R.id.txtVida);
        //AÑO DE DECESO
        txtDeceso = findViewById(R.id.txtDeceso);
        //------------------------------------------------------------------------------------------
        rdgpRegiones.setOnCheckedChangeListener(this);
        rdgpGenero.setOnCheckedChangeListener(this);
        //------------------------------------------------------------------------------------------
        btnHom.setEnabled(false);
        btnMujer.setEnabled(false);
        //------------------------------------------------------------------------------------------
        txtVida.setText(0 + "");
        txtDeceso.setText(0 + "");
        txtVida.setEnabled(false);
        txtDeceso.setEnabled(false);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String sVal = String.valueOf(txtFechNac.getText());
        iFechaNac = Integer.parseInt(sVal);
        //REGIONES DESARROLLADAS
        if (R.id.btnDesarr == i) {
            if (iFechaNac >= 1950 && iFechaNac < 1960) {
                iDesarrollado = 75;
                iDiferencia = 10;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 1;
            } else if (iFechaNac >= 1960 && iFechaNac < 1970) {
                iDesarrollado = 75;
                iDiferencia = 9;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 1;
            } else if (iFechaNac >= 1970 && iFechaNac < 1980) {
                iDesarrollado = 80;
                iDiferencia = 8;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 1;
            } else if (iFechaNac >= 1980 && iFechaNac < 1990) {
                ;
                iDesarrollado = 80;
                iDiferencia = 7;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 1;
            } else if (iFechaNac >= 1990 && iFechaNac < 2000) {
                iDesarrollado = 85;
                iDiferencia = 6;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 1;
            } else if (iFechaNac >= 2000 && iFechaNac < 2010) {
                iDesarrollado = 90;
                iDiferencia = 4;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 1;
            } else {
                Toast.makeText(this, "AÑO NO VALIDO", Toast.LENGTH_SHORT).show();
            }
            //AMERICA LATINA
        }
        if (R.id.btnAmer == i) {
            if (iFechaNac >= 1950 && iFechaNac < 1960) {
                iAmerica = 60;
                iDiferencia = 10;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 2;
            } else if (iFechaNac >= 1960 && iFechaNac < 1970) {
                iAmerica = 65;
                iDiferencia = 9;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 2;
            } else if (iFechaNac >= 1970 && iFechaNac < 1980) {
                iAmerica = 70;
                iDiferencia = 8;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 2;
            } else if (iFechaNac >= 1980 && iFechaNac < 1990) {
                iAmerica = 75;
                iDiferencia = 7;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 2;
            } else if (iFechaNac >= 1990 && iFechaNac < 2000) {
                iAmerica = 75;
                iDiferencia = 6;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 2;
            } else if (iFechaNac >= 2000 && iFechaNac < 2010) {
                iAmerica = 70;
                iDiferencia = 4;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 2;
            } else {
                Toast.makeText(this, "AÑO NO VALIDO", Toast.LENGTH_SHORT).show();
            }
        }
        //ASIA
        if (R.id.btnAsia == i) {
            if (iFechaNac >= 1950 && iFechaNac < 1960) {
                iAsia = 45;
                iDiferencia = 10;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 3;
            } else if (iFechaNac >= 1960 && iFechaNac < 1970) {
                iAsia = 50;
                iDiferencia = 9;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 3;
            } else if (iFechaNac >= 1970 && iFechaNac < 1980) {
                iAsia = 65;
                iDiferencia = 8;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 3;
            } else if (iFechaNac >= 1980 && iFechaNac < 1990) {
                iAsia = 65;
                iDiferencia = 7;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 3;
            } else if (iFechaNac >= 1990 && iFechaNac < 2000) {
                iAsia = 60;
                iDiferencia = 6;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 3;
            } else if (iFechaNac >= 2000 && iFechaNac < 2010) {
                iAsia = 65;
                iDiferencia = 4;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 3;
            } else {
                Toast.makeText(this, "AÑO NO VALIDO", Toast.LENGTH_SHORT).show();
            }
        }
        //AFRICA
        if (R.id.btnAfri == i) {
            if (iFechaNac >= 1950 && iFechaNac < 1960) {
                iAfrica = 35;
                iDiferencia = 10;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 4;
            } else if (iFechaNac >= 1960 && iFechaNac < 1970) {
                iAfrica = 45;
                iDiferencia = 9;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 4;
            } else if (iFechaNac >= 1970 && iFechaNac < 1980) {
                iAfrica = 55;
                iDiferencia = 8;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 4;
            } else if (iFechaNac >= 1980 && iFechaNac < 1990) {
                iAfrica = 60;
                iDiferencia = 7;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 4;
            } else if (iFechaNac >= 1990 && iFechaNac < 2000) {
                iAfrica = 55;
                iDiferencia = 6;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 4;
            } else if (iFechaNac >= 2000 && iFechaNac < 2010) {
                iAfrica = 60;
                iDiferencia = 4;
                btnHom.setEnabled(true);
                btnMujer.setEnabled(true);
                iDifereTotal = (iDiferencia / 2);
                iBandera = 4;
            } else {
                Toast.makeText(this, "AÑO NO VALIDO", Toast.LENGTH_SHORT).show();
            }
        }
        if (R.id.btnHom == i) {
            bHomre =true;
        }
        if(R.id.btnMujer == i){
            bHomre = false;
        }
        if(bHomre){
            iDifReal = iDifereTotal;
            iDifereTotal = iDifereTotal * (-1);
        }
        if (btnHom.isChecked() || btnMujer.isChecked()) {
            if (iBandera == 1) {
                iVida = (iDesarrollado + iDifereTotal);
                txtVida.setText(iVida + "");
                iFechaDeceso = (iVida + iFechaNac);
                txtDeceso.setText(iFechaDeceso + "");
            } else if (iBandera == 2) {
                iVida = (iAmerica + iDifereTotal);
                txtVida.setText(iVida + "");
                iFechaDeceso = (iVida + iFechaNac);
                txtDeceso.setText(iFechaDeceso + "");
            } else if (iBandera == 3) {
                iVida = (iAsia + iDifereTotal);
                txtVida.setText(iVida + "");
                iFechaDeceso = (iVida + iFechaNac);
                txtDeceso.setText(iFechaDeceso + "");
            } else if (iBandera == 4) {
                iVida = (iAfrica + iDifereTotal);
                txtVida.setText(iVida + "");
                iFechaDeceso = (iVida + iFechaNac);
                txtDeceso.setText(iFechaDeceso + "");
            }
            iDifereTotal = iDifReal;
        }
    }
}
