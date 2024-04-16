package com.example.provatrilhas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    //Criando as  Variaveis das Classes TextView,  Button;
    Button bt_registrarTrilha,bt_Gerenciar,bt_Compartilhar,bt_Configuracao,bt_Sobre;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Referenciando as Variaveis com os elementos layout
        bt_registrarTrilha = findViewById(R.id.bt_RegistrarTrilha);
        bt_Compartilhar = findViewById(R.id.bt_Compartilhar);
        bt_Configuracao = findViewById(R.id.bt_Configuracao);
        bt_Gerenciar = findViewById(R.id.bt_Gerenciar);
        bt_Sobre = findViewById(R.id.bt_Sobre);
        tv = findViewById(R.id.tv_EscolhaUmaAcao);

        //Criando um Intent para ir em outra pagina quando clicar no botao
        bt_registrarTrilha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,RegistrarTrilha.class);
                startActivity(i);
            }
        });
        //Criando um Intent para ir em outra pagina quando clicar no botao
        bt_Sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Creditos.class);
                startActivity(i);
            }
        });
        //Criando um Intent para ir em outra pagina quando clicar no botao
        bt_Configuracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Configuracao.class);
                startActivity(i);
            }
        });
    }
}