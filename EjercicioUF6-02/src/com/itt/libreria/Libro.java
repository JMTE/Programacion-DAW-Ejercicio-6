package com.itt.libreria;
/*Aqui creamos la clase contenedor Libro , estamos ante una composicion debil, 
 * ya que la destruccion de este contenedor no supone la destruccion del objeto contenido
 * 
 */
public class Libro {
	//Definimos los atributos propios de esta clase y los encapsulamos
	private String titulo;
	private String genero;
	private Autor autor;
	/*Creamos el constructor que tiene por paso de parametros dos string y el objeto autor.
	 * 
	 */
	public Libro(String titulo, String genero, Autor autor){
		/*A continuacion con la palabra clave this. establecemos que el atributo del objeto
		actual es igual al atributo pasado por parametro.*/ 
		this.autor=autor;
		
		this.titulo=titulo;
		this.genero=genero;
		}
	//A continuacion establecemos los metodos SETTER Y GETTER propios de la clase libro	para sus atributos

	public void cambia_Titulo(String titulo){//SETTER
		this.titulo=titulo;
	}
	public String dame_Titulo(){//GETTER
		return this.titulo;
	}
	public void modifica_Genero(String genero){//SETTER
		this.genero=genero;
		
	}
	public String dame_Genero(){//GETTER
		return this.genero;
	}
	public void cambia_Autor(Autor autor){//SETTER
		this.autor=autor;
	}
	public Autor dame_Autor(){//GETTER
		return this.autor;
	}
	
	/*Y ahora implementamos el metodo toString (con la ayuda de Eclipse), el metodo 
	 * toString nos permite mostrar la información completa de un objeto, es decir,
	 *  el valor de sus atributos. En este caso, le sumamos que herede la informacion
	 *  que nos da el metodo toString para la clase autor.
	 */
	public String toString() {
		return "Libro [Titulo=" + this.titulo +"]\n" + "      [Género= "+this.genero+ "]\n"+ this.autor.toString();
	}
	
	

}
