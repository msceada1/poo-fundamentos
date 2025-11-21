package Ordenador;

public class OrdenadorApp {

    public static void main(String[] args) {

        DiscoDuro discoDuro = new DiscoDuro("Kingston", "SSD", 500);
        TarjetaGrafica tarjetaGrafica = new TarjetaGrafica("Sapphire", "RADEON RX 9070 XT", 4, 20.00, 16);
        Microprocesador microprocesador = new Microprocesador("Intel", 3.4, "Core i7-6700", 4, "LGA1151");
        PlacaBase placaBase = new PlacaBase("MSI", "LGA1151", "AMD B850");

        System.out.println("Vamos a empezar a montar el primer ordenador. Comprobaremos si el socket de la placa base es igual" +
                "que el socket del microprocesador");

        try {
            if (!placaBase.microprocesadorCompatible(microprocesador)) {
                throw new OrdenadorException("ERROR: el socket de la placa base y el microprocesador deben ser iguales");
            }
            System.out.println("Los componentes del ordenador y su informacion: ");
            System.out.println(discoDuro);
            System.out.println(tarjetaGrafica);
            System.out.println(microprocesador);
            System.out.println(placaBase);
            System.out.println("¡ORDENADOR MONTADO CON ÉXITO!");
        } catch (OrdenadorException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Vamos a empezar a montar el segundo ordenador. Comprobaremos si el socket de la placa base es " +
                "igual que el socket del microprocesador");

        DiscoDuro discoDuro1 = new DiscoDuro("Kingston", "SSD", 500);
        TarjetaGrafica tarjetaGrafica1 = new TarjetaGrafica("Sapphire", "RADEON RX 9070 XT", 4, 20.00, 16);
        Microprocesador microprocesador1 = new Microprocesador("Intel", 3.4, "Core i7-6700", 4, "LGA1151");
        PlacaBase placaBase1 = new PlacaBase("MSI", "LGA1153", "AMD B850");

        try {
            if (!placaBase1.microprocesadorCompatible(microprocesador1)) {
                throw new OrdenadorException("ERROR: el socket de la placa base y el microprocesador deben ser iguales");
            }
        } catch (OrdenadorException e) {
            System.out.println(e.getMessage());
        }
    }

}
