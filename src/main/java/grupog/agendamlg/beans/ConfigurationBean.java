/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupog.agendamlg.beans;

import grupog.agendamlg.entities.Usuario;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Susana
 */

@Named(value = "configuracion")
@RequestScoped
public class ConfigurationBean implements Serializable {
    private Usuario usuario;
    private String email;
    private String nombre;
    private String contrasenia;
    private String contrasenia2;

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
    
    public void Modificar (){
        if(!email.isEmpty()){
            usuario.setEmail(email);
        } 
        if (!nombre.isEmpty()){
            usuario.setNombre(nombre);
        }
        if(!contrasenia.isEmpty() && !contrasenia2.isEmpty() && contrasenia.equals(contrasenia2)){
            usuario.setPassword_hash(contrasenia);
        }
        ctrl.setUsuario(usuario);
    } 
}
