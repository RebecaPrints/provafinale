package com.centec.provafinale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    EditText etEtanol;
    EditText etGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tvResultado = findViewById(R.id.tvResultado);
        etEtanol = findViewById(R.id.etEtanol);
        etGasolina = findViewById(R.id.etGasolina);

    }
    public void btnCalcularonclick (View view){
        double etanol  = Integer.parseInt(etEtanol.getText().toString());
        double gasolina = Integer.parseInt(etGasolina.getText().toString());

        double resultado = etanol / gasolina;

        if (resultado <=0.7){
            tvResultado.setText("É mais vantajoso abastecer com Etanol ^~^");
        } else if (resultado >0.7) {
            tvResultado.setText("É mais vantajoso abastecer com gasolina 0~0");
        }
    }
}