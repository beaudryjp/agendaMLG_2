/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupog.agendamlg.beans;

import grupog.agendamlg.entities.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Susana
 */
@Named(value = "login")
@RequestScoped
public class Usuariobean implements Serializable {

    private String email;
    private String contrasenia;
    private List<Usuario> usuarios;

    @Inject
    private ControlLog ctrl;
    @Inject
    private ConfigurationBean conf;

    public Usuariobean() {
        usuarios = new ArrayList<>();
        email = "Pepe@patata.com";
        contrasenia = "potato";
        Usuario usuario = new Usuario("Susana", "LJ", "SLJ@gmail.com");
        usuario.setRol_usuario(Usuario.Tipo_Rol.REGISTRADO);
        usuario.setPassword_hash("potato");

        Usuario usuario1 = new Usuario("Marie", "Poppo", "Poppo@gmail.com");
        usuario1.setRol_usuario(Usuario.Tipo_Rol.REDACTOR);
        usuario1.setPassword_hash("potato");

        Usuario usuario2 = new Usuario("Pepe", "Patata", "Pepe@patata.com");
        usuario2.setRol_usuario(Usuario.Tipo_Rol.VALIDADO);
        usuario2.setPassword_hash("potato");

        usuarios.add(usuario);
        usuarios.add(usuario1);
        usuarios.add(usuario2);

    }

    @PostConstruct

    public void init() {

    }

    public String getEmail() {
        return email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String autenticar() {

        String authentication_result_site = "login.xhtml";
        for (Usuario index_user : usuarios) {
            if (index_user.getEmail().equals(email) && index_user.getPassword_hash().equals(contrasenia)) {
                ctrl.setUsuario(index_user);
                conf.setControl(ctrl);
                conf.setUsuario(ctrl.getUsuario());
                authentication_result_site = ctrl.home();

                break;
            }
        }

        return authentication_result_site;
    }
}
