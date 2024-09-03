package notes;

import java.util.Scanner;

public class Operator2 {


    static Scanner sc = new Scanner(System.in);

    static int num1, num2,num3,num4;


    public static void main(String[] args) {

        // Operadores de comparación <, >, <= , >= , == , != siempre devuelven boolean

        System.out.println("Ingrese el numero 1");
        num2 = sc.nextInt();
        System.out.println("Ingrese el numero 2");
        num3 = sc.nextInt();

        boolean num2GreatestThanNum3 = num2 > num3;

        System.out.println("Num 2 es mayor que num3 es: " + num2GreatestThanNum3 );


        // Operadores Logicos && , || , NOT - validan dos comparaciones

        int boxCombination1 = 9;
        int boxCombination2 =  13;
        int boxCombination3 = 25;

        System.out.println("Ingrese los numeros de la combinación");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        boolean openBox = input1 == boxCombination1 && input2 == boxCombination2 && input3 == boxCombination3;

        System.out.println("Abrir caja = " + openBox);

        System.out.println("Seleccione un horario");
        String schedule1 = "9am";
        String schedule2 = "1pm";
        System.out.println("Ingrese el horario al que asiste:");
        String present = sc.next();
        boolean attendant = schedule1.equals(present) || schedule2.equals(present);
        System.out.println("La persona asistio?? : " + attendant);




    }






}
