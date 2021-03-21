package itt.clases;
/*Esta clase es muy similar a la clase profesor y allí ya explico todos los pasos.
 * La implementacion de los metodos es muy similar.
 */
public class Administrativo extends Persona {
	private String tareas;

	public Administrativo(String nif, String nombre, String direccion,
			String telefono,String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas=tareas;
	}
	

	public String trabajar() {
		
			return "El administrativo " + super.dame_Nombre() +" tiene que hacer estas tareas: "+this.tareas;
		
	}
	
	public String gestionarMatricula(){
		return "El administrativo " +super.dame_Nombre()+" va a gestionar una matricula.";
		
	}
	public String toString() {
		return "Administrativo"
				+ super.toString()+ "Tareas: "+this.tareas;
	}

}
