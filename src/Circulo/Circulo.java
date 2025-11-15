package Circulo;

public class Circulo {

    private float radio;

    public Circulo() {
        this.radio = 5;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if (radio > 0 && radio <= 10) {
            this.radio = radio;
        }
    }

    public double calcularCircunferencia() {

        return 2 * Math.PI * radio;
    }

    public double calcularArea() {

        return Math.PI * Math.pow(this.radio, 2);
    }

}
