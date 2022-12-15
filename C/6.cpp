#include<stdio.h>
float pr,cant,total,iva;
int main(void){
	printf("Programa que calcula el total a pagar con el precio y la cantidad.");
	printf("\n\nEscribe el precio del producto: $");
	scanf("%f",&pr);
	printf("\nEscribe la cantidad: ");
	scanf("%f",&cant);
	total=pr*cant;
	iva=total*1.16;
	printf("\nEl total a pagar (+iva) es: $%f",iva);
	return 0;
}
