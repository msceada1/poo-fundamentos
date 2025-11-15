package Cuenta;

public class Cuenta {

    static final int MIN_MONEY = 0;

    private int saldo;
    private int contadorRetiradas;
    private int contadorIngresos;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    public int getContadorIngresos() {
        return contadorIngresos;
    }

    public int getContadorRetiradas() {
        return contadorRetiradas;
    }

    public int getSaldo() {
        return saldo;
    }

    /**
     * Metodo que actualiza el saldo de la cuenta en base a la cantidad que introduzca el usuario
     *
     * @param dineroAIngresar el saldo que el usuario desea introducir en su cuenta
     */
    public void ingresarDinero(int dineroAIngresar) {

        if (dineroAIngresar > MIN_MONEY) { //se valida que la cantidad a ingresar sea mayor que cero
            System.out.println("Has ingresaso " + dineroAIngresar);
            this.saldo += dineroAIngresar; //se actualiza el saldo
            this.contadorIngresos++; //se actualiza el contador de ingresos
            System.out.println("Tu saldo actual es de " + this.saldo + " $");
        } else {
            System.out.println("No puedes ingresar una cantidad negativa o 0");
        }

    }

    /**
     * Metodo que retira dinero de la cuenta y actualiza el saldo de esta
     *
     * @param dineroARetirar el saldo que el usuario desea retirar
     */
    public void retirarDinero(int dineroARetirar) {

        if (dineroARetirar > this.saldo) { //se verifica que la cantidad retirada no sea mayor que el saldo disponible
            System.out.println("No puedes retirar mas dinero del que tienes en tu cuenta");
        } else if (dineroARetirar <= MIN_MONEY) { //que la cantidad a retirar no sea 0 o negativa
            System.out.println("No puedes retirar una cantidad de 0 o negativo");
        } else {
            this.saldo -= dineroARetirar; //se actualiza el saldo
            contadorRetiradas++; //se actualiza el contador de retiradas
            System.out.println("Tu saldo actual es de " + this.saldo + " $");
        }

    }

    public void menu() {
        System.out.println("Operaciones : \n Ingresar dinero \n Retirar dinero \n Consultar saldo \n " +
                "Consultar ingresos realizados \n Consultar retiradas realizadas \n Salir");
    }
}
