package com.example.jracademyproject.di

import androidx.room.RoomDatabase

@androidx.room.Database(entities = [FavoriteDataClass::class], version = 1)
abstract class AppDatabase :RoomDatabase() {
    abstract fun favoriteGameDao():FavoriteGameDao
}