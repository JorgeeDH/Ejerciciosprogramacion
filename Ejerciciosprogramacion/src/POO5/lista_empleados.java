package POO5;

import java.util.Date;
public class lista_empleados {

	private String nombre;
    private double sueldo;
    private Date fechaContrato;

    // Constructor
    public lista_empleados(String nombre, double sueldo, Date fechaContrato) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaContrato = fechaContrato;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
}
