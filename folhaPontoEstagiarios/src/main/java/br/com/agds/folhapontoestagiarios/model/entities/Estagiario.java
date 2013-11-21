/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.agds.folhapontoestagiarios.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Notebook
 */

@Entity
@Table(name = "estagiario")
public class Estagiario implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="id_estagiario")
    private Integer id;
    
    private String nome;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="data_de_inicio")
    private Date dataDeInicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="data_de_saida")
    private Date dataDeSaida;
    
    private Integer matricula;
    
    @OneToOne
    @JoinColumn(name="fk_lotacao", referencedColumnName = "id_lotacao")
    private Lotacao lotacao;

    public Estagiario() {
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

    public Date getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(Date dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }

    public Date getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(Date dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }
}
