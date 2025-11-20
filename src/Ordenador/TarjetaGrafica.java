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

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCantidadNucleos() {
        return cantidadNucleos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getCantidadMemoria() {
        return cantidadMemoria;
    }
}
