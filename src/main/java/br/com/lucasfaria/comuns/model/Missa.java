package br.com.lucasfaria.comuns.model;

import java.io.Serializable;
import java.util.Date;

import br.com.lucasfaria.comuns.enums.DiasDaSemana;
import br.com.lucasfaria.comuns.enums.Frequencia;

public class Missa extends AppBaseModel implements Serializable {
    private String titulo;
    private String observacao;
    private Frequencia frequencia;
    private DiasDaSemana diasDaSemana;
    private Date data;
    private String horario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Frequencia getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Frequencia frequencia) {
        this.frequencia = frequencia;
    }

    public DiasDaSemana getDiasDaSemana() {
        return diasDaSemana;
    }

    public void setDiasDaSemana(DiasDaSemana diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
