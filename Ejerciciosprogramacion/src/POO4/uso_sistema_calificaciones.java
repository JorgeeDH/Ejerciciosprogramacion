package POO4;
import javax.swing.JOptionPane;

public class uso_sistema_calificaciones {
	
	public static void main(String[] args) {
        
        String nombreCurso = JOptionPane.showInputDialog("Ingrese el nombre del curso:");
        int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la calificación del curso:"));

       
        Curso curso = new Curso(nombreCurso, calificacion);

        
        String categoriaCalificacion = curso.obtenerCategoriaCalificacion();

        
        JOptionPane.showMessageDialog(null, "Resultado:\n" +
                "Curso: " + curso.getNombreCurso() + "\n" +
                "Calificación: " + curso.getCalificacion() + "\n" +
                "Categoría: " + categoriaCalificacion);
    }
}


