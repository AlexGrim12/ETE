package java;
import java.util.Scanner;
class positivoNegativo{
    public static void main(String args[]) {
        int numero;
        Scanner almacena=new Scanner(System.in);
        System.out.println("Programa que solicita un numero e indica su es positivo o no");
        System.out.println("\n\nEscribe in numero entero: ");
        numero=almacena.nextInt();
        if(numero>0){
            //Bloque instrucciones verdadera
            System.out.println("\n\nEl numero ("+numero+") es positivo");
            }   
            if(numero==0){
                System.out.println("\n\nEl numero ("+numero+") es neutro");
            }
        else{
            // Bloque instrucciones falsa
            System.out.println("\n\nEl numero ("+numero+") es negativo");
        }
    }
}