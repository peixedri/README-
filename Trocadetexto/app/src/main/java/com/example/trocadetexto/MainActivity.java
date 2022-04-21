package com.example.trocadetexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao(View v) {
        TextView texto = findViewById(R.id.textoParaMudar);
        texto.setText("TEXTO MUDADO COM SUCESSO");
    }

    public void selecionarBotao1(View v) {
        TextView texto = findViewById(R.id.saudação);
        texto.setText("BOM DIA");

    }
}