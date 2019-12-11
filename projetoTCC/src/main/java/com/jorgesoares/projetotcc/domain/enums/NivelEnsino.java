package com.jorgesoares.projetotcc.domain.enums;

public enum NivelEnsino {

    FUNDAMENTAL(1, "Ensino Fundamental"),
    MEDIO(2, "Ensino Medio"),
    GRADUACAO(3, "Graduação"),
    TECNOLOGO(3, "Tecnologo"),
    DOUTORADO(3, "Doutorado");

    private int cod;
    private String descricao;

    private NivelEnsino(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }
    public static NivelEnsino toEnum(Integer cod) {
        if (cod == null){
            return null;
        }
        for (NivelEnsino x : NivelEnsino.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id invalido" + cod);
    }


}
