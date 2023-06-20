package com.example.jracademyproject.onboarding.presentation.gamelist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jracademyproject.di.FavoriteDataClass
import com.example.jracademyproject.onboarding.domain.model.GameDataClass
import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.GamesUIState
import com.example.jracademyproject.onboarding.data.repository.gamelist.apiutils.ApiUtils
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GameListViewModel:ViewModel(){


    private val gamesUIState_= MutableStateFlow(GamesUIState(emptyList()))
    val gamesUIState:StateFlow<GamesUIState> = gamesUIState_
    /*val favoriteGames_= List<FavoriteDataClass>(emptyList())
    val favoriteGames:StateFlow<FavoriteDataClass> = favoriteGames_*/

    init {
        viewModelScope.launch {
            val retrofit= Retrofit.Builder()
                .baseUrl("https://api.rawg.io/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val api=retrofit.create(ApiUtils::class.java)

            api.getGameDataClasses().enqueue(object : Callback<GameDataClass> {
                override fun onResponse(call: Call<GameDataClass>,
                                      response: Response<GameDataClass>
                ) {
                    gamesUIState_.update {
                        it.copy(

                            results = response.body()?.results?:emptyList()
                        )
                    }
                }

                override fun onFailure(call: Call<GameDataClass>, t: Throwable) {
                    gamesUIState_.update {
                        it.copy(
                            results = emptyList()
                        )
                    }
                }
            })
        }
    }
}

