package repaso_examen.examen_objetos_2022;

import java.time.LocalDate;

public class Pelicula {

    private String titulo;
    private LocalDate yearLanzamiento;
    private String director;
    private double presupuesto;
    private double recaudacion;
    private String sipnosis;
    private String etiquetas;
    private double valoracion;

    public Pelicula(String titulo, LocalDate yearLanzamiento, String director, double recaudacion, double presupuesto, String sipnosis, String etiquetas) {
        this.titulo = titulo;
        this.yearLanzamiento = yearLanzamiento;
        this.director = director;
        this.recaudacion = recaudacion;
        this.presupuesto = presupuesto;
        this.sipnosis = sipnosis;
        this.etiquetas = etiquetas;
        this.valoracion = calcularValoracion();
    }


    private double calcularValoracion() {
        double valoracionCalculada = (5 * recaudacion) / presupuesto;

        if (valoracionCalculada >= 10) {
            setValoracion(10);
        }
        return valoracionCalculada;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", yearLanzamiento=" + yearLanzamiento +
                ", director='" + director + '\'' +
                ", presupuesto=" + presupuesto +
                ", recaudacion=" + recaudacion +
                ", sipnosis='" + sipnosis + '\'' +
                ", etiquetas='" + etiquetas + '\'' +
                ", valoracion='" + valoracion +
                '}';
    }
}
