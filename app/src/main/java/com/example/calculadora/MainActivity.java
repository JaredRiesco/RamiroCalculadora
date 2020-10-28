package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton1,
            boton2,
            boton3,
            boton4,
            boton5,
            boton6,
            boton7,
            boton8,
            boton9,
            boton0,
            botonpunto,
            suma,
            resta,
            multiplicacion,
            borrar,
            division,
            igual,
            clean;
    TextView pantalla;
    String cantidadf, num2, num1, identificador;
    Double cantidaddob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.Uno);
        boton1.setOnClickListener(numeros);

        boton2 = findViewById(R.id.Dos);
        boton2.setOnClickListener(numeros);

        boton3 = findViewById(R.id.Tres);
        boton3.setOnClickListener(numeros);

        boton4 = findViewById(R.id.Cuatro);
        boton4.setOnClickListener(numeros);

        boton5 = findViewById(R.id.Cinco);
        boton5.setOnClickListener(numeros);

        boton6 = findViewById(R.id.Seis);
        boton6.setOnClickListener(numeros);

        boton7 = findViewById(R.id.Siete);
        boton7.setOnClickListener(numeros);

        boton8 = findViewById(R.id.Ocho);
        boton8.setOnClickListener(numeros);

        boton9 = findViewById(R.id.Nueve);
        boton9.setOnClickListener(numeros);

        boton0 = findViewById(R.id.Cero);
        boton0.setOnClickListener(numeros);

        botonpunto = findViewById(R.id.Punto);
        botonpunto.setOnClickListener(numeros);

        suma = findViewById(R.id.Suma);
        suma.setOnClickListener(operaciones);

        resta = findViewById(R.id.Resta);
        resta.setOnClickListener(operaciones);

        division = findViewById(R.id.Divide);
        division.setOnClickListener(operaciones);

        multiplicacion = findViewById(R.id.Multiplica);
        multiplicacion.setOnClickListener(operaciones);

        clean = findViewById(R.id.Clean);
        clean.setOnClickListener(operaciones);

        borrar = findViewById(R.id.Borrar);
        borrar.setOnClickListener(operaciones);

        igual = findViewById(R.id.Igual);
        igual.setOnClickListener(resultado);

        pantalla = (TextView) findViewById(R.id.Etiqueta);
    }
    View.OnClickListener numeros = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button numeros = (Button)v;
            String texto = numeros.getText().toString();
            cantidadf = pantalla.getText().toString();
            if (pantalla.getText().toString() == "0" && texto == "0"){
                pantalla.setText("0");
            }
            else {
                cantidadf = cantidadf + texto;
                pantalla.setText(cantidadf);
            }
        }
    };

    View.OnClickListener operaciones = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button operacion = (Button) v;
            identificador  = operacion.getText().toString();
            String texto = operacion.getText().toString();
            cantidadf = pantalla.getText().toString();
            num1 = cantidadf;
            switch (v.getId()) {
                case R.id.Suma:
                    pantalla.setText("+");
                    break;
                case R.id.Resta:
                    pantalla.setText("");
                    break;
                case R.id.Divide:
                    pantalla.setText("");
                    break;
                case R.id.Multiplica:
                    pantalla.setText("");
                    break;
                case R.id.Clean:
                    pantalla.setText("");
                    break;
                case R.id.Borrar:
                    pantalla.setText("");
                    break;
            };
        }
    };
    View.OnClickListener resultado = new View.OnClickListener() {
        @Override
        public void onClick(View vh) {
            Button operacion = (Button) vh;
            String texto = operacion.getText().toString();
            num2 = pantalla.getText().toString();
            cantidaddob = Double.parseDouble(num1) + Double.parseDouble(num2);
            switch (identificador) {
                case "+":
                    cantidaddob = Double.parseDouble(num1) + Double.parseDouble(num2);
                    pantalla.setText(cantidaddob.toString());
                    break;
                case "-":
                    cantidaddob = Double.parseDouble(num1) - Double.parseDouble(num2);
                    pantalla.setText(cantidaddob.toString());
                    break;
                case "/":
                    cantidaddob = Double.parseDouble(num1) / Double.parseDouble(num2);
                    pantalla.setText(cantidaddob.toString());
                    break;
                case "X":
                    cantidaddob = Double.parseDouble(num1) * Double.parseDouble(num2);
                    pantalla.setText(cantidaddob.toString());
                    break;
            };
        }
    };
}