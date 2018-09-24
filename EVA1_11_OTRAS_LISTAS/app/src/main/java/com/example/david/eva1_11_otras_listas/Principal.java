package com.example.david.eva1_11_otras_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{

    TextView txtVwMostrar;
    ListView lstVwTitu;
    final String[] sLibro = {"El Quijote",
            "Hamlet",
            "El conde de montecristo",
            "Los miserables",
            "El Hobbit",
            "Los 3 mosqueteros",
            "Divina comedia"};
    final String[] sSinopsis = {"Un libro bien perron sobre un bato que le teme a un molino, super loco el compa. Un libro bien perron sobre un bato que le teme a un molino, super loco el compa.",
            "El bato que siempre sale con la calavera, para mi que ese man era necrofilico. El bato que siempre sale con la calavera, para mi que ese man era necrofilico.",
            "La neta no lo he leido pero supongo que trata de un conde que vive en montecristo, xdxdxd. La neta no lo he leido pero supongo que trata de un conde que vive en montecristo, xdxdxd",
            "Pues trata sobre una revolucion francesa, aca bien fresona la pelicula, con musical y todo el rollo. Prefiero high school musical. Pues trata sobre una revolucion francesa, aca bien fresona la pelicula, con musical y todo el rollo. Prefiero high school musical.",
            "Pues el frodo ese con su mendigo anillo que no quiere empeñar y todo el mundo se lo quiere robar, con ese bato que solo dice: mi precioso. Pues el frodo ese con su mendigo anillo que no quiere empeñar y todo el mundo se lo quiere robar, con ese bato que solo dice: mi precioso.",
            "Pues eran mosqueteros con nombres bien raros, la neta no se que pensaban al ponerselos, pero pues combaten al mal. Pues eran mosqueteros con nombres bien raros, la neta no se que pensaban al ponerselos, pero pues combaten al mal",
            "Este libro todos los aman y pues que fregon. La verdad no lo he leido porque dicen que es bien confuso, pero pues ni pepe.  Este libro todos los aman y pues que fregon. La verdad no lo he leido porque dicen que es bien confuso, pero pues ni pepe."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtVwMostrar = findViewById(R.id.txtVwMostrar);
        lstVwTitu = findViewById(R.id.lstVwTitu);

        lstVwTitu.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,sLibro));
        lstVwTitu.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtVwMostrar.setText(sSinopsis[position]);
    }
}
