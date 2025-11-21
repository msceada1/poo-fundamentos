package Ordenador;

public class TarjetaGrafica {

    private String marca;
    private String modelo;
    private int cantidadNucleos;
    private double velocidad;
    private int cantidadMemoria;

    public TarjetaGrafica(String marca, String modelo, int cantidadNucleos, double velocidad, int cantidadMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadNucleos = cantidadNucleos;
        this.velocidad = velocidad;
        this.cantidadMemoria = cantidadMemoria;
    }

    @Override
    public String toString() {
        return "TarjetaGrafica { " +
                "marca = ' " + marca + '\'' +
                ", modelo = ' " + modelo + '\'' +
                ", cantidadNucleos = " + cantidadNucleos +
                ", velocidad = " + velocidad +
                ", cantidadMemoria = " + cantidadMemoria +
                '}';
    }
}
