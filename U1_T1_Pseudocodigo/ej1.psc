Algoritmo ej1
	
	//EJERCICIO 1 (ej1.psc)
	
	//Escribe un algoritmo que calcule el precio de un pedido de cierto producto la cantidad de producto que solicita el cliente. Para aclararlo, el precio de cada unidad depende de la cantidad de
			
	//		-> Las 100 primera unidades del pedido van a precio fijo. Siempre costarán 5.23€ cada una
			
	//		-> Las unidades entre la 101 y la 1000 (ambas incluidas) costarán 4.16€ cada una
			
	//		-> A partir de esa cantidad el precio será el 50% del precio original.
			
	//	Por ejemplo:
			
	//	Introduzca la cantidad de unidades: 90
	//	El precio del pedido es: 470.70€
			
	//	Introduzca la cantidad de unidades: 150
	//	El precio del pedido es: 731€

	
	Definir u Como Entero
	
	Escribir "Introduce el número de unidades"
	Leer u
	
	Si u<=100 Entonces
		Escribir "El precio es de " , (u*5.23) , "€"
	SiNo
		si u<=1000 Entonces
			Escribir "El precio es de " , 523+((u-100)*4.16) , "€"	
		SiNo
			Escribir "El precio es de " , (523+((u-100)*4.16))+((u-1000)*(5.23/2)) , "€"
		FinSi
		
	FinSi
	
	
FinAlgoritmo
