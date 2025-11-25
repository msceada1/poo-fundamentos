package boletin_2.videojuego;

import java.time.LocalDate;

public class VideojuegoApp {

    public static void main(String[] args) {

        Videojuego videojuego1 = new Videojuego("Red Dead Redemption 2", "Rockstar",
                LocalDate.of(2018, 10, 26), 6, 64,
                200, 6, 12);

        Videojuego videojuego2 = new Videojuego("Dragon Ball Z Budokai Tenkaichi 3", "Spike",
                LocalDate.of(2007, 10, 4), 4, 32,
                50, 2, 4);

        Ordenador asus = new Ordenador(8, 126, 500, 8, 32);

        Ordenador hp = new Ordenador(4, 80, 200, 4, 16);

        System.out.println("Videojuego 1:\n" +
                videojuego1 + "\n");
        System.out.println("Videojuego 2:\n" +
                videojuego2 + "\n");

        try {
            if (!videojuego1.esCompatible(asus)) {
                throw new VideojuegoException("El videojuego " + videojuego1.getNombre() + " no es compatible" +
                        " con el ordenador asus");
            }
            System.out.println("Disfruta de " + videojuego1.getNombre() + " en tu Asus");
        } catch (VideojuegoException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (!videojuego1.esCompatible(hp)) {
                throw new VideojuegoException("El videojuego " + videojuego1.getNombre() + " no es compatible" +
                        "con el ordenador hp");
            }
            System.out.println("Difruta de tu " + videojuego1.getNombre() + " en tu hp");
        } catch (VideojuegoException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (!videojuego2.esCompatible(asus)) {
                throw new VideojuegoException("El videojuego " + videojuego2.getNombre() + " no es compatible " +
                        " con el ordenador asus");
            }
            System.out.println("Disfruta de tu " + videojuego2.getNombre() + " en tu asus");
        } catch (VideojuegoException e) {
            System.out.println(e.getMessage());
        }

        try {
            if (!videojuego2.esCompatible(hp)) {
                throw new VideojuegoException("EL videojuego " + videojuego2.getNombre() + " no es compatible " +
                        " con el ordenador hp");
            }
        } catch (VideojuegoException e) {
            System.out.println(e.getMessage());
        }
    }
}
