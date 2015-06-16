package com.searcher.esteban.restapi.model;

public class TypeResult {
    private String nombreTraducido;
    private String valorParaFiltro;

    public String getNombreTraducido() {
        return this.nombreTraducido;
    }

    public String getValorParaFiltro() {
        return this.valorParaFiltro;
    }

    public void setNombreTraducido(String paramString) {
        this.nombreTraducido = paramString;
    }

    public void setValorParaFiltro(String paramString) {
        this.valorParaFiltro = paramString;
    }
}

