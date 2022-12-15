import java.util.Scanner;
class SaludoConIngreso{
	public static void main(String args[] ){
		int num;
		Scanner objIngresa = new Scanner(System.in);
		System.out.println("Escribe tu año de nacimiento:");
		num=objIngresa.nextInt();
		System.out.printf("Hola mundo %d", num);
	}
}