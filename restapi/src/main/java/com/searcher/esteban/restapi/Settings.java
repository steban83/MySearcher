package com.searcher.esteban.restapi;

import android.support.annotation.NonNull;
/**
 * Created by ealcalde on 16/06/2015.
 */
public class Settings {

    //http://pisos.searcher.com/mobileWebServices/countries
    @NonNull
    private static String PROTOCOL = "http://";
    @NonNull
    private static String SECURE_PROTOCOL = "https://";
    @NonNull
    private static String AUTHORITY = "pisos.searcher.com";
    @NonNull
    private static String PATH = "/mobileWebServices/";

    @NonNull
    private static String BASE_URL = AUTHORITY.concat(PATH);

    @NonNull
    public static String buildUrl(boolean secure) {
        return (secure ? SECURE_PROTOCOL : PROTOCOL) + BASE_URL;
    }
}
