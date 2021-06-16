package br.com.chocolicia.projetotccjava.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Provider implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long providerUid;

    private String companyName;

    private String socialReason;

    private String cnpj;

    private String companyWebSite;

    private String email;

    @OneToMany
    private List<Adress> adress;

    private LocalDateTime createDate;

    public Provider() {
    }

    public Provider(Long providerUid, String companyName, String socialReason, String cnpj, String companyWebSite, String email, List<Adress> adress, LocalDateTime createDate) {
        this.providerUid = providerUid;
        this.companyName = companyName;
        this.socialReason = socialReason;
        this.cnpj = cnpj;
        this.companyWebSite = companyWebSite;
        this.email = email;
        this.adress = adress;
        this.createDate = createDate;
    }

    public Long getProviderUid() {
        return providerUid;
    }

    public void setProviderUid(Long providerUid) {
        this.providerUid = providerUid;
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

    public String getCompanyWebSite() {
        return companyWebSite;
    }

    public void setCompanyWebSite(String companyWebSite) {
        this.companyWebSite = companyWebSite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public List<Adress> getAdress() {
        return adress;
    }

    public void setAdress(List<Adress> adress) {
        this.adress = adress;
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
