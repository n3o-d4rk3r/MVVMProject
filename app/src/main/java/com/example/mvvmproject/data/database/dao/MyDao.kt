package com.example.mvvmproject.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.mvvmproject.data.model.MyEntity
import retrofit2.http.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MyDao {

    @Query("SELECT * FROM my_table")
    fun getAllData(): Flow<List<MyEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(data: MyEntity)

    @Delete
    suspend fun deleteData(data: MyEntity)

    @Query("DELETE FROM my_table")
    suspend fun deleteAllData()
}
