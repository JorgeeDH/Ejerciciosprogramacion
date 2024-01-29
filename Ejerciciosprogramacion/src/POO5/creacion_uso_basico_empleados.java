package POO5;

public class creacion_uso_basico_empleados {
	
	private String nombre;
    private double sueldo;
    private Date fechaContrato;

    public creacion_uso_basico_empleados(String nombre, double sueldo, Date fechaContrato) {
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

    public Date getFechaContrato() {
        return fechaContrato;
    }

}
