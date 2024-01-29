package POO5;
import java.util.ArrayList;
import java.util.Date;

public class uso_lista_empleados {

	public static void main(String[] args) {
        ArrayList<lista_empleados> listaEmpleados = new ArrayList<>();

        // Agregar tres empleados a la lista
        listaEmpleados.add(new lista_empleados("Empleado1", 3000.0, new Date(122, 0, 1)));  
        listaEmpleados.add(new lista_empleados("Empleado2", 4000.0, new Date(122, 3, 15))); 
        listaEmpleados.add(new lista_empleados("Empleado3", 3500.0, new Date(122, 6, 30))); 

        System.out.println("Nombres y Sueldos de Empleados:");
        for (lista_empleados empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Sueldo: " + empleado.getSueldo());
        }
    }
}
