package repaso_examen.avion;

public class Deposito {

    private final int MAX_CAPACIDAD; //inmutable
    private int cantidadActual;

    public Deposito(int MAX_CAPACIDAD, int cantidadActual) {
        this.MAX_CAPACIDAD = MAX_CAPACIDAD;
        this.cantidadActual = cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getMAX_CAPACIDAD() {
        return MAX_CAPACIDAD;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
}
