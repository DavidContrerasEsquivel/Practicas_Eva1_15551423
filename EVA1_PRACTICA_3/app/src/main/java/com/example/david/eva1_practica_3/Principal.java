package com.example.david.eva1_practica_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, Button.OnClickListener{
    //EDITTEXT
    EditText txtNombre;
    EditText txtApellido;
    EditText txtEdad;
    //RADIOGROUP
    RadioGroup rdgpSexo;
    //RADIOBUTTON
    RadioButton rbtnHombre;
    RadioButton rbtnMujer;
    //EDITEXT
    EditText txtOrganizacion;
    EditText txtCorreo;
    //BOTON
    Button btnAgregar;
    //VARIABLES
    String sNombre = "";
    String sApellido = "";
    int iEdad = 0;
    String sOrganizacion = "";
    String sCorreo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //NOMBRE COMPLETO - EDAD
        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtEdad = findViewById(R.id.txtEdad);
        //GENERO
        rdgpSexo = findViewById(R.id.rdgpSexo);
        rbtnHombre = findViewById(R.id.rbtnHombre);
        rbtnMujer = findViewById(R.id.rbtnMujer);
        //ORGANICAZION - CORREO
        txtOrganizacion = findViewById(R.id.txtOrganizacion);
        txtCorreo = findViewById(R.id.txtCorreo);
        //AGREGAR
        btnAgregar = findViewById(R.id.btnAgregar);
        //------------------------------------------------------------------------------------------
        rdgpSexo.setOnCheckedChangeListener(this);
        btnAgregar.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
           if(txtNombre.getText().toString().equals("") || txtApellido.getText().toString().equals("") || txtNombre.getText().toString().equals("") || txtOrganizacion.getText().toString().equals("") || txtCorreo.getText().toString().equals("") || txtEdad.getText().toString().equals("") || (!rbtnHombre.isChecked() && !rbtnMujer.isChecked()) ){
               Toast.makeText(this, "CAMPOS SIN LLENAR", Toast.LENGTH_SHORT).show();
           }else{
               //METODO COMPARAR
               boolean bComparar = Guardar.ListaClase.CompararCorreo(txtCorreo.getText().toString());
               if(bComparar == true){
                   Toast.makeText(this, "CORREO EXISTENTE, CAMBIELO", Toast.LENGTH_SHORT).show();
               }else{
                   //METODO AGREGAR CORREO
                   Guardar.ListaClase.AgregaCorreo(txtCorreo.getText().toString());
                   //TAMAÑO DE LOS REGISTROS
                   Toast.makeText(this, "Registros: " + Guardar.ListaClase.iTamaño, Toast.LENGTH_SHORT).show();
                   //INICIALIZAR LOS CAMPOS
                   txtNombre.setText("");
                   txtApellido.setText("");
                   txtCorreo.setText("");
                   txtOrganizacion.setText("");
                   txtEdad.setText("");
                   rbtnHombre.setChecked(true);
                   rbtnMujer.setChecked(true);
                   rbtnHombre.setChecked(false);
                   rbtnMujer.setChecked(false);
               }
           }
    }
    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
    }
}
//CLASE GUARDAR
class Guardar{
    //CLASE
    static Guardar ListaClase = new Guardar();
    //VARIABLE
    int iTamaño = 0;
    //ARREGLO
    ArrayList<String> Lista = new ArrayList<String>();
    //METODO AGREGARCORREO
    public void AgregaCorreo(String sCorreo){
        Lista.add(sCorreo);
        iTamaño = Lista.size();
    }
    //METODO COMPARAR CORREO
    public boolean CompararCorreo(String sCorreo){
        for(int i = 0; i < Lista.size(); i++){
            String sValExistente = Lista.get(i);
            if(sValExistente.equals(sCorreo)){
                return true;
            }
        }
        return false;
    }
}
