package notes;

public class While {


    public static void main(String[] args) {
        // imprimir numeros del 0 al 100 de dos en dos

        // vamos a crear un contador

        int num = 0;

        while (num <= 100){

            if(num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }
    }

}
