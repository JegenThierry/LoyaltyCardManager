package com.example.loyaltycardmanager.data.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context
import com.example.loyaltycardmanager.data.model.LoyaltyCard

@Database(entities = [LoyaltyCard::class], version = 1, exportSchema = false)
abstract class LoyaltyCardDatabase : RoomDatabase() {

    abstract fun loyaltyCardDao(): LoyaltyCardDao

    companion object {
        @Volatile
        private var INSTANCE: LoyaltyCardDatabase? = null

        fun getDatabase(context: Context): LoyaltyCardDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LoyaltyCardDatabase::class.java,
                    "loyalty_card_db"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }

}