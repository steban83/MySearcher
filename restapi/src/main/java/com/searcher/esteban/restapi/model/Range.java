package com.searcher.esteban.restapi.model;

public class Range {
    private String extremo;
    private String intervalo;
    private String rangoMaximo;
    private String rangoMaximoDef;
    private String rangoMinimo;
    private String rangoMinimoDef;

    public String getExtremo() {
        return this.extremo;
    }

    public String getIntervalo() {
        return this.intervalo;
    }

    public String getRangoMaximo() {
        return this.rangoMaximo;
    }

    public String getRangoMaximoDef() {
        return this.rangoMaximoDef;
    }

    public String getRangoMinimo() {
        return this.rangoMinimo;
    }

    public String getRangoMinimoDef() {
        return this.rangoMinimoDef;
    }

    public void setExtremo(String paramString) {
        this.extremo = paramString;
    }

    public void setIntervalo(String paramString) {
        this.intervalo = paramString;
    }

    public void setRangoMaximo(String paramString) {
        this.rangoMaximo = paramString;
    }

    public void setRangoMaximoDef(String paramString) {
        this.rangoMaximoDef = paramString;
    }

    public void setRangoMinimo(String paramString) {
        this.rangoMinimo = paramString;
    }

    public void setRangoMinimoDef(String paramString) {
        this.rangoMinimoDef = paramString;
    }
}
