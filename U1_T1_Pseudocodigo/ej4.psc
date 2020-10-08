Algoritmo ej4
	//EJERCICIO 4 (ej4.psc)
	
	//Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número primo.
	//Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
		
	//Ejemplo:
	//	Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:
	//		6
	//		8
	//		15
	//		12
	//		23
	//		Ha introducido 4 números no primos.
	//	Máximo: 15
	//	Mínimo: 6
	//Media: 10.25
	
	Definir x, vuelta, max, min, sum, rest, contador Como Entero
	Definir media Como Real
	
	rest=0
	contador = 0
	max=0
	min=999999999
	
	Escribir "Por favor, vaya introduciendo números enteros positivos. Para terminar introduzca un número primo."
	
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
	
	
	escribir "Máximo:" , max
	escribir "Mínimo: " , min
	escribir "Media:" , media
	
FinAlgoritmo
