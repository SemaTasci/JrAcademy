package com.example.jracademyproject.onboarding.data.repository.gamelist.retrofit;

import static com.example.jracademyproject.onboarding.data.repository.gamelist.apiutils.BaseApi.getGameApiService;

import com.example.jracademyproject.onboarding.data.repository.gamelist.apiutils.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {


            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.rawg.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;

    }
}
