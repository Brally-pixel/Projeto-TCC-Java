package br.com.chocolicia.projetotccjava.entity;

import br.com.chocolicia.projetotccjava.domain.enums.SpecialDate;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productUid;

    private String description;

    private BigDecimal price;

    private Long quantity;

    private String flavor;

    private String unit;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Provider provider;

    private SpecialDate specialDate;

    public Product() {
    }

    public Product(Long productUid, String description, BigDecimal price, Long quantity, String flavor, String unit, Provider provider, SpecialDate specialDate) {
        this.productUid = productUid;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.flavor = flavor;
        this.unit = unit;
        this.provider = provider;
        this.specialDate = specialDate;
    }


    public Long getProductUid() {
        return productUid;
    }

    public void setProductUid(Long productUid) {
        this.productUid = productUid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public SpecialDate getSpecialDate() {
        return specialDate;
    }

    public void setSpecialDate(SpecialDate specialDate) {
        this.specialDate = specialDate;
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
