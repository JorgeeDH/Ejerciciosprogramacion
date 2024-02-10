package ejercicios_herencia;



	public class triangulo extends figura{

		public void calcularArea() {
			int base=10;
			int altura =  5;
			
			System.out.println("El area del triangulo se calcula: (base x altura) /2==   (10 * 5)(/2)==  "+( base*altura ) /2 );
		}
	}

