/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupog.agendamlg.beans;

import grupog.agendamlg.entities.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author James
 */
@Named(value = "notification")
@RequestScoped
public class NotificationBean implements Serializable {

    List<Notificacion> notificaciones;

    public NotificationBean() {
    }

    @PostConstruct
    public void init() {
        notificaciones = new ArrayList<>();

        Notificacion not_0 = new Notificacion();
        not_0.setMensaje("ポテートが好きです");

        notificaciones.add(not_0);
    }

    public void dissapear(Notificacion not) {
        Notificacion remove = null;
        for (Notificacion n : notificaciones) {
            if (n.equals(not)) {
                remove = not;
                break;
            }
        }
        if (remove != null) {
            notificaciones.remove(remove);
        }
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

}
