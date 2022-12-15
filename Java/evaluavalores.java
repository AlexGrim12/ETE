package java;
import java.util.Scanner;
class evaluavalores{
	public static void main(String args[]){
		int num;
		Scanner guarda=new Scanner(System.in);
		System.out.println("Programa que solicita un n\u00famero entero del 0 al 9 e indica el nombre del n\u00famero.");
		System.out.println("\n\nEscribe un n\u00famero del 0 al 9: ");
		num=guarda.nextInt();
		switch(num){
			case 0:System.out.println("cero");break;
			case 1:System.out.println("uno");break;
			case 2:System.out.println("dos");break;
			case 3:System.out.println("tres");break;
			case 4:System.out.println("cuatro");break;
			case 5:System.out.println("cinco");break;
			case 6:System.out.println("seis");break;
			case 7:System.out.println("siete");break;
			case 8:System.out.println("ocho");break;
			case 9:System.out.println("nueve");break;
			default:System.out.println("Valor no v\u00e1lido");
		}
	}
}