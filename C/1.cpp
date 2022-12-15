#include<stdio.h>
int a,b;
int main(void){
	printf("Programa que indica que valor numerico entero es mayor.");
	printf("\n\nPrimer numero: ");
	scanf("%d",&a);
	printf("Segundo numero: ");
	scanf("%d",&b);
	if(a>b){
		printf("El valor %d es mayor que %d.",a,b);
	}
	else {
		printf("El valor %d es mayor que %d.",b,a);
	}
	return 0;
}
