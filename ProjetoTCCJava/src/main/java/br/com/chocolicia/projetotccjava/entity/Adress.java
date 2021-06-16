package br.com.chocolicia.projetotccjava.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Adress implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adressUid;

    private String address;

    private String number;

    private String complement;

    private String zipCode;

    private String district;

    @ManyToOne
    @JoinColumn(name = "cityUid")
    private City city;

    public Adress() {
    }

    public Adress(Integer adressUid, String address, String number, String complement, String zipCode, String district, City city) {
        this.adressUid = adressUid;
        this.address = address;
        this.number = number;
        this.complement = complement;
        this.zipCode = zipCode;
        this.district = district;
        this.city = city;
    }

    public Integer getAdressUid() {
        return adressUid;
    }

    public void setAdressUid(Integer adressUid) {
        this.adressUid = adressUid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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
