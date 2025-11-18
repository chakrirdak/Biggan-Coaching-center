package com.vigyan.coaching.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import kotlinx.coroutines.flow.Flow
import androidx.room.Query

@Dao
interface SchoolInfoDao {
    @Query("SELECT * FROM school_info LIMIT 1")
    fun getOne(): Flow<SchoolInfo?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(info: SchoolInfo)
}
