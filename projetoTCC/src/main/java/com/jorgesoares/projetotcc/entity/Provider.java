package com.jorgesoares.projetotcc.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "PROVIDER")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROVIDER_UID", unique = true, nullable = false, precision = 38)
    private Integer uniqueUid;

    @NotNull
    @Column(name = "COMPANY_NAME", nullable = false)
    private String companyName;

    @NotNull
    @Column(name = "SOCIAL_REASON", nullable = false)
    private String socialReason;

    @NotNull
    @Column(name = "CNPJ", nullable = false)
    private String cnpj;

    @NotNull
    @Column(name = "COMPANY_WEBSITE", nullable = false)
    private String companyWebsite;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_UID")
    private GeneralAddress address;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @NotNull
    @Column(name = "TELEPHONE_NUMBER", nullable = false)
    private String telephoneNumber;

    @NotNull
    @Column(name = "STATUS_PROVIDER", nullable = false)
    private char statusProvider;


    public Integer getUniqueUid() {
        return uniqueUid;
    }

    public void setUniqueUid(Integer uniqueUid) {
        this.uniqueUid = uniqueUid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public GeneralAddress getAddress() {
        return address;
    }

    public void setAddress(GeneralAddress address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public char getStatusProvider() {
        return statusProvider;
    }

    public void setStatusProvider(char statusProvider) {
        this.statusProvider = statusProvider;
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
