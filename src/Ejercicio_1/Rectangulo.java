package Ejercicio_1;

public class Rectangulo {

    private int longitud;
    private int ancho;

    public Rectangulo(int ancho, int longitud) {
        this.ancho = ancho;
        this.longitud = longitud;
    }

    public Rectangulo(){
        ancho = 1;
        longitud = 1;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 0 && ancho < 20) {
            this.ancho = ancho;
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        if (longitud > 0 && longitud < 20) {
            this.longitud = longitud;
        }
    }

    public double calcularArea() {
        return this.longitud * this.ancho;
    }

    public double calcularPerimetro() {
        return (2 * ancho) + (2 * longitud);
    }
}
