package com.searcher.esteban.restapi.model;

public class LastSearch {
    private String description;
    private int idAcceso;
    private String timeAgo;
    private String title;
    private String typeSearch;

    public String getDescription() {
        return this.description;
    }

    public int getIdAcceso() {
        return this.idAcceso;
    }

    public String getTimeAgo() {
        return this.timeAgo;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTypeSearch() {
        return this.typeSearch;
    }

    public void setDescription(String paramString) {
        this.description = paramString;
    }

    public void setIdAcceso(int paramInt) {
        this.idAcceso = paramInt;
    }

    public void setTimeAgo(String paramString) {
        this.timeAgo = paramString;
    }

    public void setTitle(String paramString) {
        this.title = paramString;
    }

    public void setType(String paramString) {
        this.typeSearch = paramString;
    }
}

