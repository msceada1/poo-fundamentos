package repaso_examen.examen_objetos_2023;

import java.util.Arrays;

public class Equipo {

    Jugador[] listaJugadores;
    private String pais;
    private String nombreEntrenador;

    public Equipo(String pais, String nombreEntrenador) {
        this.pais = pais;
        this.nombreEntrenador = nombreEntrenador;
        this.listaJugadores = new Jugador[2];
    }

    public void setListaJugadores(Jugador[] listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public String getPais() {
        return pais;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void addJugador(Jugador jugadorAAniadir) {
        Jugador[] listaIncrementada = Arrays.copyOf(listaJugadores, listaJugadores.length + 1);
        listaIncrementada[listaIncrementada.length - 1] = jugadorAAniadir;
        setListaJugadores(listaIncrementada);
    }

    public void eliminarJugador(Jugador jugadorAEliminar) {
        for (int i = 0; i < listaJugadores.length; i++) {
            if (listaJugadores[i] != null && listaJugadores[i].equals(jugadorAEliminar.getNombre())) {
                listaJugadores[i] = null;
            }
        }
    }
}
