package br.com.chocolicia.projetotccjava.domain.enums;

public enum LevelEducation {

    ELEMENTARY_SCHOOL(1L, "Elementary School"),
    MIDDLE_SCHOOL(2L, "Middle School"),
    HIGH_SCHOOL(3L, "High School"),
    COLLEGE(4L, "College"),
    MASTERS(4L, "Master’s"),
    DOCTORATE(5L, "Doctorate");


    private Long code;
    private String name;

    LevelEducation(Long code, String name) {
        this.code = code;
        this.name = name;
    }

}
