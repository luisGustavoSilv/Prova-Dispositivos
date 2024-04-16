package com.example.provatrilhas;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button bt_registrarTrilha,bt_Gerenciar,bt_Compartilhar,bt_Configuracao,bt_Sobre;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_registrarTrilha = findViewById(R.id.bt_RegistrarTrilha);
        bt_Compartilhar = findViewById(R.id.bt_Compartilhar);
        bt_Configuracao = findViewById(R.id.bt_Configuracao);
        bt_Gerenciar = findViewById(R.id.bt_Gerenciar);
        bt_Sobre = findViewById(R.id.bt_Sobre);
        tv = findViewById(R.id.tv);

    }
}