package boletin_2.videojuego;

import java.time.LocalDate;

public class Videojuego {

    //atributos
    private String nombre;
    private String entidadCreadora;
    private LocalDate fechaCreacion;
    private int numNucleosProcesador;
    private double minVelCPU;
    private int minEspacioDiscoDuro;
    private int minNucleosGPU;
    private int minMemoriaGPU;

    //constructor
    public Videojuego(String nombre, String entidadCreadora, LocalDate fechaCreacion, int numNucleosProcesador, double minVelCPU, int minEspacioDiscoDuro, int minNucleosGPU, int minMemoriaGPU) {
        this.nombre = nombre;
        this.entidadCreadora = entidadCreadora;
        this.fechaCreacion = fechaCreacion;
        this.numNucleosProcesador = numNucleosProcesador;
        this.minVelCPU = minVelCPU;
        this.minEspacioDiscoDuro = minEspacioDiscoDuro;
        this.minNucleosGPU = minNucleosGPU;
        this.minMemoriaGPU = minMemoriaGPU;
    }

    public boolean esCompatible(Ordenador ordenador) {

        if (this.numNucleosProcesador > ordenador.getNumNucleosProcesador()) {
            return false;
        }

        if (this.minVelCPU > ordenador.getVelCPU()) {
            return false;
        }

        if (minEspacioDiscoDuro > ordenador.getEspacioDiscoDuro()) {
            return false;
        }

        if (this.minNucleosGPU > ordenador.getNucleosGPU()) {
            return false;
        }

        if (minMemoriaGPU > ordenador.getMemoriaGPU()) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", entidadCreadora='" + entidadCreadora + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
