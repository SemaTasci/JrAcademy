package com.example.jracademyproject.items

import com.example.jracademyproject.onboarding.domain.model.GameDataClass
import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.Game

data class SpecificGameItem(val games: List<GameDataClass>,
                            val added: Int?,
                            val id: Int?,
                            val name: String?,
                            val slug: String?)

fun Game.toSpecificGameItem()=
    SpecificGameItem(games,added,id,name,slug)