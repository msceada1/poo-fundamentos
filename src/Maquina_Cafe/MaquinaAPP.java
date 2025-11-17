package Maquina_Cafe;

import utils.MiEntradaSalida;

public class MaquinaAPP {

    public static void main(String[] args) {

        Maquina maquina = new Maquina();

        boolean encendida = true;
        System.out.println("Bienvenido a la cafetera");

        while (encendida) {

            menu();

            String opcion = MiEntradaSalida.leerCadena("que accion deseas realizar : ");

            switch (opcion) {
                case "servir cafe":
                    double dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu plata");
                    maquina.servirCafeSolo(dinero);
                    break;
                case "servir cafe con leche":
                    dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu plata");
                    maquina.servirCafeConLeche(dinero);
                    break;
                case "servir leche sola":
                    dinero = MiEntradaSalida.leerDoublePositivo("Introduce tu plata");
                    maquina.servirLecheSola(dinero);
                    break;
                case "consultar estado de la maquina":
                    System.out.println("Deposito de vasos : " + maquina.getVasosMaquina());
                    System.out.println("deposito de leche : " + maquina.getDosisDeLeche());
                    System.out.println("deposito de cafe : " + maquina.getDosisDeCafe());
                    break;
                case "Salir":
                    encendida = false;
            }
        }

        System.out.println("Gracias por su tiempo, que tenga un buen dia");
    }

    public static void menu() {
        System.out.println("Opciones : \n -Servir Cafe \n -Servir cafe con leche \n -Servir leche sola" +
                "\n -Ver estado de la maquina \n -Salir");
    }
}



