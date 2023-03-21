package com.guia5.listadepersonas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;
    private String nombre[] = {"Juan", "Maria", "Valeria", "Luis", "Ana", "Miguel", "Pedro", "Antonio", "Jorge", "Mario"};
    private String edad[] = {"21", "32", "27", "19", "45", "32", "26", "29", "30", "37"};
    private String direccion[] = {"Las Tunas", "El Zapote", "El Carrisal", "San Antonio", "Los Conacastes", "El Sitio", "El Morral", "Los Pirineos", "Monte Blanco", "Las Azaleas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombre);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(i) + " es " + edad[i] + " años" + " Su direccion es " + direccion[i]);
            }
        });
    }
}