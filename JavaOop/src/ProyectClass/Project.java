package ProyectClass;

public class Project {
	
	private String nombre;
	private String descripcion;
	
	//GETTER Y SETTERS
	//SETTER NOMBRE
	public void setNombre(String name){
		name = nombre;
	}
	
	//GETTER NOMBRE
	public String getNombre() {
		return nombre;	
	}
	
	//SETTER DESCRIPCIOJN
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//GETTER DESCRIPCION
	public String getDescripcion() {
		return descripcion;
	}
	
	
	
	//METODOS CONSTRUCTOR Y SOBRECARGA
	public Project() { }
	
	public Project(String name) { 
		name = nombre;	
	}
	
	public Project (String name, String description ) {	
		name = nombre;
		description = descripcion;
	}
	
	//INSTANCIAR METODOS
	
	public void elevatorPitch(String name, String description) {
		System.out.println(name + ": " + description);
	}
	
}
