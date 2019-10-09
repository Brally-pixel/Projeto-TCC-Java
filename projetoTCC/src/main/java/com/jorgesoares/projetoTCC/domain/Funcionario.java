package com.jorgesoares.projetoTCC.domain;

import com.jorgesoares.projetoTCC.domain.enums.NivelEnsino;
import com.jorgesoares.projetoTCC.domain.enums.Turno;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String numero;
    private String complemento;
    private Integer CEP;
    private String bairro;
    private Turno turno;
    private String email;
    private NivelEnsino nivelEnsino;
    private String sexo;
    private Date dataNascimento;
    private String estadoCivil;
    private String numeroTelefone;
    private String statusFuncio;
    private Date dataCadastro;

    @OneToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidades;

    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    public Funcionario() {
    }

    public Funcionario(Integer id, String nome, String cpf, String rg, String endereco, String numero, String complemento, Integer CEP, String bairro, Turno turno, String email, NivelEnsino nivelEnsino, String sexo, Date dataNascimento, String estadoCivil, String numeroTelefone, String statusFuncio, Date dataCadastro, Cidade cidades, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.bairro = bairro;
        this.turno = turno;
        this.email = email;
        this.nivelEnsino = nivelEnsino;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.numeroTelefone = numeroTelefone;
        this.statusFuncio = statusFuncio;
        this.dataCadastro = dataCadastro;
        this.cidades = cidades;
        this.estado = estado;
    }

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
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
