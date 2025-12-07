package repaso_examen.avion;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Deposito deposito = new Deposito(700, 700);
        RegistroDeRevisiones registroDeRevisiones = new RegistroDeRevisiones(LocalDate.of(2020, 10, 23),
                "Correcto", LocalDate.of(2025, 1, 1));
        Avion avion = new Avion("Airbus", "A320", deposito, new RegistroDeRevisiones[]{registroDeRevisiones});

        hacerViaje(LocalDate.of(2019, 2, 7), avion, 500);

        System.out.println(avion);
    }

    private static void hacerViaje(LocalDate fechaViaje, Avion avion, int combustibleRequerido) {
        try {
            avion.avionCualificado(fechaViaje);
            int combustibleGastado = avion.getDeposito().getCantidadActual() - combustibleRequerido;
            avion.getDeposito().setCantidadActual(combustibleGastado);
        } catch (AvionException e) {
            System.out.println(e.getMessage());
        }
    }
}
