package com.example.jracademyproject.di

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import retrofit2.http.DELETE
import retrofit2.http.Query

@Dao
interface FavoriteGameDao {
    @androidx.room.Query
        ("SELECT * FROM favorite_games")

    fun getAllFavoriteGames():List<FavoriteDataClass>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFavoriteGame(favoriteDataClass: FavoriteDataClass)
    @Delete
    fun deleteFavoriteGame(favoriteDataClass: FavoriteDataClass)
}