package com.searcher.esteban.restapi.service;

/**
 * Created by Esteban on 16/06/2015.
 */


import com.searcher.esteban.restapi.model.Country;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Manage countries "http://pisos.searcher.com/mobileWebServices/countries",
 */
public interface ICountryService {

    public static final String PARAM_FECHAPETICION = "fechaPeticion";
    public static final String PARAM_TOKEN = "token";
    public static final String PARAM_LOCALE_USUARIO = "localeUsuario";


    /**
     * get Countries from service
     *
     * @param fechaPeticion
     * @param token
     * @param localeUsuario
     * @param cb
     * @return
     * @throws APIException
     */
    @FormUrlEncoded
    @POST("/countries")
    Void getCountries(@Field(PARAM_FECHAPETICION) String fechaPeticion,
                      @Field(PARAM_TOKEN) String token, @Field(PARAM_LOCALE_USUARIO) String localeUsuario, Callback<ArrayList<Country>> cb) throws APIException;


}

