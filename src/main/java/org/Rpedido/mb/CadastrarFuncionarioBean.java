/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Rpedido.mb;

import org.Rpedido.dao.FuncionarioDAO;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.Rpedido.modelo.Funcionario;
import org.Rpedido.dao.FuncionarioDAO;
import org.Rpedido.modelo.Funcionario;
        

/**
 *
 * @author Ruan
 */

@Named(value = "mbCadastrarFuncionario")
@RequestScoped
public class CadastrarFuncionarioBean {
    
    Funcionario funcionario = new Funcionario();
    
    @Inject
    private   FuncionarioDAO funcionarioDAO;
    
    public void adicionar(){
        funcionarioDAO.adicionar(funcionario);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastrado"));
    //System.out.println(funcionario);
    } 
    
    public Funcionario getFuncionaio(){
        return funcionario; 
    }
   
}
