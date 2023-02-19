package ejercicio5Modelos;

import java.time.LocalDateTime;

/*
 * Crea la clase Pizza con los atributos y m�todos necesarios, teniendo en
cuenta que: 

Sobre cada pizza se necesita saber el tama�o- mediana o familiar - el tipo -
margarita, cuatro quesos o funghi - y su estado - pedida o servida.
La fecha y hora en la que fue servida, y en la que fue pedida.
La clase debe almacenar informaci�n sobre el n�mero total de pizzas que se han pedido y que se han servido.
Siempre que se crea una pizza nueva, su estado es �pedida�.

Adem�s, en la pizzer�a hacen Paninis.
Los Paninis tienen las mismas caracter�sticas que las pizzas, pero el tama�o en lugar de ser mediana o familiar, se describe como Almer�a,
Granada o Sevilla. Adem�s, se debe indicar si el Panini es doble o simple. 
En este caso, tambi�n se tiene que llevar la cuenta de cuantos paninis se han pedido y se han servido.

Las pizzas y los paninis se servir�n mediante un m�todo llamado servir. 

Se desea saber, de cada pizza, el tiempo que ha transcurrido entre que fue pedida y ha sido servida.

En el programa principal se deben pedir 3 pizzas de distintos tipos (construir 3 pizzas),
luego crear dos paninis distintos entre s�, despu�s se pasa a servir 2 de esas pizzas y 1
panini. Almacenar los paninis y las pizzas en una array.

Por �ltimo, debe mostrar un resumen de pizzas y paninis pedidos y servidos, recorriendo
la array.

Debido a que las pizzas y los paninis tienen algunas propiedades en com�n, pero
tambi�n algunas diferentes, se deber� crear una clase gen�rica de la que hereden Pizza
y Panini.*/

public abstract class Producto {
	
 
 protected double precio;
 protected boolean pedida;
 protected boolean servida;
 protected LocalDateTime hora_Fecha_Pedida;
 protected LocalDateTime hora_Fecha_Servida;
 
 
 public Producto() { 
	
}



 
 
}
