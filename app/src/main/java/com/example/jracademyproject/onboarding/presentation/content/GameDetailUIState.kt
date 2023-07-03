package com.example.jracademyproject.onboarding.presentation.content

import androidx.compose.runtime.Stable
import com.example.jracademyproject.onboarding.domain.model.gamedataclasses.Game
import com.example.jracademyproject.onboarding.domain.model.resultdataclasses.Result


@Stable
data class GameDetailUIState(val game: List<Game>)
