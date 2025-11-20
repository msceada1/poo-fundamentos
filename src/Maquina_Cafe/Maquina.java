package Maquina_Cafe;

public class Maquina {

    //definicion de constantes
    private static final int CAPACIDAD_DEPOSITO_CAFE = 50;
    private static final int CAPACIDAD_DEPOSITO_LECHE = 50;
    private static final int CAPACIDAD_DEPOSITO_VASOS = 80;
    private static final double PRECIO_CAFE_SOLO = 1;
    private static final double PRECIO_LECHE_SOLA = 0.8;
    private static final double PRECIO_CAFE_CON_LECHE = 1.5;

    //atributos
    private int dosisDeCafe;
    private int dosisDeLeche;
    private int vasosMaquina;
    private double saldoMaquina;

    public Maquina() {
        this.dosisDeCafe = CAPACIDAD_DEPOSITO_CAFE;
        this.dosisDeLeche = CAPACIDAD_DEPOSITO_LECHE;
        this.vasosMaquina = CAPACIDAD_DEPOSITO_VASOS;
        this.saldoMaquina = 10.00;
    }

    public int getDosisDeCafe() {
        return dosisDeCafe;
    }

    public int getDosisDeLeche() {
        return dosisDeLeche;
    }

    public int getVasosMaquina() {
        return vasosMaquina;
    }

    private boolean hayCambioDisponible(double dineroIntroducido) {
        return dineroIntroducido < this.saldoMaquina;
    }

    private double devolverCambio(double dineroIntroducido, double precioProducto) throws MaquinaException {

        if (!hayCambioDisponible(dineroIntroducido)) {
            throw new MaquinaException("No hay cambio para la cantidad que has introducido");
        }

        this.saldoMaquina += dineroIntroducido;
        this.saldoMaquina -= dineroIntroducido - precioProducto;
        return dineroIntroducido - precioProducto;
    }

    public void servirCafeSolo(double dineroIntroducido) throws MaquinaException {

        if (devolverCambio(dineroIntroducido, PRECIO_CAFE_SOLO) != 0.00) {
            devolverCambio(dineroIntroducido, PRECIO_CAFE_SOLO);
            this.dosisDeCafe--;
            this.vasosMaquina--;
        }
    }

    public void servirLecheSola(double dineroIntroducido) throws MaquinaException {

        if (devolverCambio(dineroIntroducido, PRECIO_LECHE_SOLA) != 0.00) {
            devolverCambio(dineroIntroducido, PRECIO_LECHE_SOLA);
            this.dosisDeLeche--;
            this.vasosMaquina--;
        }
    }

    public void servirCafeConLeche(double dineroIntroducido) throws MaquinaException {

        if (devolverCambio(dineroIntroducido, PRECIO_CAFE_CON_LECHE) != 0) {
            devolverCambio(dineroIntroducido, PRECIO_CAFE_CON_LECHE);
            this.dosisDeLeche--;
            this.dosisDeCafe--;
            this.vasosMaquina--;
        }
    }

    private void llenarDepositos() {

        if (this.vasosMaquina != CAPACIDAD_DEPOSITO_VASOS) {
            int vasosQueFaltan = CAPACIDAD_DEPOSITO_VASOS - this.vasosMaquina;
            this.vasosMaquina += vasosQueFaltan;
        }

        if (this.dosisDeCafe != CAPACIDAD_DEPOSITO_CAFE) {
            int dosisDeCafeQueFaltan = CAPACIDAD_DEPOSITO_CAFE - this.dosisDeCafe;
            this.dosisDeCafe += dosisDeCafeQueFaltan;
        }

        if (this.dosisDeLeche != CAPACIDAD_DEPOSITO_LECHE) {
            int dosisDeLecheQueFaltan = CAPACIDAD_DEPOSITO_LECHE - this.dosisDeLeche;
            this.dosisDeLeche += dosisDeLecheQueFaltan;
        }
    }
}
