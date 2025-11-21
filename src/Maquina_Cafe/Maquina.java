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

    //constructor
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

    /**
     * Metodo que se encarga de devolver el cambio al usuario comprobando previamente que dispone de cambio
     * para la cantidad introducida y que el credito sea mayor o igual al precio del producto
     *
     * @param dineroIntroducido el crédito introducido por el usuario
     * @param precioProducto    el precio del producto que el usuario ha seleccionado
     * @return el cambio para el usuario
     * @throws MaquinaException si la maquina no dispone de cambio suficiente o si el dinero introducido es
     *                          menor que el precio del producto
     */
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

    /**
     * Metodo que sirve el cafe al usuario y le devuelve su cambio.
     *
     * @param dineroIntroducido el credito que el usuario introduce
     * @return el cambio para el usuario
     * @throws MaquinaException si la maquina no dispone de vasos o dosis de cafe suficientes
     */
    public double servirCafeSolo(double dineroIntroducido) throws MaquinaException {

        if (this.dosisDeCafe == 0 || this.vasosMaquina == 0) {
            throw new MaquinaException("No hay componentes suficientes para servir el cafe");
        }

        double cambio = devolverCambio(dineroIntroducido, PRECIO_CAFE_SOLO);
        this.vasosMaquina--;
        this.dosisDeCafe--;
        return cambio;
    }

    /**
     * metodo que sirve la leche al usuario y le devuelve el cambio
     *
     * @param dineroIntroducido el credito que introduce el usuario
     * @return el cambio para el usuario
     * @throws MaquinaException si la maquina no dispone de vasos o dosis de leche suficiente
     */
    public double servirLecheSola(double dineroIntroducido) throws MaquinaException {

        if (this.dosisDeLeche == 0 || this.vasosMaquina == 0) {
            throw new MaquinaException("No hay componentes suficientes para servir la leche");
        }

        double cambio = devolverCambio(dineroIntroducido, PRECIO_LECHE_SOLA);
        this.vasosMaquina--;
        this.dosisDeLeche--;
        return cambio;
    }

    /**
     * metodo que sirve el cafe con leche al usuario y devuelve su cambio
     *
     * @param dineroIntroducido el credito que introduce el usuario
     * @throws MaquinaException si la maquina no dipone de vasos o dosis de cafe y leche suficientes
     * @returnel el cambio para el usuario
     */
    public double servirCafeConLeche(double dineroIntroducido) throws MaquinaException {

        if (this.dosisDeLeche == 0 || this.dosisDeCafe == 0 || this.vasosMaquina == 0) {
            throw new MaquinaException("No hay componentes suficientes para servir cafe con leche");
        }

        double cambio = devolverCambio(dineroIntroducido, PRECIO_CAFE_CON_LECHE);
        this.vasosMaquina--;
        this.dosisDeCafe--;
        this.dosisDeLeche--;
        return cambio;
    }

    private void llenarDepositos() {

        boolean sinExistencias = false;

        if (this.vasosMaquina == 0 || this.dosisDeCafe == 0 || this.dosisDeLeche == 0) {
            sinExistencias = true;
        }

        while (sinExistencias) {
            this.vasosMaquina += CAPACIDAD_DEPOSITO_VASOS - this.vasosMaquina;
            this.dosisDeLeche += CAPACIDAD_DEPOSITO_LECHE - this.dosisDeLeche;
            this.dosisDeCafe += CAPACIDAD_DEPOSITO_CAFE - this.dosisDeCafe;
        }
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "Dosis de café = " + dosisDeCafe +
                ", Dosis de leche = " + dosisDeLeche +
                ", Vasos disponibles = " + vasosMaquina +
                '}';
    }
}
