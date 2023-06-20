package com.example.jracademyproject.onboarding.data.repository.gamelist.apiutils;

import com.example.jracademyproject.onboarding.data.repository.gamelist.retrofit.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("https://api.rawg.io/api/platforms?key=9524433a920c49e39500e812a9339850")
    Call<RetrofitBuilder> gameresponse();
}