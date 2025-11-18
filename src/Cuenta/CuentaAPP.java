package Cuenta;

import utils.MiEntradaSalida;

public class CuentaAPP {

    public static void main(String[] args) {

        boolean operando = true; //variable que deja la gestion de la cuenta en funcionamiento
        int saldoInicial = MiEntradaSalida.leerEnteroPositivoMayorQueCero("Introduce su saldo inical. Tiene que ser mayor que cero");
        Cuenta cuenta = new Cuenta(saldoInicial);

        menu();

        while (operando) {

            String operacion = MiEntradaSalida.leerCadena("Introduce el NÚMERO de la operación de deseas realizar");

            switch (operacion) {
                case "1":
                    int dineroAIngresar = MiEntradaSalida.leerEntero("Introduce el dinero a ingresar, debe ser mayor que cero");
                    try {
                        cuenta.ingresarDinero(dineroAIngresar);
                    } catch (CuentaException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "2":
                    int dineroARetirar = MiEntradaSalida.leerEntero("Introduce el dinero a retirar, debe ser mayor que cero");
                    try {
                        cuenta.retirarDinero(dineroARetirar);
                    } catch (CuentaException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case "3":
                    System.out.println("Tu saldo es de " + cuenta.getSaldo() + " €");
                    break;

                case "4":
                    System.out.println("Has realizado " + cuenta.getContadorIngresos() + " ingresos");
                    System.out.println();
                    System.out.println("Has realizado " + cuenta.getContadorRetiradas() + " retiradas");
                    break;

                case "5":
                    operando = false;
                    break;

                default:

                    System.out.println("Operación no reconocida. Introduce de nuevo.");
                    break;
            }

        }

        System.out.println("Que tenga un buen día");
    }

    private static void menu() {
        System.out.println("Operaciones : \n 1: Ingresar dinero \n 2: Retirar dinero \n 3: Consultar saldo \n " +
                "4: Consultar ultimos movimientos  \n 6: Salir");
    }
}
