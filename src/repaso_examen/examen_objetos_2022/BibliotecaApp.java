package repaso_examen.examen_objetos_2022;

import utils.MiEntradaSalida;

import java.time.LocalDate;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        boolean ejecutar = true;
        System.out.println("bienvenido a la biblioteca de peliculas, actualemente, su biblioteca se encuentra vacía");

        while (ejecutar) {

            menu();
            int operacion = Integer.parseInt(MiEntradaSalida.leerEnteroYConvertirAString("Introduce el NÚMERO de la operacionque deseas realizar"));

            switch (operacion) {
                case 1:
                    String titulo = MiEntradaSalida.leerCadena("Introduce el titulo");
                    int year = MiEntradaSalida.leerEnteroPositivo("Introduce el año de lanzamiento");
                    int month = MiEntradaSalida.leerEnteroEnRango("Introduce el mes", 1, 12);
                    int dayOfMonth = MiEntradaSalida.leerEnteroEnRango("Introduce el dia", 1, 30);
                    LocalDate fecha = LocalDate.of(year, month, dayOfMonth);
                    String director = MiEntradaSalida.leerCadena("Nombre del director");
                    double presupuesto = MiEntradaSalida.leerDoublePositivo("Introduce el presupuesto");
                    double recaudacion = MiEntradaSalida.leerDoublePositivo("Introduce la recaudacion");
                    String sipnosis = MiEntradaSalida.leerCadena("Sipnosis");
                    String etiquetas = MiEntradaSalida.leerCadena("Etiquetas");

                    Pelicula pelicula = new Pelicula(titulo, fecha, director, recaudacion, presupuesto, sipnosis, etiquetas);

                    try {
                        biblioteca.addPelicula(pelicula);
                    } catch (BibliotecaException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 2:
                    biblioteca.consultarBiblioteca();
                    break;
                case 3:
                    String etiqueta = MiEntradaSalida.leerCadena("Dime la etiqueta de la pelicula");
                    biblioteca.buscarPeliculasPorEtiqueta(etiqueta);
                    break;
                case 4:
                    String nombre = MiEntradaSalida.leerCadena("Introduce el nombre de la pelicula");
                    biblioteca.buscarPeliculaPorTitulo(nombre);
                    break;
                case 5:
                    double presupuestoABuscar = MiEntradaSalida.leerDoublePositivo("Introduce el presupuesto de la peli");
                    biblioteca.buscarPeliculasConPresupuestoMaximo(presupuestoABuscar);
                    break;
                case 6:
                    ejecutar = false;
            }
        }

        System.out.println("La biblioteca... un lugar lleno de misterio... pero a la vez de aprendizaje constante... adiós crack!");
    }

    private static void menu() {
        System.out.println("Opciones: \n 1-añadir nueva pelicula \n 2-consultar la biblioteca \n 3-buscar pelicula por etiquetas" +
                "\n 4-buscar pelicula por titulo \n 5-Buscar peliculas por presupuesto \n 6-Salir");
    }
}
