package com.example.jracademyproject.onboarding.domain.model

import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.Game
import com.example.jracademyproject.onboarding.domain.model.resultdataclasses.Result

data class GameDataClass(
    val games: List<Game>,
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)
