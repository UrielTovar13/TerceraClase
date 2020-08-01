package com.tovar;

import java.awt.desktop.SystemEventListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    /**
    1 -> Calcular calificacion
    2 -> Suma de enteros
    3 -> Interés compuesto
    4 -> Pirámide
  */

    /**
     * -7 ----
     * -13 - Internet
     * */
    public static void main(String[] args) {

       /* System.out.println("La suma es " + Sumar());

        Interes(1000.00, 0.05);

        Calificacion(79);

        PiramideImp(4);*/

       // While();

       // System.out.println("---------------");

        //DoWhile();

        //Ejercicio(0,100);

        Arrays();

    }

    public static void Arrays() {
      int [] arreglo = {1, 2, 3, 4, 5};

      ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Uriel");
        nombres.add("Armando");
        nombres.add("Karen");
        nombres.add("Viviana");
        nombres.add("Gibram");

      for(int index = 0; index <= arreglo.length - 1; index++) {
          System.out.println("Valor en el arreglo: " + arreglo[index]);
      }

      for (int index = 0; index <= nombres.size() - 1; index++) {

          if (nombres.get(index).contains("Uriel")) {
              nombres.remove(index);
          }

          System.out.println("Estamos en clase los siguientes alumnos: " + nombres.get(index));
      }

      /*System.out.println("Size: " + arreglo.length);
      System.out.println("Last: " + arreglo[0]);*/

    }

    public static void While() {
        int contador = 10;
        while(contador >= 1) {
            System.out.println("Número: " + contador);
            contador--;
        }
    }

    public static void DoWhile() {
        int contador = 0;
        do {
            System.out.println("Número: " + contador);
            contador++;
        }while(contador <= 10);
    }

    /*
    Crear una función que imprima en la consola los números del 0 al 100
    y los números del 100 al 0.
    Resultado esperado:
    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40
     41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78
      79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100

    100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76 75 74 73 72 71 70 69 68 67 66 65 64
    63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26
    25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
    */

    public static void Ejercicio(int numeroMin, int numeroMax) {
        while(numeroMin <= 100) {
            System.out.print(numeroMin + " ");
            numeroMin++;
        }
        System.out.println(" ");
        while (numeroMax >= 0) {
            System.out.print(numeroMax + " ");
            numeroMax--;
        }
    }

    /*Crear una función que sume los números enteros pares del 2 al 20
    y devuelva el resultado.
    Resultado esperado: La suma es: 110
    */
    public static int Sumar() {
        int total = 0;
        for (int numero = 2; numero <= 20; numero += 2) {
            total += numero;
            //total = total + numero;
        }
        return total;
    }

    /*Crear una función que cálcule el interés compuesto
    Considere el siguiente problema:
    Una persona invierte $1 000.00 en una cuenta de ahorro que produce el 5% de
    interés. Suponiendo que todo el interés se deposita en la cuenta, calcule e
    imprima el monto de dinero en la cuenta al ﬁnal de cada año, durante
    10 años. Use la siguiente fórmula para determinar los montos:
    c = p(1 + r)n
    en donde p es el monto que se invirtió originalmente
    (es decir, el monto principal)
    r es la tasa de interés anual (por ejemplo, use 0.05 para el 5%)
    n es el número de años
    c es la cantidad depositada al ﬁ nal del n-ésimo año.
    Resultado esperado:
    Anio   Monto en deposito
    1            1,050.00
    2            1,102.50
    3            1,157.63
    4            1,215.51
    5            1,276.28
    6            1,340.10
    7            1,407.10
    8            1,477.46
    9            1,551.33
    10            1,628.89
    */
    public static void Interes (double montoPrincipal, double tasaDeInteres) {
        double monto;
        System.out.println("Año   Monto en deposito");
        for (int anio = 1; anio <= 10; anio++) {
            monto = montoPrincipal * Math.pow( 1.0 + tasaDeInteres, anio );
            System.out.printf( "%4d%,20.2f\n", anio, monto );
        }
    }

      /*
        Crear una función que calcule el equivalente alfabético de una
        calificación numérica donde:
        100 -> A+
        90-99 -> A
        80-89 -> B
        70-79 -> C
        60-69 -> D
        0-59 -> F
        Resultado esperado: Calificación de Luis es igual a 100, equivalente en letra: A+
     */

    public static void Calificacion(int valor) {
        if (valor == 100) {
            System.out.println( "A+" );
        } else if (valor >= 90 && valor < 100) {
            System.out.println( "A" );
        } else if ( valor >= 80 && valor < 90) {
            System.out.println( "B" );
        } else if ( valor >= 70 && valor < 80) {
            System.out.println( "C" );
        } else if ( valor >= 60 && valor < 70) {
            System.out.println( "D" );
        } else {
            System.out.println( "F" );
        }
    }

    public static void PiramideImp(int pisos) {
        char espacio = ' ';
        char asterisco = '*';

        for (int i=1; i <= pisos; i++) {
            for (int espacios = pisos-i; espacios > 0; espacios--) {
                System.out.print(espacio);
            }
            for (int lineas = 1; lineas < 2*i; lineas++) {
                System.out.print(asterisco);
            }
            System.out.println("");
        }
    }

}
