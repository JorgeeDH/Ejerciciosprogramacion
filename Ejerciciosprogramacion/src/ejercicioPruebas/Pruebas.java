package ejercicioPruebas;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1= new Empleados("Gregoria");
		Empleados trabajador2= new Empleados("Rogelia");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		
		trabajador1.cambiaseccion("Recursos humanos");

	}

}
class Empleados{
	
	private final String nombre;
	private String seccion;
	
	public Empleados(String nom) {
		nombre=nom;
		seccion ="administracion";
		
	}

	

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public void cambiaseccion(String seccion) {
		this.seccion= seccion;
		
	}
	public String devuelveDatos() {
		return "El nombre es " + nombre + " y la seccion es " + seccion;
	}
	
	

	}


