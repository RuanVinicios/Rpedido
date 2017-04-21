/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Rpedido.mb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.Rpedido.dao.PedidoDAO;
import org.Rpedido.modelo.Pedido;

/**
 *
 * @author Ruan
 */
@Named(value = "ListarPedido")
@RequestScoped
public class ListarPedidoBean {        

    @Inject
    private PedidoDAO dao;
    private List<Pedido> pedido;

    @PostConstruct
    private void init(){
        this.pedido = dao.buscarTodos();
    }    
    
    public List<Pedido> getPedido(){
        return pedido;
    }
    
}