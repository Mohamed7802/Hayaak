package com.codecaique.hiakk.pojo.response

data class PaymentStateResponse(
        val buildNumber: String,
        val ndc: String,
        val result: Result,
        val timestamp: String
) {
    data class Result(
            val code: String,
            val description: String
    )
}