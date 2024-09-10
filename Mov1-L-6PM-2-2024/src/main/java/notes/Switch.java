package notes;

import java.util.Scanner;

public class Switch {


    // Si la nota promedio es menor a 2 => no HAbilitable
    // Si la nota promedio > = 2 y < 3 => Habilitable
    // si nota promedio >= 3 y < 4 , desempeño normal
    // si nota promedio >= 4 y < 4.5 desempeño sobresaliente
    // Si nota promedio es > 4.5 desempeño superior

    // Defina 1. no habilitable , 2. Habilitable , 3. Normal , 4. sobresaliete , 5. superior

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el promedio: ");
        double promedio = sc.nextDouble();

        if(promedio >= 0 && promedio < 2) {
            System.out.println("Usted no habilita seleccione la opcion 1 para mas información");
        }else if(promedio >= 2 && promedio < 3) {
            System.out.println("Usted tiene derecho a habilitar  seleccione la opcion 2");
        }else if(promedio >= 3 && promedio < 4) {
            System.out.println("Su desempeño es normal, seleccione 3");
        }else if(promedio >= 4 && promedio < 4.5) {
            System.out.println("Su desempeño es sobresaliente, seleccione 4");
        }else if(promedio >= 4.5 && promedio <= 5) {
            System.out.println("Su desempeño es superior, seleccione 5");
        }else{
            System.out.println("Ingrese un promedio entre 0 y 5");
        }

        System.out.println("Seleccione: 1. NH 2. H 3 . Normal 4. Sobresaliente 5. Superior");

        int opc = sc.nextInt();

        switch(opc) {

            case 1:
                System.out.println("Razones por la que no habilita: ");
                break;
            case 2:
                System.out.println("Siga las instrucciones para su habilitación");
                break;
            case 3:
                System.out.println("Recomendaciones para mejorar su promedio");
                break;
            case 4:
                System.out.println("Mejores habitos para seguir mejorando");
                break;
            case 5:
                System.out.println("Habitos efectivos para personas con alto desempeño");
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }





    }





}
