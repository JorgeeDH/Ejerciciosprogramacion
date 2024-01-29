package POO4;
import javax.swing.JOptionPane;
public class uso_calculadora_salario {
	
    public static void main(String[] args) {
        
    	calculadora_salario[] empleados = new calculadora_salario[5];

        
        for (int i = 0; i < 5; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1) + ":");
            int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas por " + nombre + ":"));
            int tarifaPorHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tarifa por hora para " + nombre + ":"));

            calculadora_salario empleado = new calculadora_salario(nombre, horasTrabajadas, tarifaPorHora);

            empleados[i] = empleado;
        }

        StringBuilder resultado = new StringBuilder("Resultados:\n");
        for (calculadora_salario empleado : empleados) {
            int salario = empleado.calcularsalario();
            resultado.append(empleado.getnombre()).append(": $").append(salario).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}