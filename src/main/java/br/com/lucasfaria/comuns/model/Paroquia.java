package br.com.lucasfaria.comuns.model;

import java.util.Date;

public class Paroquia extends AppBaseModel {
    private String padroeiro;
    private Date dataFundacao;
    private String historia;

    public String getPadroeiro() {
        return padroeiro;
    }

    public void setPadroeiro(String padroeiro) {
        this.padroeiro = padroeiro;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
