package org.Rpedido.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.Rpedido.modelo.Funcionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ruan
 */
public class FuncionarioDAO {

    @PersistenceContext
    private EntityManager manager;

  
    @Transactional
    public void adicionar(Funcionario funcionario) {
        manager.persist(funcionario);
    }
    
  
     

    public List<Funcionario> buscarTodos() {
        TypedQuery<Funcionario> query = manager.
                createQuery("select c from Funcionario c", Funcionario.class);
        return query.getResultList();
    }

}
