package itt.clases;
//Importamos el paquete time.LocalDateTime para introducir este formato en una fecha
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*Esta será la clase hija Profesor que hereda de la clase Persona, esto se establece con
 * el extends.
 */
public class Profesor extends Persona{
	//Definimos y encapsulamos el atributo propio de la clase persona
	private String competencias;
	//Creamos el objeto de la clase LocalDateTime para cuando hacemos la clase ponerNotas()
	LocalDateTime fecha=LocalDateTime.now();
	DateTimeFormatter ISO = DateTimeFormatter.ISO_DATE; //Formateamos la forma de presentarlo a iso_data
	
	
	/*Implementamos el constructor de la clase, que como habiamos dicho, al heredar
	 * de la clase padre, tiene que pasarle minimo los mismos parametros que la padre y a 
	 * mayores los propios de la clase.
	 */
	
	public Profesor(String nif, String nombre, String direccion, String telefono,String competencias) {
		/*Con la palabra clave super, invocamos al constructor de la clase padre 
		 * con sus paremetros
		 */
		super(nif, nombre, direccion, telefono);
		this.competencias=competencias;
	}
	
	/*A continuacion creamos el metodo ponerNotas, como tenemos que pasarle el atributo
	 * nombre del profesor, tenemos que definirle mediante la palabra clave super
	 * ya que es un atributo heredado de la clase padre  y llamar
	 * al metodo dame_Nombre del objeto que llama al metodo ponerNotas, en este caso
	 * el objeto creado de la clase profesor.
	 */

	public String ponerNotas(){
		return "El profesor "+super.dame_Nombre()+ " va a corregir los exámenes hoy: "+fecha.format(ISO);
	}
	
	/*El siguiente metodo trabajar, es el metodo definido en la clase padre como abstracto
	 * por lo tanto aqui tiene que tener el mismo formato. La implementacion de este metodo
	 * es muy parecida al anterior descrito.
	 */
	public String trabajar() {
		return "El profesor " + super.dame_Nombre() +" va a  impartir su clase";
		
		
	}
	
	/*Y aqui implementamos el metodo toString que devolverá los datos del profesor. Estos
	 * serán los datos principales que son los heredaros de la clase persona mas los
	 * atributos propios de la clase
	 */

	public String toString() {
		return "Profesor"
				+ super.toString()+ " Competencias: "+this.competencias;
	}
	
	

}
