/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Rpedido.mb;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Ruan
 */
@Named
@RequestScoped
public class LoginBean {

    @Inject
    private Usuario usuario;

    private String nomeUsuario;
    private String senha;

    public String login() {
        FacesContext context = FacesContext.getCurrentInstance();

        if ("admin".equals(this.nomeUsuario) && "123".equals(this.senha)) {
            this.usuario.setNome(this.nomeUsuario);
            this.usuario.setDataLogin(new Date());

            return "/template?faces-redirect=true";
        } else {
            FacesMessage mensagem = new FacesMessage("Usuário/senha inválidos!");
            mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(null, mensagem);
        }
        return null;
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/Login?faces-redirect=true";
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
