package boletin_2.ejercicio_persona;

import java.time.LocalDate;

public class Persona {

    //definicion de constantes
    private static final char[] listaLetrasDNI = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    //definicion de atributos
    private final String nombre;
    private final String DNI;
    private final char sexo;
    private double altura;
    private double peso;
    private final LocalDate fechaNacimiento;

    //constructor
    public Persona(String nombre, String DNI, char sexo, LocalDate fechaNacimiento, double altura, double peso) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getDNI() {
        return DNI + calculoLetraDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculoIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    private char calculoLetraDNI() {

        int DNI = Integer.parseInt(this.DNI);
        int resto = DNI % 23;

        return listaLetrasDNI[resto];
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", altura=" + altura +
                ", peso=" + peso +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
