package repaso_examen.avion;

import java.time.LocalDate;
import java.util.Arrays;

public class Avion {

    private final String marca;
    private final String modelo;
    private Deposito deposito;
    private RegistroDeRevisiones[] registros;

    public Avion(String marca, String modelo, Deposito deposito, RegistroDeRevisiones[] registros) {
        this.marca = marca;
        this.modelo = modelo;
        this.deposito = deposito;
        this.registros = registros;
    }

    public void setRegistros(RegistroDeRevisiones[] registros) {
        this.registros = registros;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    private boolean cantidadesCombustiblesAceptables() {
        return deposito.getCantidadActual() > 0 && deposito.getMAX_CAPACIDAD() > 0;
    }

    private boolean registroCorrecto() {
        if (this.registros == null || this.registros.length == 0) {
            return false;
        }

        return registros[registros.length - 1].getEstado().equalsIgnoreCase("Correcto");
    }

    private boolean tieneFechaDeRevision() {
        return registros[registros.length - 1].getFechaDeRevision() != null;
    }

    private boolean estaDentroDelPeriodoDeValidez(LocalDate fechaViaje) {
        return !this.registros[registros.length - 1].getPeriodoDeValidez().isBefore(fechaViaje);
    }

    public void avionCualificado(LocalDate fechaViaje) throws AvionException {
        if (!cantidadesCombustiblesAceptables()) {
            throw new AvionException("El deposito no es adecuado");
        }

        if (!registroCorrecto()) {
            throw new AvionException("El estado del avion es incorrecto");
        }

        if (!tieneFechaDeRevision()) {
            throw new AvionException("ERROR: el avion no tiene fecha de registro");
        }

        if (!estaDentroDelPeriodoDeValidez(fechaViaje)) {
            throw new AvionException("El viaje no se puede realizar porque la fecha de validez es menor a la del viaje");
        }

        System.out.println("Viaje adecuado para realizar");
    }

    public void agregarRegistro(RegistroDeRevisiones nuevoRegistro) {
        RegistroDeRevisiones[] nuevoRegistroTotal = Arrays.copyOf(this.registros, this.registros.length + 1);

        nuevoRegistroTotal[nuevoRegistroTotal.length - 1] = nuevoRegistro;

        setRegistros(nuevoRegistroTotal);
    }

    @Override
    public String toString() {
        return "Avion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", deposito=" + deposito.getCantidadActual() +
                ", registro=" + Arrays.toString(registros) +
                '}';
    }
}
