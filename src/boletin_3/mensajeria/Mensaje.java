package boletin_3.mensajeria;

import utils.MiEntradaSalida;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mensaje {

    private String asunto;
    private String cuerpo;
    private LocalDate fecha;
    private Persona remitente;
    private Persona destinatario;

    public Mensaje(String asunto, String cuerpo, Persona remitente, Persona destinatario) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }


}
