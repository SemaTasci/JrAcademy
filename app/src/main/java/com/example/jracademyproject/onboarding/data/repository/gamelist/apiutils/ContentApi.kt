package com.example.jracademyproject.onboarding.data.repository.gamelist.apiutils

import com.example.jracademyproject.onboarding.domain.model.GameDataClass
import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.Game
import com.example.jracademyproject.util.Constants.Companion.CONTENT_ENDPOINT
import com.example.jracademyproject.util.Constants.Companion.GAME_ID_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ContentApi {
    @GET (GAME_ID_ENDPOINT)
    suspend fun getContentById(@Query(value = "id") id:Int):
            Response<Game>
    @GET(CONTENT_ENDPOINT)
    suspend fun getContent():Response<List<GameDataClass>>
}
