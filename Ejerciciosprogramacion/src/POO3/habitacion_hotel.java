package POO3;


	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class habitacion_hotel {

		public static void main(String[] args) throws NumberFormatException, IOException {
			
			BufferedReader lector;
			InputStreamReader stream;
			stream = new InputStreamReader(System.in);
			lector = new BufferedReader (stream);
			
			habitacion_hotel hotel = new habitacion_hotel();
			int a;
			String b;
			int exit=0;
			do {
				
				System.out.println("|| (1)RESERVA || (2)CANCELAR || (3)VER DISPONIBILIDAD || (-1) SALIR ||");
				exit = Integer.parseInt(lector.readLine());
				switch (exit) {
				case 1:
					System.out.println("RESERVA HOTEL");
					System.out.println("Coloca el numero de habitacion y el tipo (SIMPLE,DOBLE,SUITE)");
					System.out.print("NUMERO: ");
					a = Integer.parseInt(lector.readLine());
					System.out.print("TIPO: ");
					b = lector.readLine();
					hotel.habitacion(a, b);
					break;
				case 2:
					System.out.println("DIME EL NUMERO DE LA HABITACION QUE QUERES CANCELAR");
					a = Integer.parseInt(lector.readLine());
					hotel.cancela(a);
					break;
				case 3:
					hotel.disponibilidad();
					break;
				default:
					System.out.println("Numero incorrecto, no entendes que tenes que poner los numeros que te pongo en pantalla imbecil");
					break;
				}
			} while (exit != -1);
			
			System.out.println("lo esperamo nunca");
			

		

	}


