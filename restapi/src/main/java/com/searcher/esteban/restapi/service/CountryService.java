package com.searcher.esteban.restapi.service;

import com.searcher.esteban.restapi.Settings;
import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by ealcalde on 16/06/2015.
 */
public class CountryService {

/*
    Object localObject = "alutim" + Utilidades.getDateFormatted() + "searcher";
    localObject = EncryptionHelper.getInstance(this.activity).

    ICountryService((String)localObject);
    HashMap localHashMap = new HashMap();
    localHashMap.put("fechaPeticion", Utilidades.getDateFormatted());
    localHashMap.put("token", localObject);
    localHashMap.put("localeUsuario", Locale.getDefault().
*/

    /**
     * Get RestAdapter instance
     *
     * @return
     */
    public static ICountryService getService() {

        /**
         * Add headers in each request
         */
        RequestInterceptor requestInterceptor = new RequestInterceptor() {
            @Override
            public void intercept(RequestInterceptor.RequestFacade request) {
                request.addHeader("Accept", "application/json");
                request.addHeader("Content-Type", "application/json");
            }
        };

        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setReadTimeout(0, TimeUnit.MINUTES);


        return new RestAdapter.Builder()
                .setClient(new OkClient(okHttpClient))
                .setEndpoint(Settings.buildUrl(false))
                .setRequestInterceptor(requestInterceptor)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build()
                .create(ICountryService.class);
    }
}