package notes;

public class WhileAcumulador {


    public static void main(String[] args) {

        // Sume los numeros del 1 al 10

        int i = 0;
        int sum = 0;

        while (i < 10) {

            sum += i; // suma = suma + i;

            System.out.println(sum);

            i++;

        }


    }

}
