package itt.clases;
/*Esta clase es muy similar a la clase profesor y allí ya explico todos los pasos.
 * La implementacion de los metodos es muy similar.
 */
public class Alumno extends Persona{
	private String curso;
	public Alumno(String nif, String nombre, String direccion, String telefono,String curso) {
		
		super(nif, nombre, direccion, telefono);
		this.curso=curso;
	}
	
	
	public String hacer_Examen(){
		return "El alumno " +super.dame_Nombre()+ " va a hacer el examen e intentar aprobarlo.";
	}

	public String trabajar() {
		return "El alumno " + super.dame_Nombre() +" va a estudiar  "+this.curso;
		
	}
	public String toString() {
		return "Alumno"
				+ super.toString()+" Cursando: "+this.curso;
	}
	

}
