/*package com.example.jracademyproject.onboarding.domain.repository

import com.example.jracademyproject.items.GameItem
import com.example.jracademyproject.items.SpecificGameItem
import com.example.jracademyproject.items.toGameItem
import com.example.jracademyproject.items.toSpecificGameItem
import com.example.jracademyproject.onboarding.presentation.content.ContentService

import javax.inject.Inject

class ContentRepository @Inject constructor(private val contentService: ContentService) {
    suspend fun getContent():List<GameItem>{
        return contentService.getContent().map {
            it.toGameItem()
        }
    }
    suspend fun getContentById(id:Int):SpecificGameItem{
        return contentService.getContentById(id).toSpecificGameItem()
    }
}*/