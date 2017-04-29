/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupog.agendamlg.beans;

import grupog.agendamlg.entities.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author James
 */
@Named(value = "evento")
@RequestScoped
public class EventoBean implements Serializable {

    private List<Evento> eventos;
    private List<Etiqueta> etiquetas;
    private List<Destinatario> destinatarios;
    private Date fecha;
    
    public EventoBean() {}

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Destinatario> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<Destinatario> destinatarios) {
        this.destinatarios = destinatarios;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @PostConstruct
    public void init() {
        eventos = new ArrayList<>();
        etiquetas = new ArrayList<>();
        destinatarios = new ArrayList<>();
        
        Provincia provincia = new Provincia();
        provincia.setNombre("Malaga");
        
        Localidad localidad = new Localidad();
        localidad.setNombre("Malaga");
        localidad.setProvincia(provincia);
        
        Evento evento_0 = new Evento();
        evento_0.setTitulo("Murakami");
        evento_0.setDescripcion("Presentación del autor y su último libro: Kishi dancho koroshi");
        evento_0.setFecha_inicio(new Date(2017, 6, 1));
        evento_0.setFecha_fin(new Date(2017, 6, 3));
        evento_0.setHorario("10:00 - 11:00");
        evento_0.setPrecio("Gratis");
        evento_0.setLatitud(36.7203713);
        evento_0.setLongitud(-4.4248549);
        evento_0.setLocalidad(localidad);
        
        eventos.add(evento_0);
        eventos.add(evento_0);
        
        
        
        Etiqueta actos_academicos = new Etiqueta();
        Etiqueta conciertos = new Etiqueta();
        Etiqueta espectaculo = new Etiqueta();
        
        actos_academicos.setNombre("Actos academicos");
        conciertos.setNombre("Conciertos");
        espectaculo.setNombre("Espectaculo");
        
        Destinatario ancianos = new Destinatario();
        Destinatario ninios = new Destinatario();
        Destinatario todos = new Destinatario();
        
        ancianos.setDescripcion("Ancianos");
        ninios.setDescripcion("Niños");
        todos.setDescripcion("Todos");
    }

}
