package java;

import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        Scanner guarda = new Scanner(System.in);
        int opcion;
        Double a, b, h;
        System.out.println("Programa que muestra el funcionamiento del teorema de Pitagoras");
        ;
        while (opcion == 1) {
            System.out.println("Escriba el valor de la variable a: ");
            a = guarda.nextDouble();
            System.out.println("Escriba el valor de la variable b: ");
            b = guarda.nextDouble();
            h = Math.sqrt(a * a + b * b);
            System.out.println("\nEl valor de la hipotenusa es: " + h);
            System.out.println("\n\nDeseas visualizar otra tabla de multiplicar? Si=1, No=0: ");
            opcion = guarda.nextInt();
        }
    }
}
