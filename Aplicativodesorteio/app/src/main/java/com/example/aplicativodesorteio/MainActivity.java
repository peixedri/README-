package com.example.aplicativodesorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selecionarBotao(View v, int bound){
        int x = new Random().nextInt(bound:11); //0 1 2 3 4 5 6 7 8 9 10
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText("O número sorteado foi: "+x);



    }


}

