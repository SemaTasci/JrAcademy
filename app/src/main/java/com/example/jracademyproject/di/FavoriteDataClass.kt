package com.example.jracademyproject.di

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FavoriteDataClass(
    @PrimaryKey val id:Int,
    val imageResId:Int,
    val name:String,
    val favoriteresult: List<com.example.jracademyproject.onboarding.domain.model.resultdataclasses.Result>
)
