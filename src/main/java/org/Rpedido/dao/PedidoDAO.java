package org.Rpedido.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.Rpedido.modelo.Pedido;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ruan
 */
public class PedidoDAO {

    @PersistenceContext
    private EntityManager manager;

  
    @Transactional
    public void adicionar(Pedido pedido) {
        manager.persist(pedido);
    }

    public List<Pedido> buscarTodos() {
        TypedQuery<Pedido> query = manager.
                createQuery("select c from Pedido c", Pedido.class);
        return query.getResultList();
    }

}
