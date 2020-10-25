package com.example.app_corona;

public class Dados {

    private String pais;
    private String casos;
    private String confirmados;
    private String mortes;
    private String recuperados;
    private String data;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCasos() {
        return casos;
    }

    public void setCasos(String casos) {
        this.casos = casos;
    }

    public String getConfirmados() {
        return confirmados;
    }

    public void setConfirmados(String confirmados) {
        this.confirmados = confirmados;
    }

    public String getMortes() {
        return mortes;
    }

    public void setMortes(String mortes) {
        this.mortes = mortes;
    }

    public String getRecuperados() {
        return recuperados;
    }

    public void setRecuperados(String recuperados) {
        this.recuperados = recuperados;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "pais='" + pais + '\'' +
                ", casos='" + casos + '\'' +
                ", confirmados='" + confirmados + '\'' +
                ", mortes='" + mortes + '\'' +
                ", recuperados='" + recuperados + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
