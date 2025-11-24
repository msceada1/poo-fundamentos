package boletin_2.videojuego;

import java.time.LocalDate;

public class VideojuegoApp {

    public static void main(String[] args) {

        Videojuego videojuego1 = new Videojuego("Red Dead Redemption 2", "Rockstar",
                LocalDate.of(2018, 10, 26), 6, 64,
                200, 6, 12);

        Videojuego videojuego2 = new Videojuego("DBZ Budokai Tenkaichi 3", "Spike",
                LocalDate.of(2007, 10, 4), 4, 32,
                50, 2, 4);

        Videojuego videojuego3 = new Videojuego("Inazuma Eleven 2 Ventisca Eterna", "Level-5",
                LocalDate.of(2009, 10, 1), 2, 4, 4,
                2, 3);

        Ordenador ordenador1 = new Ordenador(8, 126, 500, 8, 32);
    }
}
