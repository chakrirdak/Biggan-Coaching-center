package com.vigyan.coaching.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class Student(
    @PrimaryKey val id: String,
    val name: String,
    val guardianName: String?,
    val phone: String?,
    val className: String?,
    val joinDate: Long
)
