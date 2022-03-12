package com.example.practicaplanetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listadeplanetas);
        String[] nombre ={"mercurio","venus","tierra","marte","jupiter","saturno","urano","neptuno"};
        String[] kilometro ={"58 millones de Km del sol",
                "147 millones de km del sol",
                "150 millones de km del sol",
                "206,7 millones de km del Sol",
                "777,7 millones de Km del sol","147 millones de km del sol","2748 millones de km del sol",  " 205 millones de km del sol"};



        Integer[] idimagnes ={R.drawable.mercurio,R.drawable.venus,R.drawable.tierrra,R.drawable.marte,R.drawable.jupiter,R.drawable.saturno,R.drawable.urano,R.drawable.neptuno};
        AdapterListFruit adaptador = new AdapterListFruit(this,nombre,kilometro,idimagnes);
        listView.setAdapter(adaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Seleccionaste : "+nombre[i],Toast.LENGTH_LONG).show();

            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"los kilometros hacia el sol son :"+kilometro[i], Toast.LENGTH_LONG).show();
                return true;
            }
        });


        Intent intent1 = new Intent(this,AdapterListFruit.class);
        intent1.putExtra("cool",R.drawable.mercurio);


    }
}


