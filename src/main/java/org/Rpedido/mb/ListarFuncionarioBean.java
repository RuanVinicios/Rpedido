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
import org.Rpedido.dao.FuncionarioDAO;
import org.Rpedido.modelo.Funcionario;

/**
 *
 * @author Ruan
 */
@Named(value = "ListarFuncionarios")
@RequestScoped
public class ListarFuncionarioBean {        

    @Inject
    private FuncionarioDAO dao;
    private List<Funcionario> funcionario;

    @PostConstruct
    private void init(){
        this.funcionario = dao.buscarTodos();
    }    
    
    public List<Funcionario> getFuncionario(){
        return funcionario;
    }
    
}
