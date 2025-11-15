package Cuenta;

import utils.MiEntradaSalida;

public class CuentaAPP {

    public static void main(String[] args) {

        boolean operando = true; //variable que deja la gestion de la cuenta en funcionamiento
        int saldoInicial = MiEntradaSalida.leerEnteroPositivoMayorQueCero("Introduce su saldo inical. Tiene que ser mayor que cero");
        Cuenta cuenta = new Cuenta(saldoInicial);

        cuenta.menu();

        while (operando) {

            String operacion = MiEntradaSalida.leerCadena("Que operacion deseas realizar");

            if (operacion.equalsIgnoreCase("Ingresar dinero")) {
                int dineroAIngresar = MiEntradaSalida.leerEnteroPositivoMayorQueCero("Introduce el dinero a introducir, debe ser mayor que cero");
                cuenta.ingresarDinero(dineroAIngresar);
            } else if (operacion.equalsIgnoreCase("Retirar dinero")) {
                int dineroARetirar = MiEntradaSalida.leerEnteroPositivoMayorQueCero("Introduce el dinero a retirar, debe ser mayor que cero");
                cuenta.retirarDinero(dineroARetirar);
            } else if (operacion.equalsIgnoreCase("Consultar saldo")) {
                System.out.println("Tu saldo es de " + cuenta.getSaldo() + " $");
            } else if (operacion.equalsIgnoreCase("Consultar ingresos realizados")) {
                System.out.println("Has realizado " + cuenta.getContadorIngresos() + " ingresos");
            } else if (operacion.equalsIgnoreCase("Consultar retiradas")) {
                System.out.println("Has realizado " + cuenta.getContadorRetiradas() + " retiradas");
            } else if (operacion.equalsIgnoreCase("Salir")) {
                operando = false;
            } else {
                System.out.println("Operacion no reconocida, introducir de nuevo");
            }
        }

        System.out.println("Que tenga un buen día");
    }
}
