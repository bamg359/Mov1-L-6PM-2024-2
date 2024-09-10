package EjemploProyectoIntegrador;

import java.util.Scanner;

public class SistemaNotas {

    //1. Registra un estudiante y almacenarlo en un repositorio
    //2. registra las notas del estudiante y almacenar en un repositorio
    //3. Calcula el promedio
    //4. Indica el desempeño del estudiante segun su promedio
    //5. Da recomendaciones según desempeño
    //6. Tiene un menu de opciones del estudiante
    //7. Permite el inicio de sesion

    // paso 1 . Declarar las variables que necesitamos

    static int idStudent;
    static String name;
    static String email;
    static String password;
    static String course;

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        createStudent();


    }// Este el fin del main

    // Paso 2 . Crear la funcion de registro

    public static void createStudent() {

        String[] student = new String[5];

        System.out.println("Id: ");
        idStudent = sc.nextInt();
        student[0] = String.valueOf(idStudent);
        System.out.println("Name: ");
        name = sc.next();
        student[1] = name;
        System.out.println("Email: ");
        email = sc.next();
        student[2] = email;
        System.out.println("Password: ");
        password = sc.next();
        student[3] = password;
        System.out.println("Course: ");
        course = sc.next();
        student[4] = course;

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }
    }




}// Este es el fin de la clase
