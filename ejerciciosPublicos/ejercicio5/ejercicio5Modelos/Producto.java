package ejercicio5Modelos;

import java.time.LocalDateTime;

/*
 * Crea la clase Pizza con los atributos y métodos necesarios, teniendo en
cuenta que: 

Sobre cada pizza se necesita saber el tamaño- mediana o familiar - el tipo -
margarita, cuatro quesos o funghi - y su estado - pedida o servida.
La fecha y hora en la que fue servida, y en la que fue pedida.
La clase debe almacenar información sobre el número total de pizzas que se han pedido y que se han servido.
Siempre que se crea una pizza nueva, su estado es “pedida”.

Además, en la pizzería hacen Paninis.
Los Paninis tienen las mismas características que las pizzas, pero el tamaño en lugar de ser mediana o familiar, se describe como Almería,
Granada o Sevilla. Además, se debe indicar si el Panini es doble o simple. 
En este caso, también se tiene que llevar la cuenta de cuantos paninis se han pedido y se han servido.

Las pizzas y los paninis se servirán mediante un método llamado servir. 

Se desea saber, de cada pizza, el tiempo que ha transcurrido entre que fue pedida y ha sido servida.

En el programa principal se deben pedir 3 pizzas de distintos tipos (construir 3 pizzas),
luego crear dos paninis distintos entre sí, después se pasa a servir 2 de esas pizzas y 1
panini. Almacenar los paninis y las pizzas en una array.

Por último, debe mostrar un resumen de pizzas y paninis pedidos y servidos, recorriendo
la array.

Debido a que las pizzas y los paninis tienen algunas propiedades en común, pero
también algunas diferentes, se deberá crear una clase genérica de la que hereden Pizza
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
