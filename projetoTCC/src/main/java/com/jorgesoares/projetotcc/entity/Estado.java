package com.jorgesoares.projetotcc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String uf;
    private String nomeEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "nomeEstado")
    private List<Cidade> cidades = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    public Estado withId(Integer id) {
        this.id = id;
        return this;
    }

    public Estado withUf(String uf) {
        this.uf = uf;
        return this;
    }

    public Estado withNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
        return this;
    }

    public Estado withCidades(List<Cidade> cidades) {
        this.cidades = cidades;
        return this;
    }

}
