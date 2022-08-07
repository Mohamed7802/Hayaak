package com.codecaique.hiakk.pojo.response

data class PaymentResponse(
        val buildNumber: String,
        val id: String,
        val ndc: String,
        val result: Result,
        val timestamp: String
)

data class Result(
        val code: String,
        val description: String
)