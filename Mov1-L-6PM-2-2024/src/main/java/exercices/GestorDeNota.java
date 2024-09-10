package exercices;

import java.util.Scanner;

public class GestorDeNota {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] notas = new double [5];

        int i= 0;
        while(i< 5){

            System.out.println("Agregue la nota " + (i+1));
            notas[i] = sc.nextDouble();
            i++;
        }

        // Aplicacion del acumulador
        int j = 0;
        double sum = 0;

        while(j < notas.length){

            sum = sum + notas[j];

            j++;
        }

        double promedio = sum/ notas.length;
        System.out.println("El promedio de la nota es: " + promedio);
    }



}
