//Importamos los paquetes de las clases Autor y Libro
import com.itt.libreria.Autor;
import com.itt.libreria.Libro;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Creamos las nuevas referencias a objetos de la clase Autor y Libro mediante los
		 * constructores que fueron definidos en sus clases, por lo tanto
		 * pasando los parametros correspondientes
		 */
		Autor autor1 = new Autor(
				"John Ronald Reuel Tolkien",
				"(Bloemfontein, Sudáfrica, 1892 - Bournemouth, Reino Unido, 1973)\n      Escritor británico de origen sudafricano mundialmente conocido como autor\n      de El señor de los anillos (1954-1955), un verdadero clásico de la literatura \n      fantástica. Aunque el autor ya era sobradamente conocido, en fechas recientes\n      su obra ha alcanzado una difusión todavía mayor gracias a las adaptaciones \n      cinematográficas de Peter Jackson.");
		
		Libro libro1 = new Libro("El hobbit", "aventuras", autor1);
		
		/*Llamamos al metodo toString de la clase Libro para sacar los datos de la referecia
		al objeto creado de libro*/
		System.out.println("------------------------------------------------------------------------------\n");
		System.out.println(libro1.toString() + "\n");
		
		/*Utilizamos el metodo cambia_biografia() desde la referencia al objeto creado de la clase Libro
		 * Para ello tenemos que entrar en la clase componente mediante el getter que habiamos
		 * creado para devolver nuestro autor
		 */
		System.out.println("------------------------------------------------------------------------------\n");
		libro1.dame_Autor().cambia_biografia("Escritor y lingüista británico, Tolkien es conocido principalmente\n"
				+ " por su trilogía de El señor de los anillos, obra de fantasía"
				+ " considerada como todo\n un clásico de la literatura universal "
				+ "y que comparte escenario con otra de sus\n grandes novelas, "
				+ "El hobbit.");
		
		/*Ahora se nos pide sacar los datos del objeto autor de dos maneras, desde el
		 * objeto Autor y desde el objeto libro.
		 * Para la primera forma, al haber creado una referencia al objeto Autor, solamentente
		 * debemos llamar a su metodo toString directamente desde esta.
		 * La otra forma, es desde la referencia creada del objeto contenedor, entonces
		 * debemos primero utilizar el metodo getter para llamar al autor y despues su toString
		 * para ver sus atributos
		 */
		
		
		
		System.out.println(autor1.toString());
		
		System.out.println(libro1.dame_Autor().toString());

		

		System.out.println();
		System.out.println("------------------------------------------------------------------------------\n");
		/*A continuacion modificamos el valor del atributo genero desde el metodo setter
		 * modifica_Genero mediante la referencia libro1 del objeto libro creado y mostramos esa modificacion
		 * con el metodo ToString por pantalla
		 */
		libro1.modifica_Genero("Fantasia");
		System.out.println(libro1.toString());
		
		
		
	}

}
