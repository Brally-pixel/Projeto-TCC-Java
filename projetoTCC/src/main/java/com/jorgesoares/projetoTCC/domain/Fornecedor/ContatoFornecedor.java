package com.jorgesoares.projetoTCC.domain.Fornecedor;

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
    private String nomeContato;
    private String sexo;
    private Integer fax;
    private Date dataContato;
    private String emailContato;
    private String telefone;
    private String celular;
    private String status;

    @JoinColumn(name = "ID_Fornecedor")
    private Fornecedor fornecedor;

    public ContatoFornecedor (){}

    public ContatoFornecedor(Integer idContato, String nomeContato, String sexo, Integer fax, Date dataContato, String emailContato, String telefone, String celular, String status, Fornecedor fornecedor) {
        this.idContato = idContato;
        this.nomeContato = nomeContato;
        this.sexo = sexo;
        this.fax = fax;
        this.dataContato = dataContato;
        this.emailContato = emailContato;
        this.telefone = telefone;
        this.celular = celular;
        this.status = status;
        this.fornecedor = fornecedor;
    }

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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
