package mis_ejercicios.maquina_cafe;

import utils.MiEntradaSalida;

public class MaquinaApp2 {

    static double saldo;

    public static void main(String[] args) {

        boolean enFuncionamiento = true;
        Maquina2 maquina2 = new Maquina2();

        System.out.println("Bienvenido a la maquina de café a continucación se muestra el menú de opciones");
        menu();

        while (enFuncionamiento) {
            String opcion = MiEntradaSalida.leerCadena("Introduce el NÚMERO de la operacion que desea realizar:");
            switch (opcion) {
                case "1":
                    saldo = MiEntradaSalida.leerDoublePositivo("Introduce tu saldo");
                    try {
                        double cambio = maquina2.servirCafe(saldo);
                        System.out.printf("Sirviendo café... Recoja su cambio %.2f€ ", cambio);
                    } catch (MaquinaException2 e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    saldo = MiEntradaSalida.leerDoublePositivo("Introduce tu saldo");
                    try {
                        double cambio = maquina2.servirLeche(saldo);
                        System.out.printf("Sirviendo leche... Recoja su cambio %.2f€", cambio);
                    } catch (MaquinaException2 e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    saldo = MiEntradaSalida.leerDoublePositivo("Introduce tu saldo");
                    try {
                        double cambio = maquina2.servirCafeConLeche(saldo);
                        System.out.printf("Sirviendo leche... Recoja su cambio %.2f€", cambio);
                    } catch (MaquinaException2 e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "4":
                    System.out.println(maquina2);
                    break;
                case "5":
                    enFuncionamiento = false;
                    break;
                default:
                    System.out.println("Operacion no reconocida");
            }
        }
        System.out.println("Gracias por usar nuestros servicios");
    }

    private static void menu() {

        System.out.println("Operaciones:\n 1-Servir café\n 2-Servir leche\n 3-Servir café con loche\n" +
                " 4-Consultar estado de la maquina\n 5-Salir");
    }
}
