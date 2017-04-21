/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Rpedido.mb;

import org.Rpedido.dao.PedidoDAO;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.Rpedido.modelo.Pedido;
import org.Rpedido.dao.PedidoDAO;
import org.Rpedido.modelo.Pedido;
        

/**
 *
 * @author Ruan
 */

@Named(value = "mbCadastrarPedido")
@RequestScoped
public class CadastrarPedidoBean {
    
    Pedido pedido = new Pedido();
    
    @Inject
    private   PedidoDAO pedidoDAO;
    
    public void adicionar(){
        pedidoDAO.adicionar(pedido);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastrado"));
    //System.out.println(pedido);
    } 
    
    public Pedido getPedido(){
        return pedido; 
    }
   
}
