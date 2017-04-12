/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Rpedido.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ruan
 */
@Entity
public class Produto implements Serializable{
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)

    private int id;
    private String nome;
    private String descricao;
    private String marca;
    private String quantidade;
    private double preco;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    /**
     * @return the Descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param Descrição the Descrição to set
     */
    public void setDescricao(String Descricao) {
        this.descricao = Descricao;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    /**
     * @return the Quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(String Quantidade) {
        this.quantidade = Quantidade;
    }

    /**
     * @return the preço
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString(){
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descrição=" + descricao + ", marca=" + marca + ", quantidade=" + quantidade + ", preço=" + preco + '}';
    }
    
    
    
}
