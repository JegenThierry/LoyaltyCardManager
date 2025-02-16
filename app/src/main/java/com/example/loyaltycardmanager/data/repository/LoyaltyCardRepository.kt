package com.example.loyaltycardmanager.data.repository

import com.example.loyaltycardmanager.data.database.LoyaltyCardDao
import com.example.loyaltycardmanager.data.model.LoyaltyCard
import kotlinx.coroutines.flow.Flow

class LoyaltyCardRepository(private val dao: LoyaltyCardDao) {
    val allCards: Flow<List<LoyaltyCard>> = dao.getAllCards()

    suspend fun addCard(card: LoyaltyCard) = dao.insertCard(card)

    suspend fun deleteCard(card: LoyaltyCard) = dao.deleteCard(card)
}