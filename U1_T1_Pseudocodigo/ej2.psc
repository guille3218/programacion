Algoritmo ej2
	
	//EJERCICIO 2 (ej2.psc) Escribe un programa que si le pasamos un entero nos devuelva ese entero al revés
		
	//Ejemplo:
		
	//Por favor, introduzca un número entero positivo: 123456
	//	El número resultante es 654321
		
	//NOTA: No se pueden utilizar funciones de texto de PseInt.
	
	
	Definir x,n,g Como Entero
	
	Escribir "Por favor, introduzca un número entero positivo:"
	leer x
	
	i=0
	n=x
	
	Mientras n > 0 Hacer
		i = i*10 + n mod(10)
		n= (n-n mod(10))/10
	FinMientras
	
	Escribir "El número resultante es " , i
	
FinAlgoritmo
