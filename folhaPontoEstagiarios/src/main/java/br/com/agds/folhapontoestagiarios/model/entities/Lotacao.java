/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agds.folhapontoestagiarios.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Notebook
 */

@Entity
@Table(name = "lotacao")
public class Lotacao implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="id_lotacao")
    private Integer id;
    
    @Column(name="nome")
    private String nome;
    
    public Lotacao() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
