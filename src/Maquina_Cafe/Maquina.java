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
        this.saldoMaquina = 50.00;
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

    public double getSaldoMaquina() {
        return saldoMaquina;
    }

    private double devolverCambio(double dineroIntroducido, double precioProducto) throws MaquinaException {

        if (dineroIntroducido < precioProducto) {
            throw new MaquinaException("ERROR: El saldo introducido es menor que el precio del producto seleccionado");
        }

        if ((dineroIntroducido - precioProducto) > this.saldoMaquina) {
            throw new MaquinaException("ERROR: No se dispone de cambio suficiente");
        }

        this.saldoMaquina += dineroIntroducido;
        this.saldoMaquina -= dineroIntroducido - precioProducto;
        return dineroIntroducido - precioProducto;
    }

    public void servirCafeSolo(double dineroIntroducido) throws MaquinaException {

        if (this.dosisDeCafe == 0 || this.vasosMaquina == 0) {
            throw new MaquinaException("No hay componentes suficientes para servir el cafe");
        }

        devolverCambio(dineroIntroducido, PRECIO_CAFE_SOLO);
        this.vasosMaquina--;
        this.dosisDeCafe--;
    }

    public void servirLecheSola(double dineroIntroducido) throws MaquinaException {

        if (this.dosisDeLeche == 0 || this.vasosMaquina == 0) {
            throw new MaquinaException("No hay componentes suficientes para servir la leche");
        }

        devolverCambio(dineroIntroducido, PRECIO_LECHE_SOLA);
        this.vasosMaquina--;
        this.dosisDeLeche--;
    }

    public void servirCafeConLeche(double dineroIntroducido) throws MaquinaException {

        if (this.dosisDeLeche == 0 || this.dosisDeCafe == 0 || this.vasosMaquina == 0) {
            throw new MaquinaException("No hay componentes suficientes para servir cafe con leche");
        }

        devolverCambio(dineroIntroducido, PRECIO_CAFE_CON_LECHE);
        this.vasosMaquina--;
        this.dosisDeCafe--;
        this.dosisDeLeche--;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "Dosis de café=" + dosisDeCafe +
                ", Dosis de leche=" + dosisDeLeche +
                ", Vasos disponibles=" + vasosMaquina +
                '}';
    }
}
