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

    private double devolverCambio(double dineroIntroducido, double precioProducto) {

        if (!hayCambioDisponible(dineroIntroducido)) {
            System.out.println("No se dispone de cambio para la cantidad introducida");
            return 0.00;
        }

        this.saldoMaquina += dineroIntroducido;
        this.saldoMaquina -= dineroIntroducido - precioProducto;
        System.out.println("Recoja su cambio : " + (this.saldoMaquina - precioProducto));
        return dineroIntroducido - precioProducto;
    }

    public void servirCafeSolo(double dineroIntroducido) {

        if (devolverCambio(dineroIntroducido, PRECIO_CAFE_SOLO) != 0.00) {
            System.out.println("Sirviendo café solo... Café servido con éxito");
            devolverCambio(dineroIntroducido, PRECIO_CAFE_SOLO);
            this.dosisDeCafe--;
            this.vasosMaquina--;
        }
    }

    public void servirLecheSola(double dineroIntroducido) {

        if (devolverCambio(dineroIntroducido, PRECIO_LECHE_SOLA) != 0.00) {
            System.out.println("sirviendo leche sola... Leche servida con éxito");
            devolverCambio(dineroIntroducido, PRECIO_LECHE_SOLA);
            this.dosisDeLeche--;
            this.vasosMaquina--;
        }
    }

    public void servirCafeConLeche(double dineroIntroducido) {

        if (devolverCambio(dineroIntroducido, PRECIO_CAFE_CON_LECHE) != 0) {
            System.out.println("Sirviendo cafe con leche... Cafe con leche servido con exito");
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
            System.out.println("deposito de vasos llenados con exito");
        } else {
            System.out.println("el deposito de vasos esta lleno");
        }

        if (this.dosisDeCafe != CAPACIDAD_DEPOSITO_CAFE) {
            int dosisDeCafeQueFaltan = CAPACIDAD_DEPOSITO_CAFE - this.dosisDeCafe;
            this.dosisDeCafe += dosisDeCafeQueFaltan;
            System.out.println("deposito de cafe llenado con exito");
        } else {
            System.out.println("El deposito de cafe ya esta lleno");
        }

        if (this.dosisDeLeche != CAPACIDAD_DEPOSITO_LECHE) {
            int dosisDeLecheQueFaltan = CAPACIDAD_DEPOSITO_LECHE - this.dosisDeLeche;
            this.dosisDeLeche += dosisDeLecheQueFaltan;
            System.out.println("deposito de cafe llenado con exito");
        } else {
            System.out.println("el deposito de leche ya esta lleno");
        }
    }


}
