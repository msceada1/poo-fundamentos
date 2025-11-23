package boletin_1.cuenta;

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
    public void ingresarDinero(int dineroAIngresar) throws CuentaException {

        if (dineroAIngresar > MIN_MONEY) { //se valida que la cantidad a ingresar sea mayor que cero
            this.saldo += dineroAIngresar; //se actualiza el saldo
            this.contadorIngresos++; //se actualiza el contador de ingresos
        } else {
            throw new CuentaException("No puedes ingresar una cantidad negativa o 0");
        }
    }

    /**
     * Metodo que retira dinero de la cuenta y actualiza el saldo de esta
     *
     * @param dineroARetirar el saldo que el usuario desea retirar
     */
    public void retirarDinero(int dineroARetirar) throws CuentaException {

        if (dineroARetirar > this.saldo) { //se verifica que la cantidad retirada no sea mayor que el saldo disponible
            throw new CuentaException("No puedes retirar mas dinero del que tienes en el banco");
        } else if (dineroARetirar <= MIN_MONEY) { //se verifica que la cantidad a retirar no sea 0 o negativa
            throw new CuentaException("No puedes retirar una cantidad negativa o 0");
        } else {
            this.saldo -= dineroARetirar; //se actualiza el saldo
            contadorRetiradas++; //se actualiza el contador de retiradas
        }
    }
}
