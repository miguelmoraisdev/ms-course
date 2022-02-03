package com.miguelm.hrpayroll.entities

data class Payment(

    var name: String,
    var dailyIncome: Double,
    var days: Int

) {
    fun getTotal(): Double {
        return days * dailyIncome
    }
}
