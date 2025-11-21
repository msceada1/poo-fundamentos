package Ejercicio_Persona;

import java.time.LocalDate;

public class PersonaApp {

    public static void main(String[] args) {

        Persona p1 = new Persona("Manuel", "28944889", 'H', LocalDate.of(2005, 2, 10), 1.85, 76);


        System.out.println(p1);
        System.out.println("El IMC de " +p1.getNombre() + " es " + p1.calculoIMC());

        System.out.println("El peso de " + p1.getNombre() + " ha incrementado 2 kg por los dulces navideños");
        p1.setPeso(78);
        System.out.println(p1);
    }
}
