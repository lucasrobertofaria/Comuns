package br.com.lucasfaria.comuns.enums;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public enum DiasDaSemana {
    DOMINGO("Domingo"),
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado");

    private static List<String> lista = null;
    private String descricao;

    DiasDaSemana(String descricao) {
        this.descricao = descricao;
    }

    public static List<String> getNomes() {
        if (lista == null) {
            lista = new ArrayList<>();

            for (DiasDaSemana tipo : DiasDaSemana.values()) {
                lista.add(tipo.getDescricao());
            }

        }
        return lista;
    }

    public static DiasDaSemana getByName(@NonNull final String name) {
        for (DiasDaSemana tc : values()) {
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
