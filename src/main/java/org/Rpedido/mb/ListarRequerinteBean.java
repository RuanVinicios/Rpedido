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
import org.Rpedido.dao.RequerinteDAO;
import org.Rpedido.modelo.Requerinte;

/**
 *
 * @author Ruan
 */
@Named(value = "ListarRequerinte")
@RequestScoped
public class ListarRequerinteBean {        

    @Inject
    private RequerinteDAO dao;
    private List<Requerinte> requerinte;

    @PostConstruct
    private void init(){
        this.requerinte = dao.buscarTodos();
    }    
    
    public List<Requerinte> getRequerinte(){
        return requerinte;
    }
    
}