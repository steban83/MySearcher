package com.searcher.esteban.restapi;

/**
 * Created by ealcalde on 16/06/2015.
 */
public class Settings {

    //http://pisos.searcher.com/mobileWebServices/countries
    private static String PROTOCOL = "http://";
    private static String SECURE_PROTOCOL = "https://";
    private static String AUTHORITY = "pisos.searcher.com";
    private static String PATH = "/mobileWebServices/";
    // private static int VERSION = 1;

    private static String BASE_URL = AUTHORITY.concat(PATH);

    public static String buildUrl(boolean secure) {
        StringBuilder builder = new StringBuilder();
        builder.append(secure ? SECURE_PROTOCOL : PROTOCOL);
        builder.append(BASE_URL);
//        builder.append(VERSION);
        return builder.toString();
    }

}
