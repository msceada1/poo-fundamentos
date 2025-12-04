package boletin_3.mensajeria;

import java.util.Arrays;

public class Persona {

    private static final int CAPACIDAD_BUZON = 5;

    private String nombre;
    private Mensaje[] mensajesEnviados;
    private Mensaje[] mensajesRecibidos;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.mensajesEnviados = new Mensaje[CAPACIDAD_BUZON];
        this.mensajesRecibidos = new Mensaje[CAPACIDAD_BUZON];
    }

    /**
     * Metodo que llena el buzon si este no esta lleno por completo
     *
     * @param mensaje el mensaje enviado
     * @throws MensajeException si los buzones estan llenos o el asunto,cuerpo o destinatario valen null
     */
    public void enviarMensaje(Mensaje mensaje) throws MensajeException {
        if (buzonDeEnviosLleno()) {
            throw new MensajeException("ERROR: Tu buzon de envios está lleno, no puedes enviar mas mensajes");
        }

        if (buzonDeRecibimientosLleno()) {
            throw new MensajeException("ERROR: El buzon del destinatario está lleno, tu mensaje no puede ser enviado");
        }

        if (mensaje.getAsunto() == null) {
            throw new MensajeException("ERROR: el mensaje debe tener asunto");
        }

        if (mensaje.getCuerpo() == null) {
            throw new MensajeException("ERROR: el mensaje debe estar desarrollado");
        }

        if (mensaje.getDestinatario() == null) {
            throw new MensajeException("ERROR: el mensaje debe tener un destinatario");
        }

        for (int i = 0; i < mensajesEnviados.length; i++) {
            if (mensajesEnviados[i] == null) {
                mensajesEnviados[i] = mensaje;
                break;
            }
        }

        for (int i = 0; i < mensajesRecibidos.length; i++) {
            if (mensajesRecibidos[i] == null) {
                mensajesRecibidos[i] = mensaje;
                break;
            }
        }
    }

    /**
     * Metodo encargado de comprobar que el buzon de envios este lleno o no.
     *
     * @return {@code false} si encuentra un hueco disponible {@code false} en caso contrario
     */
    private boolean buzonDeEnviosLleno() {
        for (int i = 0; i < mensajesEnviados.length; i++) {
            if (mensajesEnviados[i] == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo encargado de comprobar que el buzon de recibimiento este lleno o no.
     *
     * @return {@code false} si encuentra un hueco disponible {@code false} en caso contrario
     */
    private boolean buzonDeRecibimientosLleno() {
        for (int i = 0; i < mensajesRecibidos.length; i++) {
            if (mensajesRecibidos[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void borrarMensajeEnviadoMasAntiguo() throws MensajeException {
        if (mensajesEnviados[0] == null) {
            throw new MensajeException("ERROR: El buzon ya está vacío");
        }

        Mensaje ultimoEliminado = mensajesEnviados[0];

        for (int i = 1; i < mensajesEnviados.length; i++) {
            mensajesEnviados[0] = null;
            mensajesEnviados[i - 1] = mensajesEnviados[i];
        }
        mensajesEnviados[mensajesEnviados.length - 1] = ultimoEliminado;
    }

    public void borrarMensajeRecibidoMasAntiguo() throws MensajeException {
        if (mensajesRecibidos[0] == null) {
            throw new MensajeException("ERROR: El buzon ya está vacío");
        }

        Mensaje ultimoEliminado = mensajesEnviados[0];

        for (int i = 1; i < mensajesRecibidos.length; i++) {
            mensajesRecibidos[0] = null;
            mensajesRecibidos[i - 1] = mensajesRecibidos[i];
        }
        mensajesRecibidos[mensajesRecibidos.length - 1] = ultimoEliminado;
    }

    /*
    public void borrarMensajeRecibidoMasAntiguo() {
        for (int i = 0; i < buzonMensajeRecibido.length - 1 && buzonMensajeRecibido[i] != null;  i++) {
            buzonMensajeRecibido[i] = buzonMensajeRecibido[i + 1];
        }
        buzonMensajeRecibido[buzonMensajeRecibido.length - 1] = null;

    }
     */

    @Override
    public String toString() {
        return "Persona{" +
                "mensajesRecibidos=" + Arrays.toString(mensajesRecibidos) +
                ", mensajesEnviados=" + Arrays.toString(mensajesEnviados) +
                '}';
    }
}
