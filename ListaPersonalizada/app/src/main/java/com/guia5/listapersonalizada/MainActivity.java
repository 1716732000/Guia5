package com.guia5.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] paises = {"El Salvador", "Guatemala", "Honduras", "Nicaragua", "Costa Rica"};
    ListView lvstPais;
    Integer[] ImgPaises = {
                R.drawable.banderaesa,
                R.drawable.banderaguatemala,
                R.drawable.banderahon,
                R.drawable.banderanic,
                R.drawable.banderacr
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorPais adaptador = new AdaptadorPais(this, paises, ImgPaises);
        lvstPais.setAdapter(adaptador);
    }

}