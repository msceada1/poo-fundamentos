package Ordenador;

public class PlacaBase {

    private String marca;
    private String chipset;
    private String socket;

    public PlacaBase(String marca, String socket, String chipset) {
        this.marca = marca;
        this.socket = socket;
        this.chipset = chipset;
    }

    public String getSocket() {
        return socket;
    }

    public boolean microprocesadorCompatible(Microprocesador microprocesador) {
        return socket.equals(microprocesador.getSocket());
    }

    @Override
    public String toString() {
        return "PlacaBase {" +
                " marca = ' " + marca + '\'' +
                ", chipset = ' " + chipset + '\'' +
                ", socket = ' " + socket + '\'' +
                '}';
    }
}
