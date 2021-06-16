package br.com.chocolicia.projetotccjava.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseUid;

    @ManyToOne
    private Provider provider;

    private BigDecimal purchaseValue;

    private LocalDateTime purchaseDate;


    public Purchase() {
    }

    public Purchase(Long purchaseUid, Provider provider, BigDecimal purchaseValue, LocalDateTime purchaseDate) {
        this.purchaseUid = purchaseUid;
        this.provider = provider;
        this.purchaseValue = purchaseValue;
        this.purchaseDate = purchaseDate;
    }


    public Long getPurchaseUid() {
        return purchaseUid;
    }

    public void setPurchaseUid(Long purchaseUid) {
        this.purchaseUid = purchaseUid;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public BigDecimal getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(BigDecimal purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
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
