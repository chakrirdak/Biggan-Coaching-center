package com.vigyan.coaching.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "school_info")
data class SchoolInfo(
    @PrimaryKey val id: String,
    val name: String,
    val address: String,
    val phone: String?
)
