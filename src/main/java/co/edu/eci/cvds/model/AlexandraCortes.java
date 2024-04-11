package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALEXANDRA_CORTES")
public class AlexandraCortes {
    @Id
    @Column(name = "PREGUNTA")
    private String pregunta;
    @Column(name = "RESPUESTA")
    private String respuesta;
    @Column(name = "JUSTIFICACION")
    private String justificacion;

    public AlexandraCortes() {
    }

    public AlexandraCortes(String pregunta, String respuesta, String justificacion) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.justificacion = justificacion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

}