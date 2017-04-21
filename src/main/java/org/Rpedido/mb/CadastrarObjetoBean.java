/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Rpedido.mb;

import org.Rpedido.dao.ObjetoDAO;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.Rpedido.modelo.Objeto;
import org.Rpedido.dao.ObjetoDAO;
import org.Rpedido.modelo.Objeto;
        

/**
 *
 * @author Ruan
 */

@Named(value = "mbCadastrarObjeto")
@RequestScoped
public class CadastrarObjetoBean {
    
    Objeto objeto = new Objeto();
    
    @Inject
    private   ObjetoDAO objetoDAO;
    
    public void adicionar(){
        objetoDAO.adicionar(objeto);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastrado"));
    //System.out.println(objeto);
    } 
    
    public Objeto getObjeto(){
        return objeto; 
    }
   
}
