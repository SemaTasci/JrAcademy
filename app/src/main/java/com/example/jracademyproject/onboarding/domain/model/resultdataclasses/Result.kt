package com.example.jracademyproject.onboarding.domain.model.resultdataclasses

import com.example.jracademyproject.onboarding.domain.model.GameDataClass
import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.Game
import com.example.jracademyproject.onboarding.domain.model.resultdataclasses.Result

data class Result(
    val games: List<Game>,
    val games_count: Int,
    val id: Int,
    val image: Any,
    val image_background: String,
    val name: String,
    val slug: String,
    val year_end: Long,
    val year_start: Long
)
