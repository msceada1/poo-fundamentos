package Maquina_Cafe;

import utils.MiEntradaSalida;

public class MaquinaApp {

    public static void main(String[] args) {

        Maquina maquina = new Maquina();

        boolean encendida = true;
        System.out.println("Bienvenido a la cafetera");

        while (encendida) {

            menu();

            String opcion = MiEntradaSalida.leerCadena("que accion deseas realizar : ");

            switch (opcion) {
                case "1":
                    double dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu plata");
                    try {
                        maquina.servirCafeSolo(dinero);
                    } catch (MaquinaException e) {
                        e.getMessage();
                    }
                    break;
                case "2":
                    dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu plata");
                    try {
                        maquina.servirCafeConLeche(dinero);
                    } catch (MaquinaException e) {
                        e.getMessage();
                    }
                    break;
                case "3":
                    dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu plata");
                    try {
                        maquina.servirLecheSola(dinero);
                    } catch (MaquinaException e) {
                        e.getMessage();
                    }
                    break;
                case "4":
                    System.out.println("Deposito de vasos : " + maquina.getVasosMaquina());
                    System.out.println("deposito de leche : " + maquina.getDosisDeLeche());
                    System.out.println("deposito de cafe : " + maquina.getDosisDeCafe());
                    break;
                case "5":
                    encendida = false;
            }
        }

        System.out.println("Gracias por su tiempo, que tenga un buen dia");
    }

    public static void menu() {
        System.out.println("Opciones : \n 1-Servir Cafe \n 2-Servir cafe con leche \n 3-Servir leche sola" +
                "\n 4-Ver estado de la maquina \n 5-Salir");
    }
}



