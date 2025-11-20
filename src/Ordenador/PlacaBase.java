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

    public String getMarca() {
        return marca;
    }

    public String getChipset() {
        return chipset;
    }

    public String getSocket() {
        return socket;
    }

    public boolean microprocesadorCompatible(Microprocesador microprocesador) throws OrdenadorException {

        if (!getSocket().equalsIgnoreCase(microprocesador.getSocket())) {
            throw new OrdenadorException("¡ERROR!: El socket de la placa base debe ser igual al del microprocesador");
        }

        return true;
    }
}
