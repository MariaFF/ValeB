package com.maria.valeb.modelo;

import java.io.Serializable;

/**
 * Created by maria on 06/09/2016.
 */
public class Palavra implements Serializable {

    private static final long serialVersionUID = 1L;
    private String descricao;

    public Palavra(String descricao) {
        this.descricao = descricao;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
