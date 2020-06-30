package com.jorgesoares.projetotcc.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "GENERAL_ADDRESS")
public class GeneralAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_UID", unique = true, nullable = false, precision = 38)
    private Integer uniqueUID;

    @NotNull
    @Column(name = "ADDRESS_NAME", nullable = false)
    private String addressName;

    @NotNull
    @Column(name = "NUMBER_HOUSE", nullable = false)
    private String numberHouse;

    @NotNull
    @Column(name = "COMPLEMENT", nullable = false)
    private String complement;

    @NotNull
    @Column(name = "ZIP_CODE", nullable = false)
    private Integer zipCode;

    @NotNull
    @Column(name = "DISTRICT", nullable = false)
    private String district;

    @OneToOne
    @JoinColumn(name = "CITIES")
    private Cidade cities;

    @OneToOne
    @JoinColumn(name = "STATES")
    private Estado states;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
