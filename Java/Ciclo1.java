package java;

import java.util.Scanner;

import javax.print.event.PrintJobListener;

class Ciclo1 {
	public static void main(String args[]) {
		Scanner guarda = new Scanner(System.in);
		int num, mult, cont, opcion = 1;
		System.out.println("Programa que muestra la tabla de multiplicar de cualquier n\u00famero entero");
		while (opcion == 1) {
			// identación
			System.out.println("\n\nEscribe el n\u00famero de la tabla de multiplicar que deseas: ");
			num = guarda.nextInt();
			// for(inicialización de la variable;condición o límite;incremento o drecemento)
			for (cont = 1; cont <= 10; cont++) {
				mult = num * cont;
				System.out.println(num + " x " + cont + " = " + mult);
			}
			System.out.println("\n\nDeseas visualizar otra tabla de multiplicar? Si=1, No=0: ");
			opcion = guarda.nextInt();
		}
	}
}