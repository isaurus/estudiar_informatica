package com.example.estudiarinformatica;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaración de Spinner
    Spinner spnCiclos;
    Spinner spnPoblacion;
    Spinner spnTipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicialización de los objetos Spinner acoplando los recursos XML
        spnCiclos = findViewById(R.id.spnCiclos);
        spnPoblacion = findViewById(R.id.spnPoblacion);
        spnTipo = findViewById(R.id.spnTipo);

        // PASO 1 > Cargar los valores del array (en strings.xml). El tercer parámetro es para los ítems individuales sin el Spinner desplegado
        ArrayAdapter<CharSequence> adapterSpinnerCiclos = ArrayAdapter.createFromResource(this, R.array.ciclos, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterSpinnerPoblacion = ArrayAdapter.createFromResource(this, R.array.poblacion, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapterSpinnerTipo = ArrayAdapter.createFromResource(this, R.array.tipo, android.R.layout.simple_spinner_item);

        // PASO 2 > Especificar el layout que se mostrará cuando se desplieguen las opciones
        adapterSpinnerCiclos.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        adapterSpinnerPoblacion.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        adapterSpinnerTipo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        // PASO 3 > Acoplar el adaptador al Spinner
        spnCiclos.setAdapter(adapterSpinnerCiclos);
        spnPoblacion.setAdapter(adapterSpinnerPoblacion);
        spnTipo.setAdapter(adapterSpinnerTipo);

        spnCiclos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}