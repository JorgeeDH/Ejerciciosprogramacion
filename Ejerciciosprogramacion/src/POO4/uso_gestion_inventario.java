package POO4;
import javax.swing.JOptionPane;

public class uso_gestion_inventario {
	
	public class uso_gestion_inventarios {

	    public static void main(String[] args) {
	        int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de productos:"));

	        gestion_inventarios[] inventario = new gestion_inventarios[numProductos];

	        for (int i = 0; i < numProductos; i++) {
	            String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");
	            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de " + nombreProducto + ":"));
	            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de " + nombreProducto + ":"));

	            gestion_inventarios producto = new gestion_inventarios(nombreProducto, cantidad, precio);

	            inventario[i] = producto;
	        }

	        StringBuilder resumenInventario = new StringBuilder("Resumen del Inventario:\n");
	        for (gestion_inventarios producto : inventario) {
	            resumenInventario.append("Nombre: ").append(producto.getNombreProducto()).append("\n");
	            resumenInventario.append("Cantidad: ").append(producto.getCantidad()).append("\n");
	            resumenInventario.append("Precio: $").append(producto.getPrecio()).append("\n");
	            resumenInventario.append("Valor Total: $").append(producto.calcularValorInventario()).append("\n\n");
	        }

	       
	        JOptionPane.showMessageDialog(null, resumenInventario.toString());
	    }
	}

}
