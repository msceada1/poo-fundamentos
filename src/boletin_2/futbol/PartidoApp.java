package boletin_2.futbol;

public class PartidoApp {

    public static void main(String[] args) {

        System.out.println("Bienvenido al juego de la liga. Vamos a empezar a crear los equipos");

        Equipo equipo1 = new Equipo("Liverpool");
        Equipo equipo2 = new Equipo("Manchester United");
        Equipo equipo3 = new Equipo("Chelsea");

        jugarPartido(23, equipo3, equipo2, "Anfield", "Liverpool");
        System.out.println("Proximo partido: ");
        jugarPartido(12, equipo1, equipo2, "Anfield", "Liverpool");
    }

    private static void jugarPartido(int jornada, Equipo equipoLocal, Equipo equipoVisitante, String estadio, String ciudad) {

        Partido partido = new Partido(jornada, equipoLocal, equipoVisitante, estadio, ciudad);

        try {
            partido.partidoJugado(partido);
            System.out.println(partido);
            System.out.println("Partido en progreso... ¡Finalizado!");
            partido.setJugado();
            int resultadoLocal = (int) (Math.random() * 6);
            int resultadoVisitante = (int) (Math.random() * 6);
            String resultado = Integer.toString(resultadoLocal) + "-" + Integer.toString(resultadoVisitante);
            partido.ponerResultado(resultado);
            System.out.println(partido);
        } catch (PartidoException e) {
            System.out.println(e.getMessage());
        }

    }
}
