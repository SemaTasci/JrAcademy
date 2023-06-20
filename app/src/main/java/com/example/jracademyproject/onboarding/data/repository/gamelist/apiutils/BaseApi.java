package com.example.jracademyproject.onboarding.data.repository.gamelist.apiutils;

import com.example.jracademyproject.onboarding.data.repository.gamelist.retrofit.RetrofitBuilder;
import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.Game;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseApi {
    public static final String BASE_URL = "https://api.rawg.io/api/";

    public static ApiService getGameApiService() {
        return RetrofitBuilder.getClient(BASE_URL).create(ApiService.class);
        /*Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiService.class);*/

    }
}

