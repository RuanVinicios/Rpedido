package org.Rpedido.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.Rpedido.modelo.Objeto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ruan
 */
public class ObjetoDAO {

    @PersistenceContext
    private EntityManager manager;

  
    @Transactional
    public void adicionar(Objeto objeto) {
        manager.persist(objeto);
    }

    public List<Objeto> buscarTodos() {
        TypedQuery<Objeto> query = manager.
                createQuery("select c from Objeto c", Objeto.class);
        return query.getResultList();
    }

}
