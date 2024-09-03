package notes;

import java.util.Scanner;

public class Operator {

    static Scanner sc = new Scanner(System.in);

    static int num1, num2,num3,num4;


    public static void main(String[] args) {
        num1 = 24;
        num2 = 19;

        System.out.println("Ingrese el tercer numero");
        num3 = sc.nextInt();
        System.out.println("Ingrese el Cuarto numero");
        num4 = sc.nextInt();


        int sum = num1 + num2;
        System.out.println("El resultado de la suma es: " + sum);

        int rest = num1 - num2;
        System.out.println("El resultado de la resta es " + rest);

        int div = num3 / num4;
        System.out.println("El resultado de la division es: " + div);

        int mult = num3 * num4;
        System.out.println("El resultado de la multiplicación es: " + mult);

        int modulo = num3 % num4;
        System.out.println("El resultado de modulo es: " + modulo);
    }




}
