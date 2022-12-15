#include<stdio.h>
float m,ml,pu,pi;
int main(void){
	printf("Programa que hace converciones de medidas");
	printf("\n\nEscribe el valor que deseas convertir en metros: ");
	scanf("%f",&m);
	ml=m*0.000621371;
	pu=m*39.3701;
	pi=m*3.28084;
	printf("\nMetros a millas equivale a: %f",ml);
	printf("\nMetros a pulgadas equivale a: %f",pu);
	printf("\nMetros a pies equivale a :%f",pi);
	return 0;
}
