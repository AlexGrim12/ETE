#include<stdio.h>
float sem;
int main(void){
	printf("Programa que señalisa el semaforo");
	printf("\n\nEscribe un numero de 1 al 3 considerando 1.- Rojo, 2.-Amarillo y 3.-Verde: ");
	scanf("%f",&sem);
	if(sem==1){
		printf("Detente");
	}
	if(sem==2){
		printf("Alto preventivo");
	}
	if(sem==3){
		printf("Alto total");
	}
	return 0;
}
