package com.jorgesoares.projetotcc.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

public class PagamentoFuncionarioRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double valor;
    private Date data;
    private String situacao;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private FuncionarioRequest funcionario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public FuncionarioRequest getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioRequest funcionario) {
        this.funcionario = funcionario;
    }


    public PagamentoFuncionarioRequest withId(Integer id) {
        this.id = id;
        return this;
    }

    public PagamentoFuncionarioRequest withValor(Double valor) {
        this.valor = valor;
        return this;
    }

    public PagamentoFuncionarioRequest withData(Date data) {
        this.data = data;
        return this;
    }

    public PagamentoFuncionarioRequest withSituacao(String situacao) {
        this.situacao = situacao;
        return this;
    }

    public PagamentoFuncionarioRequest withFuncionario(FuncionarioRequest funcionario) {
        this.funcionario = funcionario;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
