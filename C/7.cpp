#include<stdio.h>
float num,fac=1,a;
int main(void){
	printf("Programa que te da el factorial de un numero.");
	printf("\n\nEscribe el numero del que deseas saber su factorial: ");
	scanf("%f",&num);
	for(a=1;a<=num;a++){
	fac=fac*a;
	}
	printf("\n%f",fac);
	return 0;
}
