package com.searcher.esteban.restapi.model;

public class Country {
    private String host;
    private int idPais;
    private String locale;
    private String name;

    public String getHost() {
        return this.host;
    }

    public int getIdPais() {
        return this.idPais;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getName() {
        return this.name;
    }

    public void setHost(String paramString) {
        this.host = paramString;
    }

    public void setIdPais(int paramInt) {
        this.idPais = paramInt;
    }

    public void setLocale(String paramString) {
        this.locale = paramString;
    }

    public void setName(String paramString) {
        this.name = paramString;
    }
}

