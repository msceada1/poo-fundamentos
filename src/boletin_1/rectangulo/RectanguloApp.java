package boletin_1.rectangulo;

import utils.MiEntradaSalida;

public class RectanguloApp {

    public static void main(String[] args) {

        int ancho = MiEntradaSalida.leerEnteroEnRango("Introduce el ancho entre 0 y 20", 0, 20);
        int longitud = MiEntradaSalida.leerEnteroEnRango("Introduce la longitud entre 0 y 20", 0, 20);

        Rectangulo rectangulo = new Rectangulo(ancho, longitud);

        System.out.println("el area es " + rectangulo.calcularArea());
        System.out.println("el perimetro es " + rectangulo.calcularPerimetro());
    }
}
