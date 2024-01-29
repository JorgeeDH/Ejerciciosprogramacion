package POO5;

public class uso_creacion_uso_basico_empleados {

	public static void main(String[] args) {
        Date fechaContrato = new Date(122, 0, 1);  

        creacion_uso_basico_empleados empleado1 = new creacion_uso_basico_empleados("TuNombre", 3000.0, fechaContrato);

        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Sueldo: " + empleado1.getSueldo());
        System.out.println("Fecha de Contrato: " + empleado1.getFechaContrato());
    }
}
