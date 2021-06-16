package br.com.chocolicia.projetotccjava.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class PurchaseDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseDetailsUid;

    @ManyToOne
    private Purchase purchase;

    @OneToOne
    private Product product;

    private Integer quantity;

    private BigDecimal unitaryValue;

    private String unity;

    public PurchaseDetails() {
    }

    public PurchaseDetails(Long purchaseDetailsUid, Purchase purchase, Product product, Integer quantity, BigDecimal unitaryValue, String unity) {
        this.purchaseDetailsUid = purchaseDetailsUid;
        this.purchase = purchase;
        this.product = product;
        this.quantity = quantity;
        this.unitaryValue = unitaryValue;
        this.unity = unity;
    }

    public Long getPurchaseDetailsUid() {
        return purchaseDetailsUid;
    }

    public void setPurchaseDetailsUid(Long purchaseDetailsUid) {
        this.purchaseDetailsUid = purchaseDetailsUid;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(BigDecimal unitaryValue) {
        this.unitaryValue = unitaryValue;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
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
