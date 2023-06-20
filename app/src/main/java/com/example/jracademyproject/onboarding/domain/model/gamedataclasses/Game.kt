package com.example.jracademyproject.onboarding.domain.model.gamedataclasses

import com.example.jracademyproject.onboarding.domain.model.GameDataClass

data class Game(
    val games: List<GameDataClass>,
    val added: Int?,
    val id: Int?,
    val name: String?,
    val slug: String?
)