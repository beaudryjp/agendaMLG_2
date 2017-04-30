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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

/**
 *
 * @author Jose
 */
@Named(value = "BD")
@ManagedBean
public class FakeBDbean implements Serializable{
    List<Usuario> usuarios;
    List<Evento> eventos;
    Map<Usuario, List<Evento>> siguiendo;
    List<Notificacion> notificaciones;
    
    public FakeBDbean()
    {
        
    }
    
    @PostConstruct
    public void init()
    {
        usuarios = new ArrayList<>();
        eventos = new ArrayList<>();
        siguiendo = new HashMap<>();
        notificaciones = new ArrayList<>();
        
        Usuario usuario = new Usuario("Susana", "LJ", "SLJ@gmail.com");
        usuario.setRol_usuario(Usuario.Tipo_Rol.REGISTRADO);
        usuario.setPassword_hash("potato");
        
        Usuario usuario1 = new Usuario("Marie", "Poppo", "Poppo@gmail.com");
        usuario1.setRol_usuario(Usuario.Tipo_Rol.REDACTOR);
        usuario1.setPassword_hash("potato");
        
        usuarios.add(usuario);
        usuarios.add(usuario1);
        
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
        
        Evento evento_1 = new Evento();
        evento_1.setTitulo("Presentacion de libro");
        evento_1.setDescripcion("Presentación del autor y su último libro: El libro de las sombras");
        evento_1.setFecha_inicio(new Date(2017, 7, 12));
        evento_1.setFecha_fin(new Date(2017, 7, 20));
        evento_1.setHorario("14:00 - 00:00");
        evento_1.setPrecio("一万￥");
        evento_1.setLatitud(30.7205713);
        evento_1.setLongitud(12*-4.4248549);
        evento_1.setLocalidad(localidad);
        
        
        eventos.add(evento_0);
        eventos.add(evento_1);
        
        Notificacion not_0 = new Notificacion();
        not_0.setMensaje("El evento ha cambiado.");
        not_0.setFecha(new java.sql.Date(System.currentTimeMillis()));
        not_0.setEvento(evento_0);
        not_0.setUsuario(usuario);
        
        Notificacion not_1 = new Notificacion();
        not_1.setMensaje("El evento se ha cancelado.");
        not_1.setFecha(new java.sql.Date(System.currentTimeMillis()));
        not_1.setEvento(evento_1);
        not_1.setUsuario(usuario1);
        
        notificaciones.add(not_0);
        notificaciones.add(not_1);
        
        List<Evento> eventos1 = new ArrayList<>();
        eventos1.add(evento_0);
        
        List<Evento> eventos2 = new ArrayList<>();
        eventos2.add(evento_1);
        
        siguiendo.put(usuario, eventos1);
        siguiendo.put(usuario1, eventos2);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public Map<Usuario, List<Evento>> getSiguiendo() {
        return siguiendo;
    }

    public void setSiguiendo(Map<Usuario, List<Evento>> siguiendo) {
        this.siguiendo = siguiendo;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }
    
}
