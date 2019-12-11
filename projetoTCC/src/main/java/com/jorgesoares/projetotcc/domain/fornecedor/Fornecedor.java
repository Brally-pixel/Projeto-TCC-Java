package com.jorgesoares.projetotcc.domain.fornecedor;

import com.jorgesoares.projetotcc.domain.Cidade;
import com.jorgesoares.projetotcc.domain.Estado;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFornecedor;
    private String  nomeFantasia;
    private String  razaoSocial;
    private String  cnpj;
    private String  siteEmpresa;
    private String  endereco;
    private String  numero;
    private String  complemento;
    private Integer cep;
    private String  bairro;
    private String  email;
    private String  telefone;
    private Date    dataCadastro;
    private String  status;

    @OneToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    public Fornecedor (){}

    public Fornecedor(Integer idFornecedor, String nomeFantasia, String razaoSocial, String cnpj, String siteEmpresa, String endereco, String numero, String complemento, Integer cep, String bairro, String email, String telefone, Date dataCadastro, String status, Cidade cidade, Estado estado) {
        this.idFornecedor = idFornecedor;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.siteEmpresa = siteEmpresa;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.bairro = bairro;
        this.email = email;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
        this.status = status;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSiteEmpresa() {
        return siteEmpresa;
    }

    public void setSiteEmpresa(String siteEmpresa) {
        this.siteEmpresa = siteEmpresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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
