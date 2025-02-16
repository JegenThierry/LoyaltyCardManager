package com.example.loyaltycardmanager.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.loyaltycardmanager.data.model.LoyaltyCard
import kotlinx.coroutines.flow.Flow

@Dao
interface LoyaltyCardDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCard(card: LoyaltyCard)

    @Query("SELECT * FROM loyalty_cards ORDER BY storeName ASC")
    fun getAllCards(): Flow<List<LoyaltyCard>>

    @Delete
    suspend fun deleteCard(card: LoyaltyCard)
}