package repaso_examen.aves;

import java.time.LocalDate;

public class Ave {
    private String nombre;
    private String id;
    private int cantidadAlimento;
    private String origen;
    private LocalDate fechaEntrada;

    public Ave(String nombre, int cantidadAlimento, String origen) {
        this.nombre = nombre;
        this.cantidadAlimento = cantidadAlimento;
        this.origen = origen;
    }

    StringBuilder sb = new StringBuilder();

    private void generarVocalId() {

    }
}
