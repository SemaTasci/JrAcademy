package com.example.jracademyproject.items

import com.example.jracademyproject.onboarding.domain.model.GameDataClass
import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.Game
import com.example.jracademyproject.onboarding.domain.model.resultdataclasses.Result

data class GameItem(val games: List<Game>,
                    val count: Int,
                    val next: String,
                    val previous: Any,
                    val results: List<Result>)
fun GameDataClass.toGameItem()=GameItem(games, count, next, previous, results)
