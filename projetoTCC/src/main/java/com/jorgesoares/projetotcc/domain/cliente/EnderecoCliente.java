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
    private String endereco;
    private String numero;
    private String complemento;
    private Integer CEP;
    private String bairro;

    @OneToOne
    @JoinColumn(name = "ID_Cliente")
    private CadastroCliente id_nome;

    public EnderecoCliente (){}

    public EnderecoCliente(Integer id, String endereco, String numero, String complemento, Integer CEP, String bairro, CadastroCliente id_nome) {
        this.id = id;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.bairro = bairro;
        this.id_nome = id_nome;
    }

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

    public Integer getCEP() {
        return CEP;
    }

    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public CadastroCliente getId_nome() {
        return id_nome;
    }

    public void setId_nome(CadastroCliente id_nome) {
        this.id_nome = id_nome;
    }
}
