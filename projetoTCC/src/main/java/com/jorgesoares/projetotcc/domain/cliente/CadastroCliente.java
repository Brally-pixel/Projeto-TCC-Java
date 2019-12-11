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
    private String nome;
    private Date data_Nascimento;
    private Date data_Cadastro;
    private String CPF;
    private String estado_Civil;
    private String sexo;
    private String email;
    private String numero_Telefone;
    private String status;

    @OneToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidades;

    @OneToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

}
