Algoritmo ej4
	//EJERCICIO 4 (ej4.psc)
	
	//Realiza un programa que calcule el m�ximo, el m�nimo y la media de una serie de n�meros enteros positivos introducidos por teclado. El programa terminar� cuando el usuario introduzca un n�mero primo.
	//Este �ltimo n�mero no se tendr� en cuenta en los c�lculos. El programa debe indicar tambi�n cu�ntos n�meros ha introducido el usuario (sin contar el primo que sirve para salir).
		
	//Ejemplo:
	//	Por favor, vaya introduciendo n�meros enteros positivos. Para terminar, introduzca un n�mero primo:
	//		6
	//		8
	//		15
	//		12
	//		23
	//		Ha introducido 4 n�meros no primos.
	//	M�ximo: 15
	//	M�nimo: 6
	//Media: 10.25
	
	Definir x, vuelta, max, min, sum, rest, contador Como Entero
	Definir media Como Real
	
	rest=0
	contador = 0
	max=0
	min=999999999
	
	Escribir "Por favor, vaya introduciendo n�meros enteros positivos. Para terminar introduzca un n�mero primo."
	
	Repetir
		
		leer x
		
		vuelta=0
		
		Para i<-1 Hasta x Hacer
			si x%i=0 Entonces
				vuelta=vuelta+1
			FinSi
		Fin Para
		
		si vuelta!=2 Entonces
			
			si max>x Entonces
				max=max
			SiNo
				max=x
			FinSi
			
			si min<x Entonces
				min=min
			SiNo
				min=x
			FinSi
			
			sum= rest+x
			rest=sum
			contador=contador+1
			
			
		FinSi
		
		media=rest/contador
		
	Hasta Que vuelta=2
	
	
	escribir "M�ximo:" , max
	escribir "M�nimo: " , min
	escribir "Media:" , media
	
FinAlgoritmo
