package ejercicios_herencia;

public class vehiculos {

    private String marca;
    private String modelo;
    private int año;

    public vehiculos(String marca, String modelo, int año) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }
}