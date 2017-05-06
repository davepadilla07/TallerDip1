package com.example.android.tallerdip1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    private Spinner comboGenero, comboTipo, comboMarca;
    private String[] generos, tipos, marcas;
    private ArrayAdapter adapter, adapter1, adapter2;
    private TextView cajaResultado;
    private TextView cajaUnitario;
    private EditText cajaCantidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cajaCantidad=(EditText)findViewById(R.id.txtCantidad);
        cajaResultado=(TextView)findViewById(R.id.txtResultado);
        cajaUnitario=(TextView)findViewById(R.id.txtUnitario);

        comboGenero=(Spinner)findViewById(R.id.cmbGenero);
        comboTipo=(Spinner)findViewById(R.id.cmbTipo);
        comboMarca=(Spinner)findViewById(R.id.cmbMarca);

        generos=this.getResources().getStringArray(R.array.generos);
        tipos=this.getResources().getStringArray(R.array.tipos);
        marcas=this.getResources().getStringArray(R.array.marcas);

        adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,generos);
        adapter1=new ArrayAdapter(this,android.R.layout.simple_list_item_1,tipos);
        adapter2=new ArrayAdapter(this,android.R.layout.simple_list_item_1,marcas);

        comboGenero.setAdapter(adapter);
        comboTipo.setAdapter(adapter1);
        comboMarca.setAdapter(adapter2);

    }

    public void calcular(View v){
        int cantidad=0;
        double res=0;

        if (validar()) {
            if (comboGenero.getSelectedItemPosition() == 0 && comboTipo.getSelectedItemPosition() == 0 && comboMarca.getSelectedItemPosition() == 0) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 120000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 0 && comboTipo.getSelectedItemPosition() == 0 && comboMarca.getSelectedItemPosition() == 1) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 140000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 0 && comboTipo.getSelectedItemPosition() == 0 && comboMarca.getSelectedItemPosition() == 2) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 130000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 0 && comboTipo.getSelectedItemPosition() == 1 && comboMarca.getSelectedItemPosition() == 0) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 50000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 0 && comboTipo.getSelectedItemPosition() == 1 && comboMarca.getSelectedItemPosition() == 1) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 80000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 0 && comboTipo.getSelectedItemPosition() == 1 && comboMarca.getSelectedItemPosition() == 2) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 100000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 1 && comboTipo.getSelectedItemPosition() == 0 && comboMarca.getSelectedItemPosition() == 0) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 100000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 1 && comboTipo.getSelectedItemPosition() == 0 && comboMarca.getSelectedItemPosition() == 1) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 130000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 1 && comboTipo.getSelectedItemPosition() == 0 && comboMarca.getSelectedItemPosition() == 2) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 110000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 1 && comboTipo.getSelectedItemPosition() == 1 && comboMarca.getSelectedItemPosition() == 0) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 60000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 1 && comboTipo.getSelectedItemPosition() == 1 && comboMarca.getSelectedItemPosition() == 1) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 70000 * cantidad;

            }
            if (comboGenero.getSelectedItemPosition() == 1 && comboTipo.getSelectedItemPosition() == 1 && comboMarca.getSelectedItemPosition() == 2) {
                cantidad = Integer.parseInt(cajaCantidad.getText().toString());
                res = 120000 * cantidad;

            }
            cajaResultado.setText(this.getResources().getString(R.string.resultado1) + " " + res);
            cajaUnitario.setText(this.getResources().getString(R.string.resultado) + " " + res / cantidad);
        }


    }

    public void borrar(View v){
        cajaCantidad.setText("");
    }

    public boolean validar(){
        if(cajaCantidad.getText().toString().isEmpty()){
            cajaCantidad.setError(getResources().getString(R.string.error));
            return false;
        }
        if(Double.parseDouble(cajaCantidad.getText().toString())==0){
            cajaCantidad.setError(getResources().getString(R.string.error1));
            cajaCantidad.setText("");
            return false;
        }
       return true;
    }


}
