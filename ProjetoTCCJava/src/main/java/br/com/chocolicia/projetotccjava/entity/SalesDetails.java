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
public class SalesDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salesDetailsUid;

    @ManyToOne
    private Sales sales;

    @OneToOne
    private Product product;

    private Integer quantity;

    private BigDecimal unitaryValue;

    public SalesDetails() {
    }

    public SalesDetails(Long salesDetailsUid, Sales sales, Product product, Integer quantity, BigDecimal unitaryValue) {
        this.salesDetailsUid = salesDetailsUid;
        this.sales = sales;
        this.product = product;
        this.quantity = quantity;
        this.unitaryValue = unitaryValue;
    }

    public Long getSalesDetailsUid() {
        return salesDetailsUid;
    }

    public void setSalesDetailsUid(Long salesDetailsUid) {
        this.salesDetailsUid = salesDetailsUid;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
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

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
