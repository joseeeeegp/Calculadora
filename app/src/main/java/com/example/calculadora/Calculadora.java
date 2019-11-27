package com.example.calculadora;


import androidx.appcompat.app.AppCompatActivity;

public class Calculadora extends AppCompatActivity {


    double resultado;


    public double sumar(double operando1, double operando2) {
        try {
            resultado = operando2 + operando1;
        } catch (NumberFormatException nfe) {
        }
        ;


        return resultado;
    }

    public double multiplicacion(double operando1, double operando2) {
        try {
            resultado = operando2 * operando1;
        } catch (NumberFormatException nfe) {
        }
        ;
        return resultado;
    }

    public double restar(double operando1, double operando2) {
        try {
            resultado = operando2 - operando1;
        } catch (NumberFormatException nfe) {
        }
        ;
        return resultado;
    }

    public double dividir(double operando1, double operando2) {
        try {
            resultado = operando2 / operando1;
        } catch (NumberFormatException nfe) {
        }
        ;
        return resultado;
    }


}
