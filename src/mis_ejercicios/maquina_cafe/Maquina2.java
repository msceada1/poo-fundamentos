package mis_ejercicios.maquina_cafe;

public class Maquina2 {

    //definicion de constantes
    private static final int CAPACIDAD_DOSIS_DE_CAFE = 50;
    private static final int CAPACIDAD_DOSIS_DE_LECHE = 50;
    private static final int CAPACIDAD_VASOS_MAQUINA = 80;
    private static final double PRECIO_CAFE_SOLO = 1.00;
    private static final double PRECIO_LECHE_SOLA = 0.8;
    private static final double PRECIO_CAFE_CON_LECHE = 1.5;

    //atributos
    private int dosisDeCafe = CAPACIDAD_DOSIS_DE_CAFE;
    private int dosisDeLeche = CAPACIDAD_DOSIS_DE_LECHE;
    private int vasosMaquina = CAPACIDAD_VASOS_MAQUINA;
    private double saldoMaquina = 100;

    //constructor
    public Maquina2() {
        this.dosisDeCafe = CAPACIDAD_DOSIS_DE_CAFE;
        this.dosisDeLeche = CAPACIDAD_DOSIS_DE_LECHE;
        this.vasosMaquina = CAPACIDAD_VASOS_MAQUINA;
    }

    private double devolverCambio(double dineroIntroducido, double precioProducto) throws MaquinaException2 {

        if (dineroIntroducido < precioProducto) {
            throw new MaquinaException2("ERROR: Saldo insuficiente");
        }

        if (dineroIntroducido > this.saldoMaquina) {
            throw new MaquinaException2("ERROR: No se dispone de cambio");
        }

        if ((dineroIntroducido - precioProducto) > this.saldoMaquina) {
            throw new MaquinaException2("ERROR: no se dispone de cambio");
        }

        return dineroIntroducido - precioProducto;
    }

    public double servirCafe(double dineroIntroducido) throws MaquinaException2 {

        if (this.dosisDeCafe == 0 || this.vasosMaquina == 0) {
            throw new MaquinaException2("ERROR: Componentes insuficientes para servir cafe");
        }

        this.dosisDeCafe--;
        this.vasosMaquina--;
        this.saldoMaquina += dineroIntroducido;
        this.saldoMaquina -= dineroIntroducido - PRECIO_CAFE_SOLO;
        return devolverCambio(dineroIntroducido, PRECIO_CAFE_SOLO);
    }

    public double servirLeche(double dineroIntroducido) throws MaquinaException2 {

        if (this.dosisDeLeche == 0 || this.vasosMaquina == 0) {
            throw new MaquinaException2("ERROR: Componentes insuficientes para servir leche");
        }

        this.dosisDeLeche--;
        this.vasosMaquina--;
        this.saldoMaquina += dineroIntroducido;
        this.saldoMaquina -= dineroIntroducido - PRECIO_LECHE_SOLA;
        return devolverCambio(dineroIntroducido, PRECIO_LECHE_SOLA);
    }

    public double servirCafeConLeche(double dineroIntroducido) throws MaquinaException2 {

        if (this.dosisDeLeche == 0 || this.dosisDeCafe == 0 || this.vasosMaquina == 0) {
            throw new MaquinaException2("ERROR: Componentes insuficientes para servir cafe con leche");
        }

        this.dosisDeLeche--;
        this.vasosMaquina--;
        this.dosisDeCafe--;
        this.saldoMaquina += dineroIntroducido;
        this.saldoMaquina -= dineroIntroducido - PRECIO_CAFE_CON_LECHE;
        return devolverCambio(dineroIntroducido, PRECIO_CAFE_CON_LECHE);
    }

    @Override
    public String toString() {
        return "Maquina2{" +
                "dosisDeCafe=" + dosisDeCafe +
                ", dosisDeLeche=" + dosisDeLeche +
                ", vasosMaquina=" + vasosMaquina +
                '}';
    }
}
