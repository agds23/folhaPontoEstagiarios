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
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Notebook
 */

@Entity
@Table(name = "ponto")
public class Ponto implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="id_ponto")
    private Integer id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="hora_entrada")
    private Date horaEntrada;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="hora_saida")
    private Date horaSaida;
    
    @Column(name="observacao")
    private String Observacao;   

    public Ponto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getObservacao() {
        return Observacao;
    }

    public void setObservacao(String Observacao) {
        this.Observacao = Observacao;
    }
}
