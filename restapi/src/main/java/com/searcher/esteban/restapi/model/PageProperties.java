package com.searcher.esteban.restapi.model;

public class PageProperties {
    private boolean bannerDestacadosMovil;
    private boolean cabeceraMovil;
    private int numDestacados;
    private boolean tieneBannerDestacados;
    private boolean tieneCabecera;

    public int getNumDestacados() {
        return this.numDestacados;
    }

    public boolean isBannerDestacadosMovil() {
        return this.bannerDestacadosMovil;
    }

    public boolean isCabeceraMovil() {
        return this.cabeceraMovil;
    }

    public boolean isTieneBannerDestacados() {
        return this.tieneBannerDestacados;
    }

    public boolean isTieneCabecera() {
        return this.tieneCabecera;
    }

    public void setBannerDestacadosMovil(boolean paramBoolean) {
        this.bannerDestacadosMovil = paramBoolean;
    }

    public void setCabeceraMovil(boolean paramBoolean) {
        this.cabeceraMovil = paramBoolean;
    }

    public void setNumDestacados(int paramInt) {
        this.numDestacados = paramInt;
    }

    public void setTieneBannerDestacados(boolean paramBoolean) {
        this.tieneBannerDestacados = paramBoolean;
    }

    public void setTieneCabecera(boolean paramBoolean) {
        this.tieneCabecera = paramBoolean;
    }
}
