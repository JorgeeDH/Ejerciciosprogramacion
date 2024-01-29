package POO5;
import java.util.ArrayList;
import java.time.LocalDate;

public class uso_aumento_sueldo {
	
        ArrayList<aumento_sueldo> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new Empleado("Empleado1", 3000.0, LocalDate.of(2020, 5, 1))); 
        listaEmpleados.add(new Empleado("Empleado2", 4000.0, LocalDate.of(2021, 3, 15))); 
        listaEmpleados.add(new Empleado("Empleado3", 3500.0, LocalDate.of(2019, 8, 30))); 

        LocalDate fechaLimite = LocalDate.of(2021, 1, 1);

        for (aumento_sueldo empleado : listaEmpleados) {
            if (empleado.getFechaContrato().isBefore(fechaLimite)) {
            	empleado.aumentarSueldo(5.0); 
                
            }
        }

        System.out.println("Nombres y Sueldos Actualizados de Empleados:");
        for (Empleado aumento_sueldo : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Sueldo: " + empleado.getSueldo());
        }
    }

}
