package br.com.lucasfaria.comuns.enums;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public enum TipoContato {
    T("Telefone"),
    E("E-mail"),
    W("Whatsapp"),
    F("Facebook"),
    I("Instagram"),
    S("Site");

    private static List<String> lista = null;
    private String descricao;

    TipoContato(String descricao) {
        this.descricao = descricao;
    }

    public static List<String> getNomes() {
        if (lista == null) {
            lista = new ArrayList<>();

            for (TipoContato tipo : TipoContato.values()) {
                lista.add(tipo.getDescricao());
            }

        }
        return lista;
    }

    public static TipoContato getByName(@NonNull final String name) {
        for (TipoContato tc : values()) {
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
