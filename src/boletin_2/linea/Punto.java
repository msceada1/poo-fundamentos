package boletin_2.linea;

public class Punto {

    private double posEjeX;
    private double posEjeY;

    public Punto(double posEjeX, double posEjeY) {
        this.posEjeX = posEjeX;
        this.posEjeY = posEjeY;
    }

    public double getPosEjeX() {
        return posEjeX;
    }

    public void setPosEjeX(double posEjeX) {
        this.posEjeX = posEjeX;
    }

    public double getPosEjeY() {
        return posEjeY;
    }

    public void setPosEjeY(double posEjeY) {
        this.posEjeY = posEjeY;
    }

    /**
     * Metodo que desplaza el eje x a la derecha
     *
     * @param nuevaPosEjeX el desplazamiento que desea hacer el usuario
     * @throws LineaException si la nueva posicion es igual o menor que la que ya tiene
     */
    public void moverDerecha(double nuevaPosEjeX) throws LineaException {

        if (nuevaPosEjeX <= this.posEjeX) {
            throw new LineaException("ERROR: Te has mantenido o has introducido una posicion inferior a la que estás");
        }

        this.posEjeX = nuevaPosEjeX;
    }

    /**
     * Metodo que desplaza el eje x a la izquierda
     *
     * @param nuevaPosEjeX el desplazamiento que desea hacer el usuario
     * @throws LineaException si la nueva posicion es igual o mayor que la que ya tiene
     */
    public void moverIzquierda(double nuevaPosEjeX) throws LineaException {

        if (nuevaPosEjeX >= this.posEjeX) {
            throw new LineaException("ERROR: Te has mantenido o has introducido una posicion superior a la que estas");
        }

        this.posEjeX = nuevaPosEjeX;
    }

    /**
     * Metodo que desplaza el eje y a la derecha
     *
     * @param nuevaPosEjeY el desplazamiento que desea hacer el usuario
     * @throws LineaException si la nueva posicion es igual o menor a la que ya tiene
     */
    public void moverArriba(double nuevaPosEjeY) throws LineaException {

        if (nuevaPosEjeY <= this.posEjeY) {
            throw new LineaException("ERROR: No puedes mantenerte o introducir una posicion inferior a la que está");
        }

        this.posEjeY = nuevaPosEjeY;
    }

    /**
     * metodo que desplaza el eje y a la izquierda
     *
     * @param nuevaPosEjeY el desplazamiento que desea hacer el usuario
     * @throws LineaException si la nueva posicion es igual o mayor a la que ya tiene
     */
    public void moverAbajo(double nuevaPosEjeY) throws LineaException {

        if (nuevaPosEjeY >= this.posEjeY) {
            throw new LineaException("ERROR: No puedes mantenerte o introducir una posicion superior a la que estás");
        }

        this.posEjeY = nuevaPosEjeY;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Punto punto = (Punto) o;
        return Double.compare(posEjeX, punto.posEjeX) == 0 && Double.compare(posEjeY, punto.posEjeY) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(posEjeX);
        result = 31 * result + Double.hashCode(posEjeY);
        return result;
    }
}
