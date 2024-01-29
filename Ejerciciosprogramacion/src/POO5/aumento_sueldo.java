package POO5;

import java.time.LocalDate;


public class aumento_sueldo {
	
	private String nombre;
    private double sueldo;
    private LocalDate fechaContrato;

    
    public aumento_sueldo(String nombre, double sueldo, LocalDate fechaContrato) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaContrato = fechaContrato;
    }


    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void aumentarSueldo(double porcentaje) {
        double aumento = sueldo * (porcentaje / 100);
        sueldo += aumento;
    }

}
