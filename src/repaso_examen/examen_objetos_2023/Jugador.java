package repaso_examen.examen_objetos_2023;

import java.util.Arrays;

public class Jugador {

    private String nombre;
    private int edad;
    private int[] goles;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.goles = new int[0];
    }

    public void setGoles(int[] goles) {
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void addGoles(int golesMarcados) throws ExamenException {
        if (golesMarcados < 0) {
            throw new ExamenException("ERROR: La cantidad de goles marcados no puede ser negativa");
        }
        int[] listaActualizada = Arrays.copyOf(this.goles, goles.length + 1);

        listaActualizada[listaActualizada.length - 1] = golesMarcados;

        setGoles(listaActualizada);
    }

    public int golesMarcados() {
        int total = 0;
        for (int i = 0; i < goles.length; i++) {
            total += i;
        }
        return total;
    }
}
