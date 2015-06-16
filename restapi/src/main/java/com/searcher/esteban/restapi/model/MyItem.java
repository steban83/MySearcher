package com.searcher.esteban.restapi.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class MyItem
        implements ClusterItem {
    private String description;
    private LatLng mPosition;
    private String mTitle;
    private String mUrl;

    public MyItem(LatLng paramLatLng) {
        this.mPosition = paramLatLng;
    }

    public String getDescription() {
        return this.description;
    }

    public LatLng getPosition() {
        return this.mPosition;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setDescription(String paramString) {
        this.description = paramString;
    }

    public void setTitle(String paramString) {
        this.mTitle = paramString;
    }

    public void setUrl(String paramString) {
        this.mUrl = paramString;
    }
}

