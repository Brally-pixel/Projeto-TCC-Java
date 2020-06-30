package com.jorgesoares.projetotcc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class DepartamentoRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private Date dataCadastro;
    private String status;

    @JsonIgnore
    @OneToMany(mappedBy = "Funcionarios")
    private List<FuncionarioRequest> funcionarios = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<FuncionarioRequest> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<FuncionarioRequest> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public DepartamentoRequest withId(Integer id) {
        this.id = id;
        return this;
    }

    public DepartamentoRequest withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public DepartamentoRequest withDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public DepartamentoRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    public DepartamentoRequest withFuncionarios(List<FuncionarioRequest> funcionarios) {
        this.funcionarios = funcionarios;
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
