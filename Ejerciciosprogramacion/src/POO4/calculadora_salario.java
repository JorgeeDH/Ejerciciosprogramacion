package POO4;

public class calculadora_salario {

	
	private String nombre;
	private int horas;
	private int tarifa;
	
	public calculadora_salario(String nombre, int horas, int tarifa) {
		this.nombre=nombre;
		this.horas=horas;
		this.tarifa=tarifa;
		
	}	
		public String getnombre() {
			return nombre;
		}
		public void setnombre(String nombre) {
			this.nombre=nombre;
			
		}
		public int gethoras() {
			return horas;
		}
		public void sethoras(int horas) {
			this.horas=horas;
			
		}
		public int gettarifa() {
			return tarifa;
		}
		
		public void settarifa(int tarifa) {
			this.tarifa=tarifa;
		}
		public int calcularsalario() {
			return horas * tarifa;
		}
}
