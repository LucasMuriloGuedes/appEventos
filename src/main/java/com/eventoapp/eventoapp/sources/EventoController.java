package com.eventoapp.eventoapp.sources;

import com.eventoapp.eventoapp.model.Evento;
import com.eventoapp.eventoapp.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {

    @Autowired
    private EventoRepository repository;

    @RequestMapping(value = "/cadastrarevento", method = RequestMethod.GET)
    public String form(){
        return "evento/formEvento";
    }
    @RequestMapping(value = "/cadastrarevento", method = RequestMethod.POST)
    public String form(Evento evento){
        repository.save(evento);
        return "redirect:/cadastrarevento";
    }
    @RequestMapping("/evento")
    public ModelAndView listaEventos(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Evento> eventos = repository.findAll();
        mv.addObject("eventos", eventos);
        return mv;
    }
}
