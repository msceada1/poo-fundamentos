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

            switch (operacion) {
                case "ingresar dinero":
                    int dineroAIngresar = MiEntradaSalida.leerEnteroPositivoMayorQueCero("Introduce el dinero a ingresar, debe ser mayor que cero");
                    cuenta.ingresarDinero(dineroAIngresar);
                    break;

                case "retirar dinero":
                    int dineroARetirar = MiEntradaSalida.leerEnteroPositivoMayorQueCero("Introduce el dinero a retirar, debe ser mayor que cero");
                    cuenta.retirarDinero(dineroARetirar);
                    break;

                case "consultar saldo":
                    System.out.println("Tu saldo es de " + cuenta.getSaldo() + " $");
                    break;

                case "consultar ingresos realizados":
                    System.out.println("Has realizado " + cuenta.getContadorIngresos() + " ingresos");
                    break;

                case "consultar retiradas":
                    System.out.println("Has realizado " + cuenta.getContadorRetiradas() + " retiradas");
                    break;

                case "salir":
                    operando = false;
                    break;

                default:

                    System.out.println("Operación no reconocida. Introduce de nuevo.");
                    break;
            }

        }

        System.out.println("Que tenga un buen día");
    }
}
