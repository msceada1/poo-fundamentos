package repaso_examen.avion;

import java.time.LocalDate;

public class RegistroDeRevisiones {

    private LocalDate fechaDeRevision;
    private String estado;
    private LocalDate periodoDeValidez;

    public RegistroDeRevisiones(LocalDate fechaDeRevision, String estado, LocalDate periodoDeValidez) {
        this.fechaDeRevision = fechaDeRevision;
        this.estado = estado;
        this.periodoDeValidez = periodoDeValidez;
    }

    public LocalDate getFechaDeRevision() {
        return fechaDeRevision;
    }

    public LocalDate getPeriodoDeValidez() {
        return periodoDeValidez;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "RegistroDeRevisiones{" +
                "fechaDeRevision=" + fechaDeRevision +
                ", estado='" + estado + '\'' +
                ", periodoDeValidez=" + periodoDeValidez +
                '}';
    }
}
