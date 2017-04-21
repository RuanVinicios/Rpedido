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
import org.Rpedido.dao.ObjetoDAO;
import org.Rpedido.modelo.Objeto;

/**
 *
 * @author Ruan
 */
@Named(value = "ListarObjeto")
@RequestScoped
public class ListarObjetoBean {        

    @Inject
    private ObjetoDAO dao;
    private List<Objeto> objeto;

    @PostConstruct
    private void init(){
        this.objeto = dao.buscarTodos();
    }    
    
    public List<Objeto> getObjeto(){
        return objeto;
    }
    
}