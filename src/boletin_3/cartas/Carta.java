package boletin_3.cartas;

import java.util.Random;

public class Carta {

    private String palo;
    private int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public String generarCartaAleatoria() {
        String[] palos = {"Oro", "Copas", "Espadas", "Bastos"};
        Random random = new Random();
        String cartaAleatoria = palos[random.nextInt(palos.length)];
        return cartaAleatoria;
    }
}
