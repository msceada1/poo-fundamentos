package boletin_2.linea;

public class Linea {

    private Punto puntoA;
    private Punto puntoB;

    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "puntoA=" + (puntoA.getPosEjeX() + "," + puntoA.getPosEjeY()) +
                ", puntoB=" + (puntoB.getPosEjeX() + "," + puntoB.getPosEjeY()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Linea linea = (Linea) o;
        return puntoA.equals(linea.puntoA) && puntoB.equals(linea.puntoB);
    }

    @Override
    public int hashCode() {
        int result = puntoA.hashCode();
        result = 31 * result + puntoB.hashCode();
        return result;
    }
}
