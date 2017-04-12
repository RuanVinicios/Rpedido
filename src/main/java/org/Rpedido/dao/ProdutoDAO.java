package org.Rpedido.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.Rpedido.modelo.Produto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruan
 */
public class ProdutoDAO {
    
    @PersistenceContext
    private EntityManager manager;

    /**
     *
     * @param produto
     */
    @Transactional
    public void adicionar(Produto produto) {
        manager.persist(produto);
    }
    
    public List<Produto> buscarTodos() {
        TypedQuery<Produto> query = manager.
                createQuery("select c from Produto c", Produto.class);
        return query.getResultList();
    }

    
    
}
