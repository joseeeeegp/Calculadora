package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.util.Log;

import static java.lang.String.*;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    TextView resultado;

    Button sumar;
    Button multiplicar;
    Button restar;
    Button dividir;

    Calculadora calcul = new Calculadora();

    RadioButton par;
    RadioButton impar;

    private static final String LOG_TAG = "hola Macià";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
        numero1 = findViewById(R.id.editText1);
        numero2 = findViewById(R.id.editText2);
        sumar = findViewById(R.id.add);
        resultado = findViewById(R.id.resultado);
        multiplicar = findViewById(R.id.mul);
        restar = findViewById(R.id.sub);
        dividir = findViewById(R.id.div);
        par = findViewById(R.id.RadioPar);
        impar = findViewById(R.id.RadioImpar);

        sumar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double operando1, operando2, resultt;
                operando1 = Double.parseDouble(numero1.getText().toString());
                operando2 = Double.parseDouble(numero2.getText().toString());
                resultt = calcul.sumar(operando1, operando2);
                if (resultt%2 != 0){
                    par.setChecked(false);
                    impar.setChecked(true);
                }else{
                    par.setChecked(true);
                    impar.setChecked(false);
                }
                resultado.setText(valueOf(resultt));
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double operando1, operando2, resultt;
                operando1 = Double.parseDouble(numero1.getText().toString());
                operando2 = Double.parseDouble(numero2.getText().toString());
                resultt = calcul.multiplicacion(operando1, operando2);
                if (resultt%2 != 0){
                    par.setChecked(false);
                    impar.setChecked(true);
                }else{
                    par.setChecked(true);
                    impar.setChecked(false);
                }
                resultado.setText(valueOf(resultt));
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double operando1, operando2, resultt;
                operando1 = Double.parseDouble(numero1.getText().toString());
                operando2 = Double.parseDouble(numero2.getText().toString());
                resultt = calcul.restar(operando1, operando2);
                if (resultt%2 != 0){
                    par.setChecked(false);
                    impar.setChecked(true);
                }else{
                    par.setChecked(true);
                    impar.setChecked(false);
                }
                resultado.setText(valueOf(resultt));
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double operando1, operando2, resultt;
                operando1 = Double.parseDouble(numero1.getText().toString());
                operando2 = Double.parseDouble(numero2.getText().toString());
                resultt = calcul.dividir(operando1, operando2);
                if (resultt%2 != 0){
                    par.setChecked(false);
                    impar.setChecked(true);
                }else{
                    par.setChecked(true);
                    impar.setChecked(false);
                }
                resultado.setText(valueOf(resultt));
            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }


}
