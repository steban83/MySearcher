package com.searcher.esteban.restapi.model;

import java.util.LinkedList;

public class Adverts {
    private String area;
    private String currency;
    private LinkedList<Advert> items;
    private String query;
    private String queryAdsense;
    private int resultsPage;
    private int resultsTotal;
    private boolean trackClickInApp;

    public String getArea() {
        return this.area;
    }

    public String getCurrency() {
        return this.currency;
    }

    public LinkedList<Advert> getItems() {
        return this.items;
    }

    public String getQuery() {
        return this.query;
    }

    public String getQueryAdsense() {
        return this.queryAdsense;
    }

    public int getResultsPage() {
        return this.resultsPage;
    }

    public int getResultsTotal() {
        return this.resultsTotal;
    }

    public boolean isTrackClickInApp() {
        return this.trackClickInApp;
    }

    public void setArea(String paramString) {
        this.area = paramString;
    }

    public void setCurrency(String paramString) {
        this.currency = paramString;
    }

    public void setItems(LinkedList<Advert> paramLinkedList) {
        this.items = paramLinkedList;
    }

    public void setQuery(String paramString) {
        this.query = paramString;
    }

    public void setQueryAdsense(String paramString) {
        this.queryAdsense = paramString;
    }

    public void setResultsPage(int paramInt) {
        this.resultsPage = paramInt;
    }

    public void setResultsTotal(int paramInt) {
        this.resultsTotal = paramInt;
    }

    public void setTrackClickInApp(boolean paramBoolean) {
        this.trackClickInApp = paramBoolean;
    }
}
