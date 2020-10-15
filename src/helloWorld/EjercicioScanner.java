package helloWorld;

import java.util.Scanner;

public class EjercicioScanner {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();


        System.out.println("Hola " + nombre + " tu edad es " + edad);
    }
}
