/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupog.agendamlg.beans;

import grupog.agendamlg.entities.Evento;
import grupog.agendamlg.entities.Localidad;
import grupog.agendamlg.entities.Provincia;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Susana
 */
@ViewScoped
@ManagedBean(name = "tareas")
public class TareasBean implements Serializable {

    private List<Evento> pendiente;

    public TareasBean() {
    }

    @PostConstruct

    public void init() {

        pendiente = new ArrayList<>();

        Provincia provincia = new Provincia();
        provincia.setNombre("Malaga");

        Localidad localidad = new Localidad();
        localidad.setNombre("Malaga");
        localidad.setProvincia(provincia);

        Evento evento_0 = new Evento();
        evento_0.setId_evento(0L);
        evento_0.setTitulo("Mari Carmen y sus muñecos");
        evento_0.setDescripcion("Actuación de una ventrílocua española");
        evento_0.setFecha_inicio(new Date(2017, 6, 1));
        evento_0.setFecha_fin(new Date(2017, 6, 3));
        evento_0.setHorario("10:00 - 14:00");
        evento_0.setPrecio("3€");
        evento_0.setLatitud(36.7203713);
        evento_0.setLongitud(-4.4248549);
        evento_0.setLocalidad(localidad);

        Evento evento_1 = new Evento();
        evento_0.setId_evento(1L);
        evento_1.setTitulo("Presentacion de libro");
        evento_1.setDescripcion("Presentación del autor y su último libro: El libro de las sombras");
        evento_1.setFecha_inicio(new Date(2017, 7, 12));
        evento_1.setFecha_fin(new Date(2017, 7, 20));
        evento_1.setHorario("14:00 - 00:00");
        evento_1.setPrecio("一万￥");
        evento_1.setLatitud(30.7205713);
        evento_1.setLongitud(12 * -4.4248549);
        evento_1.setLocalidad(localidad);

        pendiente.add(evento_0);
        pendiente.add(evento_1);

    }

    public List<Evento> getPendiente() {
        return pendiente;
    }

    public void setPendiente(List<Evento> pendiente) {
        this.pendiente = pendiente;
    }

    public void approve(Evento e) {
        System.out.println(e);
        System.out.println(pendiente);
        pendiente.remove(e);
        System.out.println(pendiente);
    }

}
