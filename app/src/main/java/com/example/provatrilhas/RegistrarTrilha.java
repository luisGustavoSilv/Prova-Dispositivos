package com.example.provatrilhas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class RegistrarTrilha extends AppCompatActivity {

    EditText et_local,et_dia,et_periodo;
    Button bt_registrar, bt_sair, bt_mostrarRegistro;
    TextView tv_mostrarRegistro;
    String dia, local, periodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_trilha);

        et_local = findViewById(R.id.et_local);
        et_dia = findViewById(R.id.et_dia);
        et_periodo = findViewById(R.id.et_periodo);
        bt_registrar = findViewById(R.id.bt_Registrar);
        bt_sair = findViewById(R.id.bt_Sair);
        bt_mostrarRegistro = findViewById(R.id.bt_MostrarRegistro);
        tv_mostrarRegistro(findViewById(R.id.tv_registro))


        bt_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia = et_dia.getText().toString();
                local = et_local.getText().toString();
                periodo = et_periodo.getText().toString();
            }
        });
        bt_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bt_mostrarRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}