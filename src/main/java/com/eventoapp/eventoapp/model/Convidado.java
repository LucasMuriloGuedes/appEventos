package com.eventoapp.eventoapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Convidado implements Serializable {
    @Id
    private Long rg;
    private String nomeConvidado;

    @ManyToOne
    private Evento evento;


    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
