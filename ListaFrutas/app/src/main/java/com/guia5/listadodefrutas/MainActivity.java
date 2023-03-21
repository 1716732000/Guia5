package com.guia5.listadodefrutas;

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

    private String frutas[] = {
            "Mango",
            "Melon",
            "Arrayan",
            "Papaya",
            "Ciruela",
            "Zapote",
            "Albaricoque",
            "Arandano",
            "Fresa",
            "Granada",
            "Grosella",
            "Higo",
            "Lima",
            "Limon",
            "Mandarina",
            "Manzana",
            "Melocoton",
            "Membrillo",
            "Mora",
            "Naranja",
            "Pera",
            "Piña",
            "Platano",
            "Pomelo",
            "Sandia"
    };
    private String descri[] = {
            "El mango es el nombre de las frutas de varias especies de árboles del género Mangifera.",
            "Cucumis melo, llamado comúnmente melón, es una especie de la familia de las cucurbitáceas.",
            "CAS, En El Salvador es conocido como \"arrayán\" y también es utilizada para la preparación de frescos.",
            "Carica papaya es una planta herbácea del género Carica en la familia Caricaceae. Su fruto se conoce comúnmente como papaya.",
            "La ciruela es la fruta del ciruelo, nombre común de varias especies arbóreas pertenecientes al subgénero Prunus.",
            "Zapote es el nombre usado para varias frutas tropicales y subtropicales comunes en Mesoamérica, en la porción norte de Sudamérica, y en varias zonas del Caribe.",
            "Prunus armeniaca, llamado comúnmente albaricoque, damasco, amasco, albergero o chabacano es un árbol frutal originario de China, Turquía, Irán, Armenia, Azerbaiyán y Siria.",
            "El nombre arándano rojo o azul hace referencia al fruto de un grupo de arbustos enanos perennes del género Vaccinium, subgénero Oxycoccus.",
            "La fresa es el fruto que da la planta fragaria, un género de planta rastrera estolonífera de la familia Rosaceae.",
            "Punica granatum, llamado comúnmente granado, es una especie de planta de la familia Lythraceae, cuyo fruto es la granada. Nativa de la región desde Irán hasta el Himalaya, se ha cultivado desde la antigüedad por toda la cuenca mediterránea.",
            "El grosellero rojo, corinto o parrilla es una especie de arbusto perteneciente a la familia Grossulariace",
            "El higo es un fruto obtenido de la higuera. Desde el punto de vista botánico, el higo es una infrutescencia, por lo tanto desde el punto de vista botánico no es un solo fruto.",
            "Lima es un nombre genérico por el que se conocen varias frutas cítricas similares entre sí, de diversas especies de árboles frutales.",
            "Citrus × limon, el limonero, es un pequeño árbol frutal perenne. Su fruto es el limón o citrón, una fruta comestible de sabor ácido y extremadamente fragante que se usa principalmente en la alimentación.",
            "La mandarina es el fruto de las diferentes especies de cítricos llamados comúnmente mandarino, entre ellas Citrus reticulata, Citrus unshiu, Citrus × reshni, así como sus híbridos, incluyendo Citrus × tangerina, cuya taxonomía está discutida.",
            "La manzana o poma es el fruto comestible de la especie Malus domestica, el manzano común. Es una fruta pomácea de forma redonda y sabor muy dulce, dependiendo de la variedad.",
            "Prunus persica, originalmente Amygdalus persica L. y comúnmente conocido como melocotonero, es una especie de árbol del género Prunus de la familia Rosaceae. También se suele denominar duraznero en países hispanoamericanos y albérchigo en castellano antiguo.",
            "Cydonia es un género de planta arbórea perteneciente a la familia de las Rosáceas. Se trata de un género monotípico, cuya única especie es Cydonia oblonga, comúnmente llamado membrillo o membrillero.",
            "Mora es el nombre que reciben diversos frutos comestibles de distintas especies; cuya fruta no es una baya, sino un eterio, compuesto de pequeños drupas, que le da una forma en común a este grupo de frutas.",
            "La naranja es una fruta cítrica obtenida del naranjo dulce, del naranjo amargo y de naranjos de otras variedades o híbridos, de origen asiático.",
            "Se denomina pera al fruto de distintas especies del género Pyrus, integrado por árboles caducifolios conocidos comúnmente como perales.",
            "Ananas comosus es una especie de la familia de las bromeliáceas, nativa de América del Sur. Planta de escaso porte y con hojas duras y lanceoladas de hasta 1 m de largo.",
            "La banana, conocido también como banano, plátano, guineo maduro, guineo, cambur o gualele, es un fruto comestible, de varios tipos de grandes plantas herbáceas del género Musa.",
            "El pomelo o toronja es una planta del género Citrus, de la familia de las rutáceas, cultivado por su fruta, el pomelo o toronja.",
            "Citrullus lanatus, comúnmente llamada melón de agua, sandía, acendría, sindria, patilla, es una especie de la familia Cucurbitaceae."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, frutas);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("FRUTA: " + lv1.getItemAtPosition(i) + " - " + " DESCRIPCION: " + descri[i]);
            }
        });
    }
}