package com.assigment.sushil.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.assigment.sushil.model.Article
import com.assigment.sushil.model.ArticleDao

@Database(entities = [Article::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
}