package Maquina_Cafe;

import utils.MiEntradaSalida;

public class MaquinaApp {

    public static void main(String[] args) {

        Maquina maquina = new Maquina();

        boolean encendida = true;
        System.out.println("Bienvenido a la cafetera");

        while (encendida) {

            menu();
            String opcion = MiEntradaSalida.leerCadena("Introduce el NÚMERO de la opción que deseas realizar : ");

            switch (opcion) {
                case "1":
                    double dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu crédito");
                    try {
                        maquina.servirCafeSolo(dinero);
                    } catch (MaquinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu crédito");
                    try {
                        maquina.servirCafeConLeche(dinero);
                    } catch (MaquinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu crédito");
                    try {
                        maquina.servirLecheSola(dinero);
                    } catch (MaquinaException e) {
                        System.out.println(e.getMessage());
                    }
                case "4":
                    System.out.println(maquina);
            }
        }

        System.out.println("Gracias por su tiempo, que tenga un buen dia");
    }

    public static void menu() {
        System.out.println("Opciones : \n 1-Servir Cafe \n 2-Servir cafe con leche \n 3-Servir leche sola" +
                "\n 4-Ver estado de la maquina \n 5-Salir");
    }
}



