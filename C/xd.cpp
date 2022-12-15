//Arreglos o Arrays son variables que permiten almacenar 
//muchos valores al mismo tiempo, relacionados a una sola variable
//se pueden almacenar en dimensiones (1 dimensi�n:vector, 2 dimensiones: tabla,
//3 dimensiones: cubo de datos, n dimensiones)
#include <stdio.h>
#include <locale.h>
int vector[10];
int cont,num;
int main (void){
	setlocale(LC_ALL,"");
	printf("Programa que almacena datos en un arreglo de 1 dimensi%cn.",162);
	printf("\n\nEn primer lugar vamos a almacenar los datos: ");
	for(cont=0;cont<10;cont++){
		printf("\nEscribe un n�mero para el vag�n %d: ",cont);
		scanf("%d",&vector[cont]);
	}
	printf("\n\nAhora vamos a mostrar los datos almacenados.");
	for(cont=0;cont<10;cont++){
		printf("\t%d",vector[cont]);
	}
	return 0;
}
