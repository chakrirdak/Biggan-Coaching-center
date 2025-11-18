package com.vigyan.coaching.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Student::class, SchoolInfo::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun studentDao(): StudentDao
    abstract fun schoolInfoDao(): SchoolInfoDao
}
