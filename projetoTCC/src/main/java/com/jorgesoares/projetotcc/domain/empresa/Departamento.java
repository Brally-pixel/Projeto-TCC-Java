package com.jorgesoares.projetotcc.domain.empresa;

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
public class Departamento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  descricao;
    private Date    dataCadastro;
    private String  status;

    @JsonIgnore
    @OneToMany(mappedBy = "Funcionarios")
    private List<Funcionario> funcionarios = new ArrayList<>();

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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Departamento withId(Integer id) {
        this.id = id;
        return this;
    }

    public Departamento withDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Departamento withDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public Departamento withStatus(String status) {
        this.status = status;
        return this;
    }

    public Departamento withFuncionarios(List<Funcionario> funcionarios) {
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
