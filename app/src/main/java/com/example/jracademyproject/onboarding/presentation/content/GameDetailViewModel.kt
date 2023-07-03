package com.example.jracademyproject.onboarding.presentation.content

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jracademyproject.onboarding.data.repository.gamelist.apiutils.ApiUtils
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GameDetailViewModel : ViewModel(){

    private val _gameDetailUIState = MutableStateFlow(GameDetailUIState(emptyList()))

    val gameDetailUIState : StateFlow<GameDetailUIState> = _gameDetailUIState

    init {
        viewModelScope.launch {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.rawg.io/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val api = retrofit.create(ApiUtils::class.java)

        }
    }
}