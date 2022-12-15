//Arreglos o Arrays son variables que permiten almacenar 
//muchos valores al mismo tiempo, relacionados a una sola variable
//se pueden almacenar en dimensiones (1 dimensión:vector, 2 dimensiones: tabla,
//3 dimensiones: cubo de datos, n dimensiones)
#include <stdio.h>
#include <locale.h>
int matrix[5][5];
int rgl,colm;
int main (void){
	setlocale(LC_ALL,"");
	printf("Programa que almacena datos en un arreglo de 2 dimensiones.");
	printf("\n\nEn primer lugar vamos a almacenar los datos: ");
	for(rgl=0;rgl<5;rgl++){
	
		for(colm=0;colm<5;colm++)
		{
			printf("\nEscribe un número para el celda %d,%d: ",rgl,colm);
			scanf("%d",&matrix[rgl][colm]);
		}
	}
	printf("\n\nAhora vamos a mostrar los datos almacenados en el arreglo:\n");
	for(rgl=0;rgl<5;rgl++)
	{
		for(colm=0;colm<5;colm++)
		{
		
printf("%d,%d:%d\t",rgl,colm,matrix[rgl][colm]);
		}
		printf ("\n");
	}
	
}
