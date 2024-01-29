package POO4;
import javax.swing.JOptionPane;
public class uso_registro_estudiantes {

    public static void main(String[] args) {
       
        registro_estudiantes[] estudiantes = new registro_estudiantes[3];

        
        for (int i = 0; i < 3; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (i + 1) + ":");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de " + nombre + ":"));
            String grado = JOptionPane.showInputDialog("Ingrese el grado de " + nombre + ":");

           
            registro_estudiantes estudiante = new registro_estudiantes(nombre, edad, grado);

            
            estudiantes[i] = estudiante;
        }

        
        StringBuilder resultado = new StringBuilder("Información de Estudiantes:\n");
        for (registro_estudiantes estudiante : estudiantes) {
            resultado.append("Nombre: ").append(estudiante.getNombre()).append("\n");
            resultado.append("Edad: ").append(estudiante.getEdad()).append(" años\n");
            resultado.append("Grado: ").append(estudiante.getGrado()).append("\n\n");
        }

        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}