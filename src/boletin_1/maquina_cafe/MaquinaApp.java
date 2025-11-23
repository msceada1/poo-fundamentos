package boletin_1.maquina_cafe;

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
                        double cambio = maquina.servirCafeSolo(dinero);
                        System.out.printf("Sirviendo cafe solo..., recoja su cambio de %.2f€", cambio);
                    } catch (MaquinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu crédito");
                    try {
                        double cambio = maquina.servirCafeConLeche(dinero);
                        System.out.printf("Sirviendo cafe con leche..., recoja su cambio de %.2f€", cambio);
                    } catch (MaquinaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu crédito");
                    try {
                        double cambio = maquina.servirLecheSola(dinero);
                        System.out.printf("Sirviendo leche sola..., recoja su cambio de %.2f€", cambio);
                    } catch (MaquinaException e) {
                        System.out.println(e.getMessage());
                    }
                case "4":
                    System.out.println(maquina);
                    break;
                case "5":
                    encendida = false;
            }
        }

        System.out.println("Gracias por su tiempo, que tenga un buen dia");
    }

    private static void menu() {
        System.out.println("Opciones : \n 1-Servir Cafe \n 2-Servir cafe con leche \n 3-Servir leche sola" +
                "\n 4-Ver estado de la maquina \n 5-Salir");
    }
}



