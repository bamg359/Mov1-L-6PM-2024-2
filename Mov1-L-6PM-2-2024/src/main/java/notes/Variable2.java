package notes;

public class Variable2 {


    public static void main(String[] args) {

        // Casting de variables

        byte measure = 127;

        short measure2 = measure;


        double weight = 120000.12;

        int weigthInt = (int) weight;

        // Parseo de variables

        String numTotal = "700";

        int totalNum = Integer.parseInt(numTotal);

        int suma = totalNum + 300;

        System.out.println(suma);

        // De entero a String

        String sumaString = Integer.toString(suma);

        String sumaString2 = suma + "";




    }


}
