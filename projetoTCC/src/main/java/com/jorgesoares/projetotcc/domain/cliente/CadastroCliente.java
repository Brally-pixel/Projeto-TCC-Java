package com.jorgesoares.projetotcc.domain.cliente;

import com.jorgesoares.projetotcc.domain.Cidade;
import com.jorgesoares.projetotcc.domain.Estado;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

public class CadastroCliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String  nome;
    private Date    dataNascimento;
    private Date    dataCadastro;
    private String  cpf;
    private String  estadoCivil;
    private String  sexo;
    private String  email;
    private String  numeroTelefone;
    private String  status;

    @OneToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidades;

    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cidade getCidades() {
        return cidades;
    }

    public void setCidades(Cidade cidades) {
        this.cidades = cidades;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    

        public CadastroCliente withId(Integer id) {
            this.id = id;
            return this;
        }

        public CadastroCliente withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public CadastroCliente withDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public CadastroCliente withDataCadastro(Date dataCadastro) {
            this.dataCadastro = dataCadastro;
            return this;
        }

        public CadastroCliente withCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public CadastroCliente withEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
            return this;
        }

        public CadastroCliente withSexo(String sexo) {
            this.sexo = sexo;
            return this;
        }

        public CadastroCliente withEmail(String email) {
            this.email = email;
            return this;
        }

        public CadastroCliente withNumeroTelefone(String numeroTelefone) {
            this.numeroTelefone = numeroTelefone;
            return this;
        }

        public CadastroCliente withStatus(String status) {
            this.status = status;
            return this;
        }

        public CadastroCliente withCidades(Cidade cidades) {
            this.cidades = cidades;
            return this;
        }

        public CadastroCliente withEstado(Estado estado) {
            this.estado = estado;
            return this;
        }
        
}
