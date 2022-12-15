#include <stdio.h>
#include <stdlib.h>
	FILE *archivo; //punteros o apuntadores
	char letra;
int main(void)
{
	archivo = fopen("prueba.txt","r+");//r,r+: lectura,w,w+: escritura,a,a+: añadir
	if (archivo == NULL) {
		printf( "No se puede abrir el archivo.\n" );
		exit( 1 );//finalizar la ejecución del programa
	}

	printf( "Contenido del archivo:\n" );
	letra = getc(archivo);//getc ->obtener caracter del archivo
	while (feof(archivo) == 0) { //feof -> file end of file
		printf( "%c",letra );
		letra = getc(archivo);
	}

	if (fclose(archivo)!= 0)  //fclose -> cierra el archivo , != diferente de
	{
		printf( "Problemas al cerrar el archivo\n" );
	}
}
