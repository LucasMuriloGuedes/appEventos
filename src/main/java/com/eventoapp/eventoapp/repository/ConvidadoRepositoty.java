package com.eventoapp.eventoapp.repository;

import com.eventoapp.eventoapp.model.Convidado;
import com.eventoapp.eventoapp.model.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepositoty extends CrudRepository<Convidado, String> {

    Iterable<Convidado> findByEvento(Evento evento);

}
