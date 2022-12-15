#include<stdio.h>
float calif;
int main(void){
	printf("Programa que menciona si la calificacion es aprobatoria o reprobatoria");
	printf("\n\nEscribe tu calificacion abarcando del 0 al 10: ");
	scanf("%f",&calif);
	if(calif>10.1){
		printf("Calificacion no valida");
	}
	if(calif<10.1,calif>6.00,calif==6){
		printf("APROBASTE!! FELICIDADES!!");
	}
	if(calif<6.00){
		printf("Suerte para la proxima... ;)");
	}
	return 0;
}
