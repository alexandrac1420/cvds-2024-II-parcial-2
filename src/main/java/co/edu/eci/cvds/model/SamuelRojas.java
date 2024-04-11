package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SAMUEL_ROJAS")
public class SamuelRojas {
    @Id
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "LETRA")
    private String letra;
    @Column(name = "ARGUMENTO")
    private String argumento;

    public SamuelRojas() {
    }

    public SamuelRojas(String numero, String letra, String argumento) {
        this.numero = numero;
        this.letra = letra;
        this.argumento = argumento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

}