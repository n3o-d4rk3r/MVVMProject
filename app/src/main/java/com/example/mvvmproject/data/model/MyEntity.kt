package com.example.mvvmproject.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "medications")
data class MyEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val dose: String?,
    val strength: String
)