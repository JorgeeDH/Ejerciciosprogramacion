package ejercicios_herencia;

public class DispositivoElectonico {

	private String fabricante;
	private int añodefabricacion;

	 public DispositivoElectronico(String fabricante, int añodefabricacion) {
		super();
		this.fabricante = fabricante;
		this.añodefabricacion = añodefabricacion;
	}

	public String getFabricante() {
		return fabricante;
	}

	public int getAñodefabricacion() {
		return añodefabricacion;
	}

	public void Telefono() {
		 System.out.println("A quien quieres llamar: ");
		 
		 System.out.println("TE ESTA LAMANDO: ");
	 }
}
