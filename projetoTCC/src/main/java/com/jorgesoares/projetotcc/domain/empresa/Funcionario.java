package com.jorgesoares.projetotcc.domain.empresa;

import com.jorgesoares.projetotcc.domain.Cidade;
import com.jorgesoares.projetotcc.domain.Estado;
import com.jorgesoares.projetotcc.domain.enums.NivelEnsino;
import com.jorgesoares.projetotcc.domain.enums.Turno;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer     id;
    private String      nome;
    private String      cpf;
    private String      rg;
    private String      endereco;
    private String      numero;
    private String      complemento;
    private Integer     cep;
    private String      bairro;
    private Turno       turno;
    private String      email;
    private NivelEnsino nivelEnsino;
    private String      sexo;
    private Date        dataNascimento;
    private String      estadoCivil;
    private String      numeroTelefone;
    private String      statusFuncio;
    private Date        dataCadastro;

    @OneToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NivelEnsino getNivelEnsino() {
        return nivelEnsino;
    }

    public void setNivelEnsino(NivelEnsino nivelEnsino) {
        this.nivelEnsino = nivelEnsino;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getStatusFuncio() {
        return statusFuncio;
    }

    public void setStatusFuncio(String statusFuncio) {
        this.statusFuncio = statusFuncio;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Funcionario withId(Integer id) {
        this.id = id;
        return this;
    }

    public Funcionario withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Funcionario withCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public Funcionario withRg(String rg) {
        this.rg = rg;
        return this;
    }

    public Funcionario withEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public Funcionario withNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public Funcionario withComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public Funcionario withCep(Integer cep) {
        this.cep = cep;
        return this;
    }

    public Funcionario withBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public Funcionario withTurno(Turno turno) {
        this.turno = turno;
        return this;
    }

    public Funcionario withEmail(String email) {
        this.email = email;
        return this;
    }

    public Funcionario withNivelEnsino(NivelEnsino nivelEnsino) {
        this.nivelEnsino = nivelEnsino;
        return this;
    }

    public Funcionario withSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    public Funcionario withDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public Funcionario withEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public Funcionario withNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        return this;
    }

    public Funcionario withStatusFuncio(String statusFuncio) {
        this.statusFuncio = statusFuncio;
        return this;
    }

    public Funcionario withDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public Funcionario withCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }

    public Funcionario withEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public Funcionario withDepartamento(Departamento departamento) {
        this.departamento = departamento;
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
