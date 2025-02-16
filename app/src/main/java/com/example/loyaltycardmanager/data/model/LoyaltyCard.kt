package com.example.loyaltycardmanager.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "loyalty_cards")
data class LoyaltyCard(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val storeName: String,
    val cardNumber: String,
    val barCodeType: String,
    val barcodeValue: String,
)