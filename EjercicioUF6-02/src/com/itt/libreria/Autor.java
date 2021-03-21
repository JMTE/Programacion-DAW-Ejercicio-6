package com.itt.libreria;

/*Estamos hablando de una interrelacion de composicion. La clase Autor 
 * sera un componente de la clase Libro
 * 
 */
public  class Autor {
	//Definimos los atributos y los encapsulamos para que no puedan ser modificados desde fuera de la clase
private String nombre;
private String biografia;
	//Creamos el contructor con parametros 
	public Autor(String nombre, String biografia){
		/*Con la palabra reservada this. hacemos referencia al objeto actual y decimos
		que esos atributos son iguales a los que pasamos por parametros en el constructor.*/
		this.nombre=nombre;
		this.biografia=biografia;
		
		
	}
/*A Continuacion definimos los metodos SETTER Y GETTER que aunque no nos harán falta 
 * todos en nuestro ejercicio, los dejamos definidos por si en algún momento hay que 
 * utilizarlos
 */
public void cambia_Nombre(String nombre){//SETTER
	this.nombre=nombre;
}
public String dame_Nombre(){//GETTER
	return this.nombre;
}
public void cambia_biografia(String biografia){//SETTER
	this.biografia=biografia;
}
public String dame_Biografia(){//GETTER
	return this.biografia;
}

/*Y ahora implementamos el metodo toString (con la ayuda de Eclipse), el metodo 
 * toString nos permite mostrar la información completa de un objeto, es decir,
 *  el valor de sus atributos.
 */
public String toString() {
	return "Autor  [Nombre=" + this.nombre +" ]\n      [Biografia=" + this.biografia + "]";
}



}
