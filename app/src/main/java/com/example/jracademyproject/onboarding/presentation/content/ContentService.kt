package com.example.jracademyproject.onboarding.presentation.content

import com.example.jracademyproject.onboarding.data.repository.gamelist.apiutils.ContentApi
import com.example.jracademyproject.onboarding.domain.model.GameDataClass
import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.Game
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ContentService @Inject constructor(private val contentApi: ContentApi)
{
    suspend fun getContent():List<GameDataClass>{
        return withContext(Dispatchers.IO) {
            val content = contentApi.getContent()
            (content.body() ?: emptyList()) as List<GameDataClass>
        }
    }
    suspend fun getContentById(id:Int): Game {
        return withContext(Dispatchers.IO) {
            val contents = contentApi.getContentById(id)
            contents.body()!!
        }
    }
}