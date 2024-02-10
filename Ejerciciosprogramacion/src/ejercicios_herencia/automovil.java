package ejercicios_herencia;



public class automovil extends vehiculo {
    private String Tipodecombustible;

    public automovil(String marca, String modelo, int año, String Tipodecombustible) {
        super(marca, modelo, año);
        this.Tipodecombustible = Tipodecombustible;
    }

    public String getTipodecombustible() {
        return Tipodecombustible;
    }

    public void mostrarDatos() {
        System.out.println("\n Marca: " + getMarca() + "\n Modelo: " + getModelo()
                + "\n Año: " + getAño() + "\n Tipo De Combustible: " + getTipodecombustible());
    }
}