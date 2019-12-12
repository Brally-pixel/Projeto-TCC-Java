package com.jorgesoares.projetotcc.domain.fornecedor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import java.io.Serializable;
import java.util.Date;

public class ContatoFornecedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContato;
    private String  nomeContato;
    private String  sexo;
    private Integer fax;
    private Date    dataContato;
    private String  emailContato;
    private String  telefone;
    private String  celular;
    private String  status;

    @JoinColumn(name = "ID_Fornecedor")
    private Fornecedor fornecedor;

    public Integer getIdContato() {
        return idContato;
    }

    public void setIdContato(Integer idContato) {
        this.idContato = idContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getFax() {
        return fax;
    }

    public void setFax(Integer fax) {
        this.fax = fax;
    }

    public Date getDataContato() {
        return dataContato;
    }

    public void setDataContato(Date dataContato) {
        this.dataContato = dataContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ContatoFornecedor withIdContato(Integer idContato) {
        this.idContato = idContato;
        return this;
    }

    public ContatoFornecedor withNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
        return this;
    }

    public ContatoFornecedor withSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public ContatoFornecedor withFax(Integer fax) {
        this.fax = fax;
        return this;
    }

    public ContatoFornecedor withDataContato(Date dataContato) {
        this.dataContato = dataContato;
        return this;
    }

    public ContatoFornecedor withEmailContato(String emailContato) {
        this.emailContato = emailContato;
        return this;
    }

    public ContatoFornecedor withTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public ContatoFornecedor withCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public ContatoFornecedor withStatus(String status) {
        this.status = status;
        return this;
    }

    public ContatoFornecedor withFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
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
