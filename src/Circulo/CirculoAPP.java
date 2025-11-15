package Circulo;

import utils.MiEntradaSalida;

public class CirculoAPP {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        System.out.println("El radio principal del circulo es " + c1.getRadio() + " \n");

        int nuevoRadio = MiEntradaSalida.leerEnteroEnRango("Introduce un rango nuevo entre 1 y 10", 1, 10);
        c1.setRadio(nuevoRadio);

        System.out.printf("El nuevo radio es %.2f\n", c1.getRadio());
        System.out.printf("La circunferencia es %.2f\n", c1.calcularCircunferencia());
        System.out.printf("El area es %.2f\n", c1.calcularArea());
    }
}
