package com.jorgesoares.projetoTCC.domain.enums;

public enum Turno {

    MANHA(1, "Manhã"),
    TARDE(2, "Tarde"),
    NOITE(3, "Noite");

    private int cod;
    private String descricao;

    private Turno(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }
    public static Turno toEnum(Integer cod) {
        if (cod == null){
            return null;
        }
        for (Turno x : Turno.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id invalido" + cod);
    }


}
