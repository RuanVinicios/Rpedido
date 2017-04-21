/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Rpedido.mb;

import org.Rpedido.dao.RequerinteDAO;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.Rpedido.modelo.Requerinte;
import org.Rpedido.dao.RequerinteDAO;
import org.Rpedido.modelo.Requerinte;
        

/**
 *
 * @author Ruan
 */

@Named(value = "mbCadastrarRequerinte")
@RequestScoped
public class CadastrarRequerinteBean {
    
    Requerinte requerinte = new Requerinte();
    
    @Inject
    private RequerinteDAO requerinteDAO;
    
    public void adicionar(){
        requerinteDAO.adicionar(requerinte);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastrado"));
    //System.out.println(requerinte);
    } 
    
    public Requerinte getRequerinte(){
        return requerinte; 
    }
    
}
