package POO5;
import java.util.Date;

public class modificacion_sueldo {
	
	public class Empleado {
	    private String nombre;
	    private double sueldo;
	    private Date fechaContrato;

	   
	    public modificacion_sueldo(String nombre, double sueldo, Date fechaContrato) {
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

	    public void setSueldo(double sueldo) {
	        this.sueldo = sueldo;
	    }

	    public Date getFechaContrato() {
	        return fechaContrato;
	    }

	    public void aumentarSueldo(double porcentaje) {
	        double aumento = sueldo * (porcentaje / 100);
	        sueldo += aumento;
	    }}}




