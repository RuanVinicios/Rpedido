/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Rpedido.mb;

import org.Rpedido.dao.ProdutoDAO;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.Rpedido.modelo.Produto;
import org.Rpedido.dao.ProdutoDAO;
        

/**
 *
 * @author Ruan
 */

@Named(value = "mbCadastrarProduto")
@RequestScoped
public class CadastrarProdutoBean {
    
    Produto produto = new Produto();
    
    @Inject
    private ProdutoDAO produtoDAO;
    
    public void adicionar(){
        produtoDAO.adicionar(produto);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Salvo com sucesso"));
    } 
    
    public Produto getProduto(){
        return produto; 
    }
    
   
}
