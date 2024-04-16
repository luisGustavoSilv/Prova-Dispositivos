package com.example.provatrilhas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Configuracao extends AppCompatActivity {
//Criando as  Variaveis das Classes EditText,  TextView,  Button;
    EditText et_KmHr;
    TextView tv_mS;
    Button bt_converter, bt_sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao);

//Referenciando as Variaveis com os elementos layout
        et_KmHr = findViewById(R.id.et_KmHr);
        tv_mS = findViewById(R.id.tv_mS);
        bt_converter = findViewById(R.id.bt_Converter);
        bt_sair = findViewById(R.id.bt_sairConfiguracao);

        //Criando um evento Listener e executando a acao de conversao
        bt_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Double valorKmHr = Double.parseDouble(et_KmHr.getText().toString());
              Double valorMs = valorKmHr / 3.6;

              tv_mS.setText(String.valueOf(valorMs)+ "m/s");
            }
        });
        //Criando um evento Listener e executando o metodo finish para sair da app
        bt_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}