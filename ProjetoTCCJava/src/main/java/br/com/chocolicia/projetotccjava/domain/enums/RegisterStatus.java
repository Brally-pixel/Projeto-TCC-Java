package br.com.chocolicia.projetotccjava.domain.enums;

public enum RegisterStatus {

    ACTIVE(1L, "Active"),
    INACTIVE(2L, "Inactive");


    private Long code;
    private String name;

    RegisterStatus(Long code, String name) {
        this.code = code;
        this.name = name;
    }
}
