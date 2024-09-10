package notes;

import java.util.Scanner;

public class Matriz {

    static Scanner sc =  new Scanner(System.in);
    static int j = 0;
    static double notasEst[][] = new double[3][3];

    public static void main(String[] args) {

        createVector();
        createVector();
        createVector();
        printNotasStudents();




    }

    static public void createVector(){

        double [] notas = new double [3];

        int i= 0;
        while(i< notas.length){

            System.out.println("Agregue la nota " + (i+1));
            notas[i] = sc.nextDouble();
            i++;


        }

        notasEst[j] = notas;
        j++;
    }

    static public void printNotasStudents(){

        for(int j = 0; j< notasEst.length; j++){
            for(int k = 0; k< notasEst[j].length; k++){
                System.out.print(notasEst[j][k] + " ");
            }
            System.out.println();
        }


    }
}
