package com.example.calculadora0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private Button botn_suma;
    private Button botn_suma2;
    private Button botn_suma3;
    private Button botn_resta;
    private Button botn_multiplicacion;
    private Button botn_dividir;
    private TextView tex_respuesta;
    private EditText edit_n1;
    //private EditText edit_n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_n1=findViewById(R.id.numero1);
     //   edit_n2=findViewById(R.id.numero2);

        botn_suma2= findViewById(R.id.button_suma2);
        botn_suma2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex_respuesta.setText(  primero(Double.parseDouble(edit_n1.getText().toString()))+"");

            }
        });
        botn_suma3= findViewById(R.id.button_suma3);
        botn_suma3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex_respuesta.setText(  primero(Double.parseDouble(edit_n1.getText().toString()))+"");

            }
        });
        botn_suma= findViewById(R.id.button_suma);
        botn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              tex_respuesta.setText(  primero(Double.parseDouble(edit_n1.getText().toString()))+"");

            }
        });


        botn_resta= findViewById(R.id.button_resta);
        botn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex_respuesta.setText(  miligramoskilos(Double.parseDouble(edit_n1.getText().toString()))+"");

            }
        });

        botn_multiplicacion= findViewById(R.id.button_multiplicacion);
        botn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex_respuesta.setText(  miligramosgramos(Double.parseDouble(edit_n1.getText().toString()))+"");

            }
        });
        botn_dividir= findViewById(R.id.button_dividir);
        botn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tex_respuesta.setText(  gramoskilos(Double.parseDouble(edit_n1.getText().toString()))+"");

            }
        });

        tex_respuesta=findViewById(R.id.respuesta);


    }

    public double primero (double a) {
        return a/(1000);
    }
    public double segundo (double a) {
        return a/(1000);
    }
    public double tercero (double a) {
        return a/(10000);
    }




    public double miligramoskilos(double a){
        return a*(10000);
    }

    public double miligramosgramos (double a){
        return a* (1000);
    }

    public double gramoskilos (double a){
        return a*(1000);
    }
}