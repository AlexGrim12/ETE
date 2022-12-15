package java;

import java.util.Scanner;

public class DatosPersonales {
    public static void main(String args[]) {
        // programa que muestra los datos personales del aluno:
        // Nombre, No. Cuenta, Grupo, Fecha de Nacimiento.
        // Cada elemento a desplegar debe encontrarse con 2 renglones de espacio.
        String nombre, nocta, gpo, fechanac;
        Scanner guarda = new Scanner(System.in);
        System.out.printf("Escribe tu nombre: ");
        nombre = guarda.nextLine();
        System.out.printf("\nEscribe tu N%cmero de cuenta: ", 163);
        nocta = guarda.nextLine();
        System.out.printf("\nEscribe tu Grupo: ");
        gpo = guarda.nextLine();
        System.out.printf("\nEscribe tu Fecha de nacimiento: ");
        fechanac = guarda.nextLine();
        System.out.printf("\n\n\nLos datos ingresados son: ");
        System.out.printf("\n\nNombre: %s", nombre);
        System.out.printf("\n\nN%cmero de cuenta: %s", 163, nocta);
        System.out.printf("\n\nGrupo: %s\n\n", gpo);
        System.out.println("Fecha de Nacimiento: " + fechanac);
    }
}
