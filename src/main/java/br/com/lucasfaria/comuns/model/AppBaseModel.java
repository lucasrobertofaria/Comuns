package br.com.lucasfaria.comuns.model;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class AppBaseModel implements Serializable {
    private String id;

    @Exclude
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
