package POO4;
import javax.swing.JOptionPane;

public class uso_agenda_contactos {

	public static void main(String[] args) {
		agenda_contactos[] agenda = new agenda_contactos[10];
        int cantidadContactos = 0;

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "1. Añadir contacto\n" +
                    "2. Buscar contacto\n" +
                    "3. Mostrar contactos\n" +
                    "4. Salir\n" +
                    "Ingrese el número de la opción:");

            switch (opcion) {
                case "1":
                    if (cantidadContactos < agenda.length) {
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto:");
                        String telefono = JOptionPane.showInputDialog("Ingrese el número de teléfono del contacto:");
                        String email = JOptionPane.showInputDialog("Ingrese la dirección de email del contacto:");

                        agenda_contactos contacto = new agenda_contactos(nombre, telefono, email);

                        agenda[cantidadContactos] = contacto;
                        cantidadContactos++;
                        JOptionPane.showMessageDialog(null, "Contacto añadido correctamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "La agenda está llena. No se pueden añadir más contactos.");
                    }
                    break;

                case "2":
                    String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre del contacto a buscar:");
                    boolean encontrado = false;

                    for (agenda_contactos contacto : agenda) {
                        if (contacto != null && contacto.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            JOptionPane.showMessageDialog(null,
                                    "Nombre: " + contacto.getNombre() + "\n" +
                                    "Teléfono: " + contacto.getTelefono() + "\n" +
                                    "Email: " + contacto.getEmail());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
                    }
                    break;

                case "3":
                    
                    StringBuilder listaContactos = new StringBuilder("Lista de Contactos:\n");
                    for (agenda_contactos contacto : agenda) {
                        if (contacto != null) {
                            listaContactos.append("Nombre: ").append(contacto.getNombre()).append("\n");
                            listaContactos.append("Teléfono: ").append(contacto.getTelefono()).append("\n");
                            listaContactos.append("Email: ").append(contacto.getEmail()).append("\n\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listaContactos.toString());
                    break;

                case "4":
                   
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Ingrese un número del 1 al 4.");
            }
        }
    }
}
