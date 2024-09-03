package exercices;

import java.util.Scanner;

public class Almacen {


    static Scanner sc = new Scanner(System.in);

    static int productId;
    static String productName;
    static int stock;
    static float profit;
    static double cost;
    static double price;
    static boolean available;


    public static void main(String[] args) {

        createProduct();

    }

    public static void createProduct() {

        String[] product = new String[7];

        System.out.println("Ingrese un ID de producto: ");
        productId = sc.nextInt();
        sc.nextLine();
        product[0] = Integer.toString(productId);
        System.out.println("Ingrese nombre de producto: ");
        productName = sc.nextLine();
        product[1] = productName;
        System.out.println("Ingrese stock: ");
        stock = sc.nextInt();
        sc.nextLine();
        product[2] = stock + ""; // otra manera de parsear
        System.out.println("Ingrese profit: ");
        profit = sc.nextFloat();
        sc.nextLine();
        product[3] = Float.toString(profit);
        System.out.println("Ingrese cost: ");
        cost = sc.nextDouble();
        sc.nextLine();
        product[4] = Double.toString(cost);
        System.out.println("Ingrese price: ");
        price = calculatePrice(cost, profit);
        sc.nextLine();
        product[5] = Double.toString(price);


        for(String item : product){
            System.out.println(item);
        }

    }

    public static double calculatePrice(double cost, float profit) {

        double price = cost / (1 - (profit / 100));

        return price;

    }



}
