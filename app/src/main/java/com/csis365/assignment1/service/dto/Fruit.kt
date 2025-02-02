package com.csis365.assignment1.service.dto

import java.io.Serializable

data class Fruit(
    val genus: String?,
    val name: String?,
    val id: Int?,
    val family: String?,
    val order: String?,
    val nutritions: Nutritions?
):Serializable

data class Nutritions(
    val carbohydrates: Double?,
    val protein: Double?,
    val fat: Double?,
    val calories: Int?,
    val sugar: Double?
):Serializable