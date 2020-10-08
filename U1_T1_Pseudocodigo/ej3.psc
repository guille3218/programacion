Algoritmo ej3
	
	//EJERCICIO 3 (ej3.psc)
	
	//Nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario la altura, que debe ser un número entero impar mayor o igual que 5. Si el número introducido no es correcto, el programa deberá mostrar un mensaje de error y volver a solicitarlo. A continuación se muestran algunos ejemplos.
		
	//	La anchura de la figura siempre será de 6 caracteres.
		
	//Ejemplo 1:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 8
	//	La altura introducida no es correcta
		
	//Ejemplo 2:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 3
	//	La altura introducida no es correcta
		
	//Ejemplo 3:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 7
	//	MMMMMM
	//	M    M
	//	M    M
	//	MMMMMM
	//	M    M
	//	M    M
	//	MMMMMM

	
	Definir alt,f Como Entero
	
	Repetir
		Escribir "Introduce la altura. Mayor o igual que 5 e impar"
		Leer alt
		
	Hasta Que alt>=5 Y alt%2=1
	
	Para f<-0 Hasta alt-1 Hacer
		si	f=0 O f=trunc(alt/2) O f=alt-1 Entonces
			Escribir "MMMMMM"
		SiNo
			Escribir "M    M"
		FinSi
	Fin Para
	
FinAlgoritmo
