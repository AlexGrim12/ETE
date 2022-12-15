#include<stdio.h>
#include<conio.h>
char tecla;
int main(void){
	while((tecla=getch())!=27)//get character -> Obtener un caracter
	{
		printf("%d\n",tecla);		
	}
}
