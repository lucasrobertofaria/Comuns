package br.com.lucasfaria.comuns.enums;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public enum Frequencia {
    D("Diário"),
    S("Semanal"),
    M("Mensal"),
    A("Anual"),
    U("Única vez");

    private static List<String> lista = null;
    private String descricao;

    Frequencia(String descricao) {
        this.descricao = descricao;
    }

    public static List<String> getNomes() {
        if (lista == null) {
            lista = new ArrayList<>();

            for (Frequencia tipo : Frequencia.values()) {
                lista.add(tipo.getDescricao());
            }

        }
        return lista;
    }

    public static Frequencia getByName(@NonNull final String name) {
        for (Frequencia tc : values()) {
            if (name.equals(tc.getDescricao())) {
                return tc;
            }
        }
        return null;
    }

    public String toString() {
        return descricao;
    }

    public String getDescricao() {
        return descricao;
    }


}
