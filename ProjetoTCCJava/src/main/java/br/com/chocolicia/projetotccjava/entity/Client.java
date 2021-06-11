package br.com.chocolicia.projetotccjava.entity;

import br.com.chocolicia.projetotccjava.domain.enums.MaritalStatus;
import br.com.chocolicia.projetotccjava.domain.enums.RegisterStatus;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientUid;
    private String name;
    private String bithDate;
    private String cpf;
    private MaritalStatus maritalStatus;
    private String gender;
    private RegisterStatus registerStatus;


    public Client() {
    }

    public Client(Long clientUid, String name, String bithDate, String cpf, MaritalStatus maritalStatus, String gender, RegisterStatus registerStatus) {
        this.clientUid = clientUid;
        this.name = name;
        this.bithDate = bithDate;
        this.cpf = cpf;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.registerStatus = registerStatus;
    }


    public Long getClientUid() {
        return clientUid;
    }

    public void setClientUid(Long clientUid) {
        this.clientUid = clientUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBithDate() {
        return bithDate;
    }

    public void setBithDate(String bithDate) {
        this.bithDate = bithDate;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public RegisterStatus getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(RegisterStatus registerStatus) {
        this.registerStatus = registerStatus;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
