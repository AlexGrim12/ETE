#include<stdio.h>
float pr,cant,total;
int main(void){
	printf("Programa que calcula el total a pagar con el precio y la cantidad.");
	printf("\n\nEscribe el precio del producto: $");
	scanf("%f",&pr);
	printf("\nEscribe la cantidad: ");
	scanf("%f",&cant);
	total=pr*cant;
	printf("\nEl total a pagar es: $%f",total);
	return 0;
}
