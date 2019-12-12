package com.jorgesoares.projetotcc.domain.cliente;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

public class EnderecoCliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  endereco;
    private String  numero;
    private String  complemento;
    private Integer cep;
    private String  bairro;

    @OneToOne
    @JoinColumn(name = "ID_Cliente")
    private CadastroCliente idNome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public CadastroCliente getIdNome() {
        return idNome;
    }

    public void setIdNome(CadastroCliente idNome) {
        this.idNome = idNome;
    }


    public EnderecoCliente withId(Integer id) {
        this.id = id;
        return this;
    }

    public EnderecoCliente withEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public EnderecoCliente withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public EnderecoCliente withComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public EnderecoCliente withCep(Integer cep) {
        this.cep = cep;
        return this;
    }

    public EnderecoCliente withBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public EnderecoCliente withIdNome(CadastroCliente idNome) {
        this.idNome = idNome;
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
