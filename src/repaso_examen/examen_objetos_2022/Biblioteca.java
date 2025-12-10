package repaso_examen.examen_objetos_2022;

import java.util.Arrays;

public class Biblioteca {

    private static final int MAX_CAPACIDAD_PELICULAS = 20;

    private Pelicula[] peliculas;

    public Biblioteca() {
        this.peliculas = new Pelicula[MAX_CAPACIDAD_PELICULAS];
    }

    public void addPelicula(Pelicula pelicula) throws BibliotecaException {
        if (haLlegadoAlLimite()) {
            throw new BibliotecaException("ERROR: ha llegado al limite, no puede añadir mas películas");
        }

        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] == null) {
                peliculas[i] = pelicula;
                break;
            }
        }
    }

    private boolean haLlegadoAlLimite() {
        return peliculas[peliculas.length - 1] != null;
    }

    public void consultarBiblioteca() {
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null) {
                System.out.println(pelicula);
            }
        }
    }

    public void buscarPeliculasPorEtiqueta(String etiqueta) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null) {
                if (pelicula.getEtiquetas().contains(etiqueta)) {
                    System.out.println(pelicula.getTitulo());
                }
            }
        }
    }

    public void buscarPeliculaPorTitulo(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null) {
                if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println(pelicula);
                }
            }
        }
    }

    public void buscarPeliculasConPresupuestoMaximo(double presupuesto) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null) {
                if (pelicula.getPresupuesto() <= presupuesto) {
                    System.out.println(pelicula);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "peliculas=" + Arrays.toString(peliculas) +
                '}';
    }
}
