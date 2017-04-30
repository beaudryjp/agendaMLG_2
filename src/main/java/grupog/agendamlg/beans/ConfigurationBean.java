/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupog.agendamlg.beans;

import grupog.agendamlg.entities.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 * @author Susana
 */

@ManagedBean(name = "configuracion")
@ViewScoped
public class ConfigurationBean implements Serializable {
    private Usuario usuario;
    private String email;
    private String nombre;
    private String contrasenia;
    private String contrasenia2;

    public ConfigurationBean()
    {
        
    }
    
    public String getContrasenia2() {
        return contrasenia2;
    }

    public void setContrasenia2(String contrasenia2) {
        this.contrasenia2 = contrasenia2;
    }
    @Inject
    private ControlLog ctrl;
    
    public void setControl(ControlLog con){
        ctrl = con;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
     public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public void modificar (){
        if(!email.isEmpty()){
            ctrl.getUsuario().setEmail(email);
        } 
        if (!nombre.isEmpty()){
            ctrl.getUsuario().setNombre(nombre);
        }
        if(!contrasenia.isEmpty() && !contrasenia2.isEmpty() && contrasenia.equals(contrasenia2)){
            ctrl.getUsuario().setPassword_hash(contrasenia);
        }
        System.out.println("usuario");
    } 
}
