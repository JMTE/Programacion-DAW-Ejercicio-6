package itt.clases;
/*Esta será la clase padre, en este caso es una clase abstracta porque no se va a 
 * contruir ningun objeto de ella, es decir, no se va a instanciar.
 * Las clases que hereden de una clase abstracta, heredan todos sus metodos. 
 * La clase abstracta debe contener al menos, un metodo abstracto.
 */
public abstract class Persona {
	/*Declaramos y encapsulamos los atributos de la clase persona, estos atributos
	 * los heredarán las clases hijas.
	 */
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	/*Definimos el contructor con el paso de los atributos necesarios, al definir
	 * de esta manera el contructor en la clase padre abstracta con paso de parametros,
	 * obligamos a que las clases que hereden de el, que tambien sean necesarios este 
	 * paso de parametros para definir sus constructores*/
	public Persona(String nif, String nombre, String direccion,String telefono){
		//La palabra clave this. hace referencia al objeto actual.
		this.nif=nif;
		this.nombre=nombre;
		this.direccion=direccion;
		this.telefono=telefono;
		
	}
	/*A continuacion definimos los métodos SETTER y GETTER para que los atributos sean 
	 * accesibles desde otras clases. En nuestro ejercicio no los utilizaremos todos.
	 */
	public void cambia_Dni(String nif){ //SETTER
		this.nif=nif;
	}
	public String dame_Nif(){//GETTER
		return this.nif;
	}
	public void cambia_Nombre(String nombre){//SETTER
		this.nombre=nombre;
	}
	public String dame_Nombre(){//GETTER
		return this.nombre;
	}
	public void cambia_Direccion(String direccion){//SETTER
		this.direccion=direccion;
	}
	public String dame_Direccion(){//GETTER
		return this.direccion;
	}
	public void cambia_Telefono(String telefono){//SETTER
		this.telefono=telefono;
	}
	public String dame_Telefono(){//GETTER
		return this.telefono;
	}
	
	/*A continuación definimos el metodo llamar. Cuando utilicemos este metodo desde
	 * la clase principal, el objeto que invoca al metodo es el objeto que realiza la 
	 * llamada en este caso, la persona que lo recibe, es el objeto que le pasamos 
	 * por parametro cuando invocamos al metodo.
	 *  
	 */
	
	public String llamar (Persona p){
		return this.nombre + " llamando a " + p.dame_Nombre() ;
	}
	/* A continuacion definimos nuestro metodo abstracto, un método abstracto es un método 
	 * declarado pero no implementado, es decir, es un método del que solo se escribe su 
	 * nombre, parámetros y tipo devuelto pero no su código. Los métodos abstractos se 
	 * escriben sin llaves {} y con ; al final de la declaración. Al incluir el método 
	 * abstracto en la clase padre se obliga a que todas las clases hijas lo 
	 * sobrescriban con el mismo formato utilizado en la declaración.
	 */
	abstract public String trabajar();
	
	
	/*Y ahora implementamos el metodo toString (con la ayuda de Eclipse), el metodo 
	 * toString nos permite mostrar la información completa de un objeto, es decir,
	 *  el valor de sus atributos.
	 */
	public String toString() {
		return "[nif=" + nif + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}
	
	

	
	
	
}
