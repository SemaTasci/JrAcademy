package com.example.jracademyproject.onboarding.data.repository.gamelist.apiutils

import com.example.jracademyproject.onboarding.domain.model.GameDataClass
import retrofit2.Call
import retrofit2.http.GET

interface ApiUtils {
    @GET("platforms?key=9524433a920c49e39500e812a9339850")
    fun getGameDataClasses(): Call<GameDataClass>
}