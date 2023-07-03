package com.example.jracademyproject.onboarding.domain.model.gamedataclasses

import androidx.compose.runtime.Stable
import com.example.jracademyproject.items.GameItem

import com.example.jracademyproject.onboarding.domain.model.resultdataclasses.Result

@Stable
data class GamesUIState(val results: List<com.example.jracademyproject.onboarding.domain.model.resultdataclasses.Result>)

