package com.searcher.esteban.restapi.model;

public class Similar {
    private String href;
    private String query_alternative;

    public String getHref() {
        return this.href;
    }

    public String getQuery_alternative() {
        return this.query_alternative;
    }

    public void setHref(String paramString) {
        this.href = paramString;
    }

    public void setQuery_alternative(String paramString) {
        this.query_alternative = paramString;
    }
}
