package br.com.chocolicia.projetotccjava.domain.enums;

public enum MaritalStatus {

    MARRIED(1L, "Married"),
    SINGLE(2L, "Single"),
    DIVORCED(3L, "Divorced"),
    WIDOWER(4L, "Widower");


    private Long code;
    private String name;

    MaritalStatus(Long code, String name) {
        this.code = code;
        this.name = name;
    }
}
