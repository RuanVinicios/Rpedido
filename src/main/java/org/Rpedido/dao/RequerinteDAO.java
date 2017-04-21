package org.Rpedido.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.Rpedido.modelo.Requerinte;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ruan
 */
public class RequerinteDAO {

    @PersistenceContext
    private EntityManager manager;

  
    @Transactional
    public void adicionar(Requerinte requerinte) {
        manager.persist(requerinte);
    }

    public List<Requerinte> buscarTodos() {
        TypedQuery<Requerinte> query = manager.
                createQuery("select c from Requerinte c", Requerinte.class);
        return query.getResultList();
    }

}
