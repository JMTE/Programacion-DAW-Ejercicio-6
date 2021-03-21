
/*Importamos los paquetes de las clases de las cuales vamos a crear objetos. Como la clase persona es 
 * abstracta y por lo tanto no se va a crear un objeto de ella, no se importa.
 */
import itt.clases.Administrativo;
import itt.clases.Alumno;
import itt.clases.Profesor;



public class Principal {

	public static void main(String[] args) {
		/*Creamos los objetos de las clases Profesor, Alumno y Administrativo, pasandole
		los parametros establecidos en el constructor de cada uno.*/
		Alumno alum=new Alumno("53162796K","Jose Maria Tenreiro","C/Magdalena","+348784738370","1ºDaw");
		Profesor profe=new Profesor("32783886K","Leonardo da Vinci","Via Tornabuoni ","+34637328999","Pintura y Arquitectura ");
		Administrativo admin=new Administrativo("78474747V","Martin Scorsese","C/Hall of Fame","+3442374870","hacer calendarios,colgar carteles y enviar cartas");
		
		/*A continuacion, hacemos los puntos que se piden en el enunciado, primero sacar
		 * la informacion por pantalla de todos los objetos Profesor, Alumno y Administrativo
		 * ademas de utilizar el metodo creado trabajar() para cada uno.
		 */
		System.out.println(profe.toString()+"\n"+profe.trabajar()+"\n");
		
		System.out.println(alum.toString()+"\n"+alum.trabajar()+"\n");
		
		System.out.println(admin.toString()+"\n"+admin.trabajar()+"\n");
		
		/*En la siguiente linea utilizamos el metodo llamar para el objeto creado
		 * de la clase alumno y le pasamos por parametro al objeto creado de la clase
		 * profesor
		 */
		
		System.out.println(alum.llamar(profe)+"\n");
		
		//Y a continuacion utilizamos el metodo propio de cada clase con su objeto correspoendiente.
		
		System.out.println(profe.ponerNotas());
		
		System.out.println(alum.hacer_Examen());
		
		System.out.println(admin.gestionarMatricula());
		
	}

}
