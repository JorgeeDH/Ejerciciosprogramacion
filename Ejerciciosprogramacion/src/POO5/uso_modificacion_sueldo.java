package POO5;
import java.util.Date;

public class uso_modificacion_sueldo {
	
	 Date fechaContrato = new Date(122, 0, 1);

	 modificacion_sueldo empleado2 = new modificacion_sueldo("Empleado2", 4000.0, fechaContrato);

     System.out.println("Sueldo actual de " + empleado2.getNombre() + ": " + empleado2.getSueldo());

     empleado2.aumentarSueldo(10.0);

     System.out.println("Nuevo sueldo de " + empleado2.getNombre() + ": " + empleado2.getSueldo());
 }


