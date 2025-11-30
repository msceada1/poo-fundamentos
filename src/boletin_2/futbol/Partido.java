package boletin_2.futbol;

public class Partido {

    private int jornada;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String estadio;
    private String ciudad;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;
    private String resultado;
    private char quiniela;
    private boolean jugado;

    public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisitante, String estadio, String ciudad) {
        //  jornadaValida(jornada);
        this.jornada = jornada;
        // sonMismosEquipos(equipoLocal, equipoVisitante);
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.estadio = estadio;
        this.ciudad = ciudad;
        this.jugado = false;
        this.golesEquipoLocal = 0;
        this.golesEquipoVisitante = 0;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setJugado() {
        this.jugado = true;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }

    public char getQuiniela() {
        return quiniela;
    }

    public void ponerResultado(String resultado) {
        String[] golesPartido = resultado.split("-");
        int golesLocal = Integer.parseInt(golesPartido[0].trim());
        int golesVisitante = Integer.parseInt(golesPartido[1].trim());
        this.golesEquipoLocal = golesLocal;
        this.golesEquipoVisitante = golesVisitante;

        if (golesLocal > golesVisitante) {
            this.quiniela = '1';
        } else if (golesLocal < golesVisitante) {
            this.quiniela = '2';
        } else {
            this.quiniela = 'X';
        }
    }

    private void jornadaValida(int numJornada) throws PartidoException {
        if (numJornada < 1 || numJornada > 38) {
            throw new PartidoException("ERROR: La jornada debe estar entre 1 y 38");
        }
    }

    public String toString() {
        if (!this.jugado) {
            return "El partido entre " + equipoLocal.getNombre() + " y " + equipoVisitante.getNombre() +
                    " no se ha jugado.";
        } else {
            return "Partido entre equipo local: " + this.equipoLocal.getNombre() + " y equipo visitante: " +
                    this.equipoVisitante.getNombre() + " jugado en el estadio " + getEstadio() + " en " + getCiudad() +
                    " ha finalizado con " + getGolesEquipoLocal() + " goles por parte del equipo local y " +
                    getGolesEquipoVisitante() + " goles por parte del equipo visitante. Resultado quiniela = "
                    + getQuiniela();
        }
    }

    private void sonMismosEquipos(Equipo nombreEquipo1, Equipo nombreEquipo2) throws PartidoException {

        if (nombreEquipo1.getNombre().equals(nombreEquipo2.getNombre())) {
            throw new PartidoException("El partido no se puede jugar porque los equipos son iguales");
        }
    }

    public void partidoJugado(Partido partido) throws PartidoException {
        jornadaValida(partido.jornada);
        sonMismosEquipos(partido.equipoLocal, partido.equipoVisitante);
    }
}
