package com.example.android.tallerdip1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {
    private Spinner comboGenero, comboTipo, comboMarca;
    private String[] generos, tipos, marcas;
    private ArrayAdapter adapter, adapter1, adapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        comboGenero=(Spinner)findViewById(R.id.cmbGenero);
        comboTipo=(Spinner)findViewById(R.id.cmbTipo);
        comboMarca=(Spinner)findViewById(R.id.cmbMarca);

        generos=this.getResources().getStringArray(R.array.generos);
        tipos=this.getResources().getStringArray(R.array.tipos);
        marcas=this.getResources().getStringArray(R.array.marcas);

        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,generos);
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,tipos);
        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,marcas);

        comboGenero.setAdapter(adapter);
        comboTipo.setAdapter(adapter);
        comboMarca.setAdapter(adapter);



    }

    public void calcular(View v){
        int op;
        double sd;
    }


}
