package boletin_3.mensajeria;

public class Principal {

    public static void main(String[] args) {
        Persona remitente = new Persona("Manuel");
        Persona destinatario = new Persona("José");
        String asunto = "Chill plan";
        String cuerpo = "Mañana a las diez en el casino para unos dardos y un futbolin";

        generarMensaje(asunto, cuerpo, remitente, destinatario);
    }

    private static void generarMensaje(String asunto, String cuerpo, Persona remitente, Persona destinatario) {
        Mensaje mensaje = new Mensaje(asunto, cuerpo, remitente, destinatario);

        try {
            remitente.enviarMensaje(mensaje);
            System.out.println(remitente);
        } catch (MensajeException e) {
            System.out.println(e.getMessage());
        }
    }
}
